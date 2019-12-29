package typings.seleniumDashWebdriver.libCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserPromptHandler extends js.Object {
  /** All prompts should be silently accepted. */
  var ACCEPT: String
  /**
    * All prompts should be automatically accepted, but an error should be
    * returned to the next (or currently executing) WebDriver command.
    */
  var ACCEPT_AND_NOTIFY: String
  /** All prompts should be silently dismissed. */
  var DISMISS: String
  /**
    * All prompts should be automatically dismissed, but an error should be
    * returned to the next (or currently executing) WebDriver command.
    */
  var DISMISS_AND_NOTIFY: String
  /** All prompts should be left unhandled. */
  var IGNORE: String
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
}

