package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateOptions extends js.Object {
  /** Enable or disable click tracking */
  var click_tracking: js.UndefOr[Boolean] = js.native
  /** Enable or disable open tracking */
  var open_tracking: js.UndefOr[Boolean] = js.native
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.native
}

object CreateTemplateOptions {
  @scala.inline
  def apply(): CreateTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateOptions]
  }
  @scala.inline
  implicit class CreateTemplateOptionsOps[Self <: CreateTemplateOptions] (val x: Self) extends AnyVal {
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
    def deleteClick_tracking: Self = this.set("click_tracking", js.undefined)
    @scala.inline
    def setOpen_tracking(value: Boolean): Self = this.set("open_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen_tracking: Self = this.set("open_tracking", js.undefined)
    @scala.inline
    def setTransactional(value: Boolean): Self = this.set("transactional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactional: Self = this.set("transactional", js.undefined)
  }
  
}

