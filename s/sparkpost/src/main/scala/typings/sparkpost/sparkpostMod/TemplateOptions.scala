package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  /** Enable or disable click tracking */
  var click_tracking: Boolean
  /** Enable or disable open tracking */
  var open_tracking: Boolean
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: Boolean
}

object TemplateOptions {
  @scala.inline
  def apply(click_tracking: Boolean, open_tracking: Boolean, transactional: Boolean): TemplateOptions = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking, open_tracking = open_tracking, transactional = transactional)
  
    __obj.asInstanceOf[TemplateOptions]
  }
}

