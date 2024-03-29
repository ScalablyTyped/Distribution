package typings.pulumiKubernetes.outputMod

import org.scalablytyped.runtime.StringDictionary
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
      var matchExpressions: js.Array[LabelSelectorRequirement]
      
      /**
        * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
        */
      var matchLabels: StringDictionary[String]
    }
    object LabelSelector {
      
      inline def apply(matchExpressions: js.Array[LabelSelectorRequirement], matchLabels: StringDictionary[String]): LabelSelector = {
        val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchLabels = matchLabels.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelSelector]
      }
      
      extension [Self <: LabelSelector](x: Self) {
        
        inline def setMatchExpressions(value: js.Array[LabelSelectorRequirement]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
        
        inline def setMatchExpressionsVarargs(value: LabelSelectorRequirement*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
        
        inline def setMatchLabels(value: StringDictionary[String]): Self = StObject.set(x, "matchLabels", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
      */
    trait LabelSelectorRequirement extends StObject {
      
      /**
        * key is the label key that the selector applies to.
        */
      var key: String
      
      /**
        * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        */
      var operator: String
      
      /**
        * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
        */
      var values: js.Array[String]
    }
    object LabelSelectorRequirement {
      
      inline def apply(key: String, operator: String, values: js.Array[String]): LabelSelectorRequirement = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[LabelSelectorRequirement]
      }
      
      extension [Self <: LabelSelectorRequirement](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    /**
      * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
      */
    trait ListMeta extends StObject {
      
      /**
        * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
        */
      var continue: String
      
      /**
        * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
        */
      var remainingItemCount: Double
      
      /**
        * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: String
      
      /**
        * selfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
        */
      var selfLink: String
    }
    object ListMeta {
      
      inline def apply(continue: String, remainingItemCount: Double, resourceVersion: String, selfLink: String): ListMeta = {
        val __obj = js.Dynamic.literal(continue = continue.asInstanceOf[js.Any], remainingItemCount = remainingItemCount.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
        __obj.asInstanceOf[ListMeta]
      }
      
      extension [Self <: ListMeta](x: Self) {
        
        inline def setContinue(value: String): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
        
        inline def setRemainingItemCount(value: Double): Self = StObject.set(x, "remainingItemCount", value.asInstanceOf[js.Any])
        
        inline def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
      */
    trait ManagedFieldsEntry extends StObject {
      
      /**
        * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
        */
      var apiVersion: String
      
      /**
        * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
        */
      var fieldsType: String
      
      /**
        * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
        */
      var fieldsV1: js.Any
      
      /**
        * Manager is an identifier of the workflow managing these fields.
        */
      var manager: String
      
      /**
        * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
        */
      var operation: String
      
      /**
        * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
        */
      var time: String
    }
    object ManagedFieldsEntry {
      
      inline def apply(
        apiVersion: String,
        fieldsType: String,
        fieldsV1: js.Any,
        manager: String,
        operation: String,
        time: String
      ): ManagedFieldsEntry = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldsType = fieldsType.asInstanceOf[js.Any], fieldsV1 = fieldsV1.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
        __obj.asInstanceOf[ManagedFieldsEntry]
      }
      
      extension [Self <: ManagedFieldsEntry](x: Self) {
        
        inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setFieldsType(value: String): Self = StObject.set(x, "fieldsType", value.asInstanceOf[js.Any])
        
        inline def setFieldsV1(value: js.Any): Self = StObject.set(x, "fieldsV1", value.asInstanceOf[js.Any])
        
        inline def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
      */
    trait ObjectMeta extends StObject {
      
      /**
        * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
        */
      var annotations: StringDictionary[String]
      
      /**
        * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
        */
      var clusterName: String
      
      /**
        * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
        *
        * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var creationTimestamp: String
      
      /**
        * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
        */
      var deletionGracePeriodSeconds: Double
      
      /**
        * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
        *
        * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var deletionTimestamp: String
      
      /**
        * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
        */
      var finalizers: js.Array[String]
      
      /**
        * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
        *
        * If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).
        *
        * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
        */
      var generateName: String
      
      /**
        * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
        */
      var generation: Double
      
      /**
        * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
        */
      var labels: StringDictionary[String]
      
      /**
        * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
        */
      var managedFields: js.Array[ManagedFieldsEntry]
      
      /**
        * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: String
      
      /**
        * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
        *
        * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
        */
      var namespace: String
      
      /**
        * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
        */
      var ownerReferences: js.Array[OwnerReference]
      
      /**
        * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
        *
        * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
        */
      var resourceVersion: String
      
      /**
        * SelfLink is a URL representing this object. Populated by the system. Read-only.
        *
        * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
        */
      var selfLink: String
      
      /**
        * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
        *
        * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: String
    }
    object ObjectMeta {
      
      inline def apply(
        annotations: StringDictionary[String],
        clusterName: String,
        creationTimestamp: String,
        deletionGracePeriodSeconds: Double,
        deletionTimestamp: String,
        finalizers: js.Array[String],
        generateName: String,
        generation: Double,
        labels: StringDictionary[String],
        managedFields: js.Array[ManagedFieldsEntry],
        name: String,
        namespace: String,
        ownerReferences: js.Array[OwnerReference],
        resourceVersion: String,
        selfLink: String,
        uid: String
      ): ObjectMeta = {
        val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], deletionGracePeriodSeconds = deletionGracePeriodSeconds.asInstanceOf[js.Any], deletionTimestamp = deletionTimestamp.asInstanceOf[js.Any], finalizers = finalizers.asInstanceOf[js.Any], generateName = generateName.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], managedFields = managedFields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], ownerReferences = ownerReferences.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[ObjectMeta]
      }
      
      extension [Self <: ObjectMeta](x: Self) {
        
        inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
        
        inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
        
        inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
        
        inline def setDeletionGracePeriodSeconds(value: Double): Self = StObject.set(x, "deletionGracePeriodSeconds", value.asInstanceOf[js.Any])
        
        inline def setDeletionTimestamp(value: String): Self = StObject.set(x, "deletionTimestamp", value.asInstanceOf[js.Any])
        
        inline def setFinalizers(value: js.Array[String]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
        
        inline def setFinalizersVarargs(value: String*): Self = StObject.set(x, "finalizers", js.Array(value :_*))
        
        inline def setGenerateName(value: String): Self = StObject.set(x, "generateName", value.asInstanceOf[js.Any])
        
        inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
        
        inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setManagedFields(value: js.Array[ManagedFieldsEntry]): Self = StObject.set(x, "managedFields", value.asInstanceOf[js.Any])
        
        inline def setManagedFieldsVarargs(value: ManagedFieldsEntry*): Self = StObject.set(x, "managedFields", js.Array(value :_*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOwnerReferences(value: js.Array[OwnerReference]): Self = StObject.set(x, "ownerReferences", value.asInstanceOf[js.Any])
        
        inline def setOwnerReferencesVarargs(value: OwnerReference*): Self = StObject.set(x, "ownerReferences", js.Array(value :_*))
        
        inline def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
      */
    trait OwnerReference extends StObject {
      
      /**
        * API version of the referent.
        */
      var apiVersion: String
      
      /**
        * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
        */
      var blockOwnerDeletion: Boolean
      
      /**
        * If true, this reference points to the managing controller.
        */
      var controller: Boolean
      
      /**
        * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: String
      
      /**
        * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: String
      
      /**
        * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: String
    }
    object OwnerReference {
      
      inline def apply(
        apiVersion: String,
        blockOwnerDeletion: Boolean,
        controller: Boolean,
        kind: String,
        name: String,
        uid: String
      ): OwnerReference = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], blockOwnerDeletion = blockOwnerDeletion.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[OwnerReference]
      }
      
      extension [Self <: OwnerReference](x: Self) {
        
        inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setBlockOwnerDeletion(value: Boolean): Self = StObject.set(x, "blockOwnerDeletion", value.asInstanceOf[js.Any])
        
        inline def setController(value: Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
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
      var field: String
      
      /**
        * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
        */
      var message: String
      
      /**
        * A machine-readable description of the cause of the error. If this value is empty there is no information available.
        */
      var reason: String
    }
    object StatusCause {
      
      inline def apply(field: String, message: String, reason: String): StatusCause = {
        val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
        __obj.asInstanceOf[StatusCause]
      }
      
      extension [Self <: StatusCause](x: Self) {
        
        inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
      */
    trait StatusDetails extends StObject {
      
      /**
        * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
        */
      var causes: js.Array[StatusCause]
      
      /**
        * The group attribute of the resource associated with the status StatusReason.
        */
      var group: String
      
      /**
        * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: String
      
      /**
        * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
        */
      var name: String
      
      /**
        * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
        */
      var retryAfterSeconds: Double
      
      /**
        * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
        */
      var uid: String
    }
    object StatusDetails {
      
      inline def apply(
        causes: js.Array[StatusCause],
        group: String,
        kind: String,
        name: String,
        retryAfterSeconds: Double,
        uid: String
      ): StatusDetails = {
        val __obj = js.Dynamic.literal(causes = causes.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retryAfterSeconds = retryAfterSeconds.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[StatusDetails]
      }
      
      extension [Self <: StatusDetails](x: Self) {
        
        inline def setCauses(value: js.Array[StatusCause]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
        
        inline def setCausesVarargs(value: StatusCause*): Self = StObject.set(x, "causes", js.Array(value :_*))
        
        inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRetryAfterSeconds(value: Double): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
        
        inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
  }
}
