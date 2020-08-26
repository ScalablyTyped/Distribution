package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateHibernationOption extends js.Object {
  var configured: Boolean = js.native
}

object GetLaunchTemplateHibernationOption {
  @scala.inline
  def apply(configured: Boolean): GetLaunchTemplateHibernationOption = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateHibernationOption]
  }
  @scala.inline
  implicit class GetLaunchTemplateHibernationOptionOps[Self <: GetLaunchTemplateHibernationOption] (val x: Self) extends AnyVal {
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
    def setConfigured(value: Boolean): Self = this.set("configured", value.asInstanceOf[js.Any])
  }
  
}

