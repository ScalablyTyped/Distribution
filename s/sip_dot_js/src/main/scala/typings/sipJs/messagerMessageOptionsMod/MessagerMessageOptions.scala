package typings.sipJs.messagerMessageOptionsMod

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagerMessageOptions extends js.Object {
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
}

object MessagerMessageOptions {
  @scala.inline
  def apply(): MessagerMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagerMessageOptions]
  }
  @scala.inline
  implicit class MessagerMessageOptionsOps[Self <: MessagerMessageOptions] (val x: Self) extends AnyVal {
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
    def setRequestDelegate(value: OutgoingRequestDelegate): Self = this.set("requestDelegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestDelegate: Self = this.set("requestDelegate", js.undefined)
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
  }
  
}

