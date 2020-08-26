package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclDefaultAction extends js.Object {
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: String = js.native
}

object WebAclDefaultAction {
  @scala.inline
  def apply(`type`: String): WebAclDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclDefaultAction]
  }
  @scala.inline
  implicit class WebAclDefaultActionOps[Self <: WebAclDefaultAction] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

