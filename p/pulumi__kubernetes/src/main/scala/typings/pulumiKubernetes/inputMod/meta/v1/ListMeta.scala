package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
  */
@js.native
trait ListMeta extends js.Object {
  /**
    * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
    */
  var continue: js.UndefOr[Input[String]] = js.native
  /**
    * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
    */
  var remainingItemCount: js.UndefOr[Input[Double]] = js.native
  /**
    * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.native
  /**
    * selfLink is a URL representing this object. Populated by the system. Read-only.
    *
    * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
    */
  var selfLink: js.UndefOr[Input[String]] = js.native
}

object ListMeta {
  @scala.inline
  def apply(): ListMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeta]
  }
  @scala.inline
  implicit class ListMetaOps[Self <: ListMeta] (val x: Self) extends AnyVal {
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
    def setContinue(value: Input[String]): Self = this.set("continue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinue: Self = this.set("continue", js.undefined)
    @scala.inline
    def setRemainingItemCount(value: Input[Double]): Self = this.set("remainingItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingItemCount: Self = this.set("remainingItemCount", js.undefined)
    @scala.inline
    def setResourceVersion(value: Input[String]): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceVersion: Self = this.set("resourceVersion", js.undefined)
    @scala.inline
    def setSelfLink(value: Input[String]): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

