package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserPromptHandler extends js.Object {
  /** All prompts should be silently accepted. */
  var ACCEPT: String = js.native
  /**
    * All prompts should be automatically accepted, but an error should be
    * returned to the next (or currently executing) WebDriver command.
    */
  var ACCEPT_AND_NOTIFY: String = js.native
  /** All prompts should be silently dismissed. */
  var DISMISS: String = js.native
  /**
    * All prompts should be automatically dismissed, but an error should be
    * returned to the next (or currently executing) WebDriver command.
    */
  var DISMISS_AND_NOTIFY: String = js.native
  /** All prompts should be left unhandled. */
  var IGNORE: String = js.native
}

object IUserPromptHandler {
  @scala.inline
  def apply(
    ACCEPT: String,
    ACCEPT_AND_NOTIFY: String,
    DISMISS: String,
    DISMISS_AND_NOTIFY: String,
    IGNORE: String
  ): IUserPromptHandler = {
    val __obj = js.Dynamic.literal(ACCEPT = ACCEPT.asInstanceOf[js.Any], ACCEPT_AND_NOTIFY = ACCEPT_AND_NOTIFY.asInstanceOf[js.Any], DISMISS = DISMISS.asInstanceOf[js.Any], DISMISS_AND_NOTIFY = DISMISS_AND_NOTIFY.asInstanceOf[js.Any], IGNORE = IGNORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserPromptHandler]
  }
  @scala.inline
  implicit class IUserPromptHandlerOps[Self <: IUserPromptHandler] (val x: Self) extends AnyVal {
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
    def setACCEPT(value: String): Self = this.set("ACCEPT", value.asInstanceOf[js.Any])
    @scala.inline
    def setACCEPT_AND_NOTIFY(value: String): Self = this.set("ACCEPT_AND_NOTIFY", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISMISS(value: String): Self = this.set("DISMISS", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISMISS_AND_NOTIFY(value: String): Self = this.set("DISMISS_AND_NOTIFY", value.asInstanceOf[js.Any])
    @scala.inline
    def setIGNORE(value: String): Self = this.set("IGNORE", value.asInstanceOf[js.Any])
  }
  
}

