package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.stellarSdkStrings.asc
import typings.stellarSdk.stellarSdkStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallFunctionTemplateOptions extends js.Object {
  var cursor: js.UndefOr[String | Double] = js.native
  var limit: js.UndefOr[Double] = js.native
  var order: js.UndefOr[asc | desc] = js.native
}

object CallFunctionTemplateOptions {
  @scala.inline
  def apply(): CallFunctionTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallFunctionTemplateOptions]
  }
  @scala.inline
  implicit class CallFunctionTemplateOptionsOps[Self <: CallFunctionTemplateOptions] (val x: Self) extends AnyVal {
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
    def setCursor(value: String | Double): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOrder(value: asc | desc): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

