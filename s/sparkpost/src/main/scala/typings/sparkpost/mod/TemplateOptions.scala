package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions extends js.Object {
  /** Enable or disable click tracking */
  var click_tracking: Boolean = js.native
  /** Enable or disable open tracking */
  var open_tracking: Boolean = js.native
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: Boolean = js.native
}

object TemplateOptions {
  @scala.inline
  def apply(click_tracking: Boolean, open_tracking: Boolean, transactional: Boolean): TemplateOptions = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], transactional = transactional.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOptions]
  }
  @scala.inline
  implicit class TemplateOptionsOps[Self <: TemplateOptions] (val x: Self) extends AnyVal {
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
    def setClick_tracking(value: Boolean): Self = this.set("click_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen_tracking(value: Boolean): Self = this.set("open_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactional(value: Boolean): Self = this.set("transactional", value.asInstanceOf[js.Any])
  }
  
}

