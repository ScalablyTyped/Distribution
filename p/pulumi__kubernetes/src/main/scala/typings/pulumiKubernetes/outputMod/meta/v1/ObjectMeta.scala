package typings.pulumiKubernetes.outputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
  */
@js.native
trait ObjectMeta extends js.Object {
  /**
    * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
    */
  var annotations: StringDictionary[String] = js.native
  /**
    * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
    */
  var clusterName: String = js.native
  /**
    * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
    *
    * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var creationTimestamp: String = js.native
  /**
    * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
    */
  var deletionGracePeriodSeconds: Double = js.native
  /**
    * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
    *
    * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var deletionTimestamp: String = js.native
  /**
    * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
    */
  var finalizers: js.Array[String] = js.native
  /**
    * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
    *
    * If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).
    *
    * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
    */
  var generateName: String = js.native
  /**
    * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
    */
  var generation: Double = js.native
  /**
    * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
    */
  var labels: StringDictionary[String] = js.native
  /**
    * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
    */
  var managedFields: js.Array[ManagedFieldsEntry] = js.native
  /**
    * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: String = js.native
  /**
    * Namespace defines the space within each name must be unique. An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
    *
    * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
    */
  var namespace: String = js.native
  /**
    * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
    */
  var ownerReferences: js.Array[OwnerReference] = js.native
  /**
    * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
    *
    * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: String = js.native
  /**
    * SelfLink is a URL representing this object. Populated by the system. Read-only.
    *
    * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
    */
  var selfLink: String = js.native
  /**
    * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
    *
    * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: String = js.native
}

object ObjectMeta {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class ObjectMetaOps[Self <: ObjectMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotations(value: StringDictionary[String]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletionGracePeriodSeconds(value: Double): Self = this.set("deletionGracePeriodSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletionTimestamp(value: String): Self = this.set("deletionTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalizersVarargs(value: String*): Self = this.set("finalizers", js.Array(value :_*))
    @scala.inline
    def setFinalizers(value: js.Array[String]): Self = this.set("finalizers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateName(value: String): Self = this.set("generateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagedFieldsVarargs(value: ManagedFieldsEntry*): Self = this.set("managedFields", js.Array(value :_*))
    @scala.inline
    def setManagedFields(value: js.Array[ManagedFieldsEntry]): Self = this.set("managedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerReferencesVarargs(value: OwnerReference*): Self = this.set("ownerReferences", js.Array(value :_*))
    @scala.inline
    def setOwnerReferences(value: js.Array[OwnerReference]): Self = this.set("ownerReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceVersion(value: String): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

