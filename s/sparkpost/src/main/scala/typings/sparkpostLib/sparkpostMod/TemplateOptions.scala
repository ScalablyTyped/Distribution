package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  /** Enable or disable click tracking */
  var click_tracking: scala.Boolean
  /** Enable or disable open tracking */
  var open_tracking: scala.Boolean
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: scala.Boolean
}

object TemplateOptions {
  @scala.inline
  def apply(click_tracking: scala.Boolean, open_tracking: scala.Boolean, transactional: scala.Boolean): TemplateOptions = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking, open_tracking = open_tracking, transactional = transactional)
  
    __obj.asInstanceOf[TemplateOptions]
  }
}

