package typings.atPulumiKubernetes.typesInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.APIGroup
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.APIResource
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.GroupVersionForDiscovery
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.LabelSelectorRequirement
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ManagedFieldsEntry
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.OwnerReference
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.Preconditions
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ServerAddressByClientCIDR
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.StatusCause
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.StatusDetails
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "meta")
@js.native
object metaNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * APIGroup contains the name, the supported versions, and the preferred version of a group.
      */
    trait APIGroup extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * name is the name of the group.
        */
      var name: Input[String]
      /**
        * preferredVersion is the version preferred by the API server, which probably is the storage
        * version.
        */
      var preferredVersion: js.UndefOr[Input[GroupVersionForDiscovery]] = js.undefined
      /**
        * a map of client CIDR to server address that is serving this group. This is to help clients
        * reach servers in the most network-efficient way possible. Clients can use the appropriate
        * server address as per the CIDR that they match. In case of multiple matches, clients should
        * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
        * client can match. For example: the master will return an internal IP CIDR only, if the
        * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
        * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
        */
      var serverAddressByClientCIDRs: js.UndefOr[Input[js.Array[Input[ServerAddressByClientCIDR]]]] = js.undefined
      /**
        * versions are the versions supported in this group.
        */
      var versions: Input[js.Array[Input[GroupVersionForDiscovery]]]
    }
    
    /**
      * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
      */
    trait APIGroupList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * groups is a list of APIGroup.
        */
      var groups: Input[js.Array[Input[APIGroup]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * APIResource specifies the name of a resource and whether it is namespaced.
      */
    trait APIResource extends js.Object {
      /**
        * categories is a list of the grouped resources this resource belongs to (e.g. 'all')
        */
      var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * group is the preferred group of the resource.  Empty implies the group of the containing
        * resource list. For subresources, this may have a different value, for example: Scale".
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      /**
        * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
        */
      var kind: Input[String]
      /**
        * name is the plural name of the resource.
        */
      var name: Input[String]
      /**
        * namespaced indicates if a resource is namespaced or not.
        */
      var namespaced: Input[Boolean]
      /**
        * shortNames is a list of suggested short names of the resource.
        */
      var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * singularName is the singular name of the resource.  This allows clients to handle plural
        * and singular opaquely. The singularName is more correct for reporting status on a single
        * item and both singular and plural are allowed from the kubectl CLI interface.
        */
      var singularName: Input[String]
      /**
        * The hash value of the storage version, the version this resource is converted to when
        * written to the data store. Value must be treated as opaque by clients. Only equality
        * comparison on the value is valid. This is an alpha feature and may change or be removed in
        * the future. The field is populated by the apiserver only if the StorageVersionHash feature
        * gate is enabled. This field will remain optional even if it graduates.
        */
      var storageVersionHash: js.UndefOr[Input[String]] = js.undefined
      /**
        * verbs is a list of supported kube verbs (this includes get, list, watch, create, update,
        * patch, delete, deletecollection, and proxy)
        */
      var verbs: Input[js.Array[Input[String]]]
      /**
        * version is the preferred version of the resource.  Empty implies the version of the
        * containing resource list For subresources, this may have a different value, for example: v1
        * (while inside a v1beta1 version of the core resource's group)".
        */
      var version: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * APIResourceList is a list of APIResource, it is used to expose the name of the resources
      * supported in a specific group and version, and if the resource is namespaced.
      */
    trait APIResourceList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * groupVersion is the group and version this APIResourceList is for.
        */
      var groupVersion: Input[String]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * resources contains the name of the resources and if they are namespaced.
        */
      var resources: Input[js.Array[Input[APIResource]]]
    }
    
    /**
      * APIVersions lists the versions that are available, to allow clients to discover the API at
      * /api, which is the root path of the legacy v1 API.
      */
    trait APIVersions extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * a map of client CIDR to server address that is serving this group. This is to help clients
        * reach servers in the most network-efficient way possible. Clients can use the appropriate
        * server address as per the CIDR that they match. In case of multiple matches, clients should
        * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
        * client can match. For example: the master will return an internal IP CIDR only, if the
        * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
        * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
        */
      var serverAddressByClientCIDRs: Input[js.Array[Input[ServerAddressByClientCIDR]]]
      /**
        * versions are the api versions that are available.
        */
      var versions: Input[js.Array[Input[String]]]
    }
    
    /**
      * DeleteOptions may be provided when deleting an API object.
      */
    trait DeleteOptions extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * When present, indicates that modifications should not be persisted. An invalid or
        * unrecognized dryRun directive will result in an error response and no further processing of
        * the request. Valid values are: - All: all dry run stages will be processed
        */
      var dryRun: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * The duration in seconds before the object should be deleted. Value must be non-negative
        * integer. The value zero indicates delete immediately. If this value is nil, the default
        * grace period for the specified type will be used. Defaults to a per object value if not
        * specified. zero means delete immediately.
        */
      var gracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should
        * the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added
        * to/removed from the object's finalizers list. Either this field or PropagationPolicy may be
        * set, but not both.
        */
      var orphanDependents: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status
        * will be returned.
        */
      var preconditions: js.UndefOr[Input[Preconditions]] = js.undefined
      /**
        * Whether and how garbage collection will be performed. Either this field or OrphanDependents
        * may be set, but not both. The default policy is decided by the existing finalizer set in
        * the metadata.finalizers and the resource-specific default policy. Acceptable values are:
        * 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the
        * dependents in the background; 'Foreground' - a cascading policy that deletes all dependents
        * in the foreground.
        */
      var propagationPolicy: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * GroupVersion contains the "group/version" and "version" string of a version. It is made a
      * struct to keep extensibility.
      */
    trait GroupVersionForDiscovery extends js.Object {
      /**
        * groupVersion specifies the API group and version in the form "group/version"
        */
      var groupVersion: Input[String]
      /**
        * version specifies the version in the form of "version". This is to save the clients the
        * trouble of splitting the GroupVersion.
        */
      var version: Input[String]
    }
    
    /**
      * A label selector is a label query over a set of resources. The result of matchLabels and
      * matchExpressions are ANDed. An empty label selector matches all objects. A null label
      * selector matches no objects.
      */
    trait LabelSelector extends js.Object {
      /**
        * matchExpressions is a list of label selector requirements. The requirements are ANDed.
        */
      var matchExpressions: js.UndefOr[Input[js.Array[Input[LabelSelectorRequirement]]]] = js.undefined
      /**
        * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is
        * equivalent to an element of matchExpressions, whose key field is "key", the operator is
        * "In", and the values array contains only "value". The requirements are ANDed.
        */
      var matchLabels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    }
    
    /**
      * A label selector requirement is a selector that contains values, a key, and an operator that
      * relates the key and values.
      */
    trait LabelSelectorRequirement extends js.Object {
      /**
        * key is the label key that the selector applies to.
        */
      var key: Input[String]
      /**
        * operator represents a key's relationship to a set of values. Valid operators are In, NotIn,
        * Exists and DoesNotExist.
        */
      var operator: Input[String]
      /**
        * values is an array of string values. If the operator is In or NotIn, the values array must
        * be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty.
        * This array is replaced during a strategic merge patch.
        */
      var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    }
    
    /**
      * ListMeta describes metadata that synthetic resources must have, including lists and various
      * status objects. A resource may have only one of {ObjectMeta, ListMeta}.
      */
    trait ListMeta extends js.Object {
      /**
        * continue may be set if the user set a limit on the number of items returned, and indicates
        * that the server has more data available. The value is opaque and may be used to issue
        * another request to the endpoint that served this list to retrieve the next set of available
        * objects. Continuing a consistent list may not be possible if the server configuration has
        * changed or more than a few minutes have passed. The resourceVersion field returned when
        * using this continue value will be identical to the value in the first response, unless you
        * have received this token from an error message.
        */
      var continue: js.UndefOr[Input[String]] = js.undefined
      /**
        * remainingItemCount is the number of subsequent items in the list which are not included in
        * this list response. If the list request contained label or field selectors, then the number
        * of remaining items is unknown and the field will be left unset and omitted during
        * serialization. If the list is complete (either because it is not chunking or because this
        * is the last chunk), then there are no more remaining items and this field will be left
        * unset and omitted during serialization. Servers older than v1.15 do not set this field. The
        * intended use of the remainingItemCount is *estimating* the size of a collection. Clients
        * should not rely on the remainingItemCount to be set or to be exact.
        */
      var remainingItemCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * String that identifies the server's internal version of this object that can be used by
        * clients to determine when objects have changed. Value must be treated as opaque by clients
        * and passed unmodified back to the server. Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * selfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is
        * planned to be removed in 1.21 release.
        */
      var selfLink: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that
      * the fieldset applies to.
      */
    trait ManagedFieldsEntry extends js.Object {
      /**
        * APIVersion defines the version of this resource that this field set applies to. The format
        * is "group/version" just like the top-level APIVersion field. It is necessary to track the
        * version of a field set because it cannot be automatically converted.
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * FieldsType is the discriminator for the different fields format and version. There is
        * currently only one possible value: "FieldsV1"
        */
      var fieldsType: js.UndefOr[Input[String]] = js.undefined
      /**
        * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
        */
      var fieldsV1: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Manager is an identifier of the workflow managing these fields.
        */
      var manager: js.UndefOr[Input[String]] = js.undefined
      /**
        * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The
        * only valid values for this field are 'Apply' and 'Update'.
        */
      var operation: js.UndefOr[Input[String]] = js.undefined
      /**
        * Time is timestamp of when these fields were set. It should always be empty if Operation is
        * 'Apply'
        */
      var time: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ObjectMeta is metadata that all persisted resources must have, which includes all objects
      * users must create.
      */
    trait ObjectMeta extends js.Object {
      /**
        * Annotations is an unstructured key value map stored with a resource that may be set by
        * external tools to store and retrieve arbitrary metadata. They are not queryable and should
        * be preserved when modifying objects. More info:
        * http://kubernetes.io/docs/user-guide/annotations
        */
      var annotations: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      /**
        * The name of the cluster which the object belongs to. This is used to distinguish resources
        * with same name and namespace in different clusters. This field is not set anywhere right
        * now and apiserver is going to ignore it if set in create or update request.
        */
      var clusterName: js.UndefOr[Input[String]] = js.undefined
      /**
        * CreationTimestamp is a timestamp representing the server time when this object was created.
        * It is not guaranteed to be set in happens-before order across separate operations. Clients
        * may not set this value. It is represented in RFC3339 form and is in UTC.
        *
        * Populated by the system. Read-only. Null for lists. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var creationTimestamp: js.UndefOr[Input[String]] = js.undefined
      /**
        * Number of seconds allowed for this object to gracefully terminate before it will be removed
        * from the system. Only set when deletionTimestamp is also set. May only be shortened.
        * Read-only.
        */
      var deletionGracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This
        * field is set by the server when a graceful deletion is requested by the user, and is not
        * directly settable by a client. The resource is expected to be deleted (no longer visible
        * from resource lists, and not reachable by name) after the time in this field, once the
        * finalizers list is empty. As long as the finalizers list contains items, deletion is
        * blocked. Once the deletionTimestamp is set, this value may not be unset or be set further
        * into the future, although it may be shortened or the resource may be deleted prior to this
        * time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will
        * react by sending a graceful termination signal to the containers in the pod. After that 30
        * seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and
        * after cleanup, remove the pod from the API. In the presence of network partitions, this
        * object may still exist after this timestamp, until an administrator or automated process
        * can determine the resource is fully terminated. If not set, graceful deletion of the object
        * has not been requested.
        *
        * Populated by the system when a graceful deletion is requested. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var deletionTimestamp: js.UndefOr[Input[String]] = js.undefined
      /**
        * Must be empty before the object is deleted from the registry. Each entry is an identifier
        * for the responsible component that will remove the entry from the list. If the
        * deletionTimestamp of the object is non-nil, entries in this list can only be removed.
        */
      var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF
        * the Name field has not been provided. If this field is used, the name returned to the
        * client will be different than the name passed. This value will also be combined with a
        * unique suffix. The provided value has the same validation rules as the Name field, and may
        * be truncated by the length of the suffix required to make the value unique on the server.
        *
        * If this field is specified and the generated name exists, the server will NOT return a 409
        * - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a
        * unique name could not be found in the time allotted, and the client should retry
        * (optionally after the time indicated in the Retry-After header).
        *
        * Applied only if Name is not specified. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
        */
      var generateName: js.UndefOr[Input[String]] = js.undefined
      /**
        * A sequence number representing a specific generation of the desired state. Populated by the
        * system. Read-only.
        */
      var generation: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Map of string keys and values that can be used to organize and categorize (scope and
        * select) objects. May match selectors of replication controllers and services. More info:
        * http://kubernetes.io/docs/user-guide/labels
        */
      var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      /**
        * ManagedFields maps workflow-id and version to the set of fields that are managed by that
        * workflow. This is mostly for internal housekeeping, and users typically shouldn't need to
        * set or understand this field. A workflow can be the user's name, a controller's name, or
        * the name of a specific apply path like "ci-cd". The set of fields is always in the version
        * that the workflow used when modifying the object.
        */
      var managedFields: js.UndefOr[Input[js.Array[Input[ManagedFieldsEntry]]]] = js.undefined
      /**
        * Name must be unique within a namespace. Is required when creating resources, although some
        * resources may allow a client to request the generation of an appropriate name
        * automatically. Name is primarily intended for creation idempotence and configuration
        * definition. Cannot be updated. More info:
        * http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      /**
        * Namespace defines the space within each name must be unique. An empty namespace is
        * equivalent to the "default" namespace, but "default" is the canonical representation. Not
        * all objects are required to be scoped to a namespace - the value of this field for those
        * objects will be empty.
        *
        * Must be a DNS_LABEL. Cannot be updated. More info:
        * http://kubernetes.io/docs/user-guide/namespaces
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
      /**
        * List of objects depended by this object. If ALL objects in the list have been deleted, this
        * object will be garbage collected. If this object is managed by a controller, then an entry
        * in this list will point to this controller, with the controller field set to true. There
        * cannot be more than one managing controller.
        */
      var ownerReferences: js.UndefOr[Input[js.Array[Input[OwnerReference]]]] = js.undefined
      /**
        * An opaque value that represents the internal version of this object that can be used by
        * clients to determine when objects have changed. May be used for optimistic concurrency,
        * change detection, and the watch operation on a resource or set of resources. Clients must
        * treat these values as opaque and passed unmodified back to the server. They may only be
        * valid for a particular resource or set of resources.
        *
        * Populated by the system. Read-only. Value must be treated as opaque by clients and . More
        * info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * SelfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is
        * planned to be removed in 1.21 release.
        */
      var selfLink: js.UndefOr[Input[String]] = js.undefined
      /**
        * UID is the unique in time and space value for this object. It is typically generated by the
        * server on successful creation of a resource and is not allowed to change on PUT operations.
        *
        * Populated by the system. Read-only. More info:
        * http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * OwnerReference contains enough information to let you identify an owning object. An owning
      * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
      * namespace field.
      */
    trait OwnerReference extends js.Object {
      /**
        * API version of the referent.
        */
      var apiVersion: Input[String]
      /**
        * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
        * deleted from the key-value store until this reference is removed. Defaults to false. To set
        * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable
        * Entity) will be returned.
        */
      var blockOwnerDeletion: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * If true, this reference points to the managing controller.
        */
      var controller: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Kind of the referent. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: Input[String]
      /**
        * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: Input[String]
      /**
        * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: Input[String]
    }
    
    /**
      * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
      */
    trait Preconditions extends js.Object {
      /**
        * Specifies the target ResourceVersion
        */
      var resourceVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Specifies the target UID.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ServerAddressByClientCIDR helps the client to determine the server address that they should
      * use, depending on the clientCIDR that they match.
      */
    trait ServerAddressByClientCIDR extends js.Object {
      /**
        * The CIDR with which clients can match their IP to figure out the server address that they
        * should use.
        */
      var clientCIDR: Input[String]
      /**
        * Address of this server, suitable for a client that matches the above CIDR. This can be a
        * hostname, hostname:port, IP or IP:port.
        */
      var serverAddress: Input[String]
    }
    
    /**
      * Status is a return value for calls that don't return other objects.
      */
    trait Status extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[v1]] = js.undefined
      /**
        * Suggested HTTP return code for this status, 0 if not set.
        */
      var code: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Extended data associated with the reason.  Each reason may define its own extended details.
        * This field is optional and the data returned is not guaranteed to conform to any schema
        * except that defined by the reason type.
        */
      var details: js.UndefOr[Input[StatusDetails]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Status]] = js.undefined
      /**
        * A human-readable description of the status of this operation.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
      /**
        * A machine-readable description of why this operation is in the "Failure" status. If this
        * value is empty there is no information available. A Reason clarifies an HTTP status code
        * but does not override it.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * StatusCause provides more information about an api.Status failure, including cases when
      * multiple errors are encountered.
      */
    trait StatusCause extends js.Object {
      /**
        * The field of the resource that has caused this error, as named by its JSON serialization.
        * May include dot and postfix notation for nested attributes. Arrays are zero-indexed.
        * Fields may appear more than once in an array of causes due to fields having multiple
        * errors. Optional.
        *
        * Examples:
        *   "name" - the field "name" on the current resource
        *   "items[0].name" - the field "name" on the first array entry in "items"
        */
      var field: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human-readable description of the cause of the error.  This field may be presented as-is
        * to a reader.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * A machine-readable description of the cause of the error. If this value is empty there is
        * no information available.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * StatusDetails is a set of additional properties that MAY be set by the server to provide
      * additional information about a response. The Reason field of a Status object defines what
      * attributes will be set. Clients must ignore fields that do not match the defined type of each
      * attribute, and should assume that any attribute may be empty, invalid, or under defined.
      */
    trait StatusDetails extends js.Object {
      /**
        * The Causes array includes more details associated with the StatusReason failure. Not all
        * StatusReasons may provide detailed causes.
        */
      var causes: js.UndefOr[Input[js.Array[Input[StatusCause]]]] = js.undefined
      /**
        * The group attribute of the resource associated with the status StatusReason.
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      /**
        * The kind attribute of the resource associated with the status StatusReason. On some
        * operations may differ from the requested resource Kind. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name attribute of the resource associated with the status StatusReason (when there is a
        * single name which can be described).
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      /**
        * If specified, the time in seconds before the operation should be retried. Some errors may
        * indicate the client must take an alternate action - for those errors this field may
        * indicate how long to wait before taking the alternate action.
        */
      var retryAfterSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * UID of the resource. (when there is a single resource which can be described). More info:
        * http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * Event represents a single event to a watched resource.
      */
    trait WatchEvent extends js.Object {
      /**
        * Object is:
        *  * If Type is Added or Modified: the new state of the object.
        *  * If Type is Deleted: the state of the object immediately before deletion.
        *  * If Type is Error: *Status is recommended; other types may make sense
        *    depending on context.
        */
      var `object`: Input[js.Object]
      var `type`: Input[String]
    }
    
    def isAPIGroup(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIGroup */ Boolean = js.native
    def isAPIGroupList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIGroupList */ Boolean = js.native
    def isAPIResourceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIResourceList */ Boolean = js.native
    def isAPIVersions(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIVersions */ Boolean = js.native
    def isDeleteOptions(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.DeleteOptions */ Boolean = js.native
    def isManagedFieldsEntry(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.ManagedFieldsEntry */ Boolean = js.native
    def isOwnerReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.OwnerReference */ Boolean = js.native
    def isStatus(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.Status */ Boolean = js.native
  }
  
}

