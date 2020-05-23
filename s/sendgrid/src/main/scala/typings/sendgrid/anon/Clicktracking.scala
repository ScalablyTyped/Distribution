package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clicktracking extends js.Object {
  var click_tracking: js.Any
  var ganalytics: js.Any
  var open_tracking: js.Any
  var subscription_tracking: js.Any
}

object Clicktracking {
  @scala.inline
  def apply(click_tracking: js.Any, ganalytics: js.Any, open_tracking: js.Any, subscription_tracking: js.Any): Clicktracking = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], ganalytics = ganalytics.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], subscription_tracking = subscription_tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clicktracking]
  }
}

