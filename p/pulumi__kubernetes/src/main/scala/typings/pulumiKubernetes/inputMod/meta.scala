package typings.pulumiKubernetes.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meta {
  
  object v1 {
    
    /**
      * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
      */
    trait LabelSelector extends StObject {
      
      /**
        * matchExpressions is a list of label selector requirements. The requirements are ANDed.
        */
      var matchExpressions: js.UndefOr[Input[js.Array[Input[LabelSelectorRequirement]]]] = js.undefined
      
      /**
        * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
        */
      var matchLabels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    }
    object LabelSelector {
      
      @scala.inline
      def apply(): LabelSelector = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LabelSelector]
      }
      
      @scala.inline
      implicit class LabelSelectorMutableBuilder[Self <: LabelSelector] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchExpressions(value: Input[js.Array[Input[LabelSelectorRequirement]]]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchExpressionsUndefined: Self = StObject.set(x, "matchExpressions", js.undefined)
        
        @scala.inline
        def setMatchExpressionsVarargs(value: Input[LabelSelectorRequirement]*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
        
        @scala.inline
        def setMatchLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "matchLabels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchLabelsUndefined: Self = StObject.set(x, "matchLabels", js.undefined)
      }
    }
    
    /**
      * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
      */
    trait LabelSelectorRequirement extends StObject {
      
      /**
        * key is the label key that the selector applies to.
        */
      var key: Input[String]
      
      /**
        * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        */
      var operator: Input[String]
      
      /**
        * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
        */
      var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    }
    object LabelSelectorRequirement {
      
      @scala.inline
      def apply(key: Input[String], operator: Input[String]): LabelSelectorRequirement = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelSelectorRequirement]
      }
      
      @scala.inline
      implicit class LabelSelectorRequirementMutableBuilder[Self <: LabelSelectorRequirement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    /**
      * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
      */
    trait ListMeta extends StObject {
      
      /**
        * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
        */
      var continue: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
        */
      var remainingItemCount: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * selfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
        */
      var selfLink: js.UndefOr[Input[String]] = js.undefined
    }
    object ListMeta {
      
      @scala.inline
      def apply(): ListMeta = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListMeta]
      }
      
      @scala.inline
      implicit class ListMetaMutableBuilder[Self <: ListMeta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContinue(value: Input[String]): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
        
        @scala.inline
        def setRemainingItemCount(value: Input[Double]): Self = StObject.set(x, "remainingItemCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemainingItemCountUndefined: Self = StObject.set(x, "remainingItemCount", js.undefined)
        
        @scala.inline
        def setResourceVersion(value: Input[String]): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
        
        @scala.inline
        def setSelfLink(value: Input[String]): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    /**
      * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
      */
    trait ManagedFieldsEntry extends StObject {
      
      /**
        * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
        */
      var fieldsType: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
        */
      var fieldsV1: js.UndefOr[js.Any] = js.undefined
      
      /**
        * Manager is an identifier of the workflow managing these fields.
        */
      var manager: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
        */
      var operation: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
        */
      var time: js.UndefOr[Input[String]] = js.undefined
    }
    object ManagedFieldsEntry {
      
      @scala.inline
      def apply(): ManagedFieldsEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ManagedFieldsEntry]
      }
      
      @scala.inline
      implicit class ManagedFieldsEntryMutableBuilder[Self <: ManagedFieldsEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        @scala.inline
        def setFieldsType(value: Input[String]): Self = StObject.set(x, "fieldsType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsTypeUndefined: Self = StObject.set(x, "fieldsType", js.undefined)
        
        @scala.inline
        def setFieldsV1(value: js.Any): Self = StObject.set(x, "fieldsV1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsV1Undefined: Self = StObject.set(x, "fieldsV1", js.undefined)
        
        @scala.inline
        def setManager(value: Input[String]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
        
        @scala.inline
        def setOperation(value: Input[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        @scala.inline
        def setTime(value: Input[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      }
    }
    
    /**
      * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
      */
    trait ObjectMeta extends StObject {
      
      /**
        * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
        */
      var annotations: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      
      /**
        * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
        */
      var clusterName: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
        *
        * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var creationTimestamp: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
        */
      var deletionGracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
        *
        * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var deletionTimestamp: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
        */
      var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
        *
        * If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).
        *
        * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
        */
      var generateName: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
        */
      var generation: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
        */
      var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      
      /**
        * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
        */
      var managedFields: js.UndefOr[Input[js.Array[Input[ManagedFieldsEntry]]]] = js.undefined
      
      /**
        * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
        *
        * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
        */
      var ownerReferences: js.UndefOr[Input[js.Array[Input[OwnerReference]]]] = js.undefined
      
      /**
        * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
        *
        * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * SelfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
        */
      var selfLink: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
        *
        * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    object ObjectMeta {
      
      @scala.inline
      def apply(): ObjectMeta = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ObjectMeta]
      }
      
      @scala.inline
      implicit class ObjectMetaMutableBuilder[Self <: ObjectMeta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnnotations(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
        
        @scala.inline
        def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
        
        @scala.inline
        def setCreationTimestamp(value: Input[String]): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
        
        @scala.inline
        def setDeletionGracePeriodSeconds(value: Input[Double]): Self = StObject.set(x, "deletionGracePeriodSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletionGracePeriodSecondsUndefined: Self = StObject.set(x, "deletionGracePeriodSeconds", js.undefined)
        
        @scala.inline
        def setDeletionTimestamp(value: Input[String]): Self = StObject.set(x, "deletionTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletionTimestampUndefined: Self = StObject.set(x, "deletionTimestamp", js.undefined)
        
        @scala.inline
        def setFinalizers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFinalizersUndefined: Self = StObject.set(x, "finalizers", js.undefined)
        
        @scala.inline
        def setFinalizersVarargs(value: Input[String]*): Self = StObject.set(x, "finalizers", js.Array(value :_*))
        
        @scala.inline
        def setGenerateName(value: Input[String]): Self = StObject.set(x, "generateName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenerateNameUndefined: Self = StObject.set(x, "generateName", js.undefined)
        
        @scala.inline
        def setGeneration(value: Input[Double]): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
        
        @scala.inline
        def setLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setManagedFields(value: Input[js.Array[Input[ManagedFieldsEntry]]]): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManagedFieldsUndefined: Self = StObject.set(x, "managedFields", js.undefined)
        
        @scala.inline
        def setManagedFieldsVarargs(value: Input[ManagedFieldsEntry]*): Self = StObject.set(x, "managedFields", js.Array(value :_*))
        
        @scala.inline
        def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        @scala.inline
        def setOwnerReferences(value: Input[js.Array[Input[OwnerReference]]]): Self = StObject.set(x, "ownerReferences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerReferencesUndefined: Self = StObject.set(x, "ownerReferences", js.undefined)
        
        @scala.inline
        def setOwnerReferencesVarargs(value: Input[OwnerReference]*): Self = StObject.set(x, "ownerReferences", js.Array(value :_*))
        
        @scala.inline
        def setResourceVersion(value: Input[String]): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
        
        @scala.inline
        def setSelfLink(value: Input[String]): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        @scala.inline
        def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      }
    }
    
    /**
      * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
      */
    trait OwnerReference extends StObject {
      
      /**
        * API version of the referent.
        */
      var apiVersion: Input[String]
      
      /**
        * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
        */
      var blockOwnerDeletion: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * If true, this reference points to the managing controller.
        */
      var controller: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
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
    object OwnerReference {
      
      @scala.inline
      def apply(apiVersion: Input[String], kind: Input[String], name: Input[String], uid: Input[String]): OwnerReference = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[OwnerReference]
      }
      
      @scala.inline
      implicit class OwnerReferenceMutableBuilder[Self <: OwnerReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockOwnerDeletion(value: Input[Boolean]): Self = StObject.set(x, "blockOwnerDeletion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockOwnerDeletionUndefined: Self = StObject.set(x, "blockOwnerDeletion", js.undefined)
        
        @scala.inline
        def setController(value: Input[Boolean]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
        
        @scala.inline
        def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
      */
    trait StatusCause extends StObject {
      
      /**
        * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
        *
        * Examples:
        *   "name" - the field "name" on the current resource
        *   "items[0].name" - the field "name" on the first array entry in "items"
        */
      var field: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * A machine-readable description of the cause of the error. If this value is empty there is no information available.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
    }
    object StatusCause {
      
      @scala.inline
      def apply(): StatusCause = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StatusCause]
      }
      
      @scala.inline
      implicit class StatusCauseMutableBuilder[Self <: StatusCause] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
        
        @scala.inline
        def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    /**
      * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
      */
    trait StatusDetails extends StObject {
      
      /**
        * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
        */
      var causes: js.UndefOr[Input[js.Array[Input[StatusCause]]]] = js.undefined
      
      /**
        * The group attribute of the resource associated with the status StatusReason.
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
        */
      var retryAfterSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    object StatusDetails {
      
      @scala.inline
      def apply(): StatusDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StatusDetails]
      }
      
      @scala.inline
      implicit class StatusDetailsMutableBuilder[Self <: StatusDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCauses(value: Input[js.Array[Input[StatusCause]]]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
        
        @scala.inline
        def setCausesVarargs(value: Input[StatusCause]*): Self = StObject.set(x, "causes", js.Array(value :_*))
        
        @scala.inline
        def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        @scala.inline
        def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRetryAfterSeconds(value: Input[Double]): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryAfterSecondsUndefined: Self = StObject.set(x, "retryAfterSeconds", js.undefined)
        
        @scala.inline
        def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      }
    }
  }
}
