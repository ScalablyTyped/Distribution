package typings.pulumiKubernetes.daemonSetListMod

import typings.pulumiKubernetes.inputMod.apps.v1beta2.DaemonSet
import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta2
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaemonSetListArgs extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[appsSlashv1beta2]] = js.native
  /**
    * A list of daemon sets.
    */
  val items: Input[js.Array[Input[DaemonSet]]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.DaemonSetList]] = js.native
  /**
    * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: js.UndefOr[Input[ListMeta]] = js.native
}

object DaemonSetListArgs {
  @scala.inline
  def apply(items: Input[js.Array[Input[DaemonSet]]]): DaemonSetListArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetListArgs]
  }
  @scala.inline
  implicit class DaemonSetListArgsOps[Self <: DaemonSetListArgs] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Input[DaemonSet]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: Input[js.Array[Input[DaemonSet]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[appsSlashv1beta2]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.DaemonSetList]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ListMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

