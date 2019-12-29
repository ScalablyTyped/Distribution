package typings.atPulumiKubernetes.typesInputMod.apps.v1beta2

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.appsSlashv1beta2
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated apps/v1beta2/ControllerRevision is deprecated by apps/v1/ControllerRevision and
  * not supported by Kubernetes v1.16+ clusters.
  *
  * ControllerRevision implements an immutable snapshot of state data. Clients are responsible
  * for serializing and deserializing the objects that contain their internal state. Once a
  * ControllerRevision has been successfully created, it can not be updated. The API Server will
  * fail validation of all requests that attempt to mutate the Data field. ControllerRevisions
  * may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet
  * controllers for update and rollback, this object is beta. However, it may be subject to name
  * and representation changes in future releases, and clients should not depend on its
  * stability. It is primarily for internal use by controllers.
  */
trait ControllerRevision extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[appsSlashv1beta2]] = js.undefined
  /**
    * Data is the serialized representation of the state.
    */
  var data: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevision]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Revision indicates the revision of the state represented by Data.
    */
  var revision: Input[Double]
}

object ControllerRevision {
  @scala.inline
  def apply(
    revision: Input[Double],
    apiVersion: Input[appsSlashv1beta2] = null,
    data: Input[js.Object] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevision] = null,
    metadata: Input[ObjectMeta] = null
  ): ControllerRevision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerRevision]
  }
}

