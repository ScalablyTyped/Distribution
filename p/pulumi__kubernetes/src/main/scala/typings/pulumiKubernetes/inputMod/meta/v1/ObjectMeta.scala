package typings.pulumiKubernetes.inputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Finalizers may be processed and removed in any order.  Order is NOT enforced because it
    * introduces significant risk of stuck finalizers. finalizers is a shared field, any actor
    * with permission can reorder it. If the finalizer list is processed in order, then this can
    * lead to a situation in which the component responsible for the first finalizer in the list
    * is waiting for a signal (field value, external system, or other) produced by a component
    * responsible for a finalizer later in the list, resulting in a deadlock. Without enforced
    * ordering finalizers are free to order amongst themselves and are not vulnerable to ordering
    * changes in the list.
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

object ObjectMeta {
  @scala.inline
  def apply(
    annotations: Input[StringDictionary[Input[String]]] = null,
    clusterName: Input[String] = null,
    creationTimestamp: Input[String] = null,
    deletionGracePeriodSeconds: Input[Double] = null,
    deletionTimestamp: Input[String] = null,
    finalizers: Input[js.Array[Input[String]]] = null,
    generateName: Input[String] = null,
    generation: Input[Double] = null,
    labels: Input[StringDictionary[Input[String]]] = null,
    managedFields: Input[js.Array[Input[ManagedFieldsEntry]]] = null,
    name: Input[String] = null,
    namespace: Input[String] = null,
    ownerReferences: Input[js.Array[Input[OwnerReference]]] = null,
    resourceVersion: Input[String] = null,
    selfLink: Input[String] = null,
    uid: Input[String] = null
  ): ObjectMeta = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (deletionGracePeriodSeconds != null) __obj.updateDynamic("deletionGracePeriodSeconds")(deletionGracePeriodSeconds.asInstanceOf[js.Any])
    if (deletionTimestamp != null) __obj.updateDynamic("deletionTimestamp")(deletionTimestamp.asInstanceOf[js.Any])
    if (finalizers != null) __obj.updateDynamic("finalizers")(finalizers.asInstanceOf[js.Any])
    if (generateName != null) __obj.updateDynamic("generateName")(generateName.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (managedFields != null) __obj.updateDynamic("managedFields")(managedFields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (ownerReferences != null) __obj.updateDynamic("ownerReferences")(ownerReferences.asInstanceOf[js.Any])
    if (resourceVersion != null) __obj.updateDynamic("resourceVersion")(resourceVersion.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMeta]
  }
}

