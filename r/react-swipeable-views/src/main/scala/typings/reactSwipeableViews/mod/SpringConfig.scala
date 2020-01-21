package typings.reactSwipeableViews.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringConfig extends js.Object {
  var delay: String
  var duration: String
  var easeFunction: String
}

object SpringConfig {
  @scala.inline
  def apply(delay: String, duration: String, easeFunction: String): SpringConfig = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easeFunction = easeFunction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpringConfig]
  }
}

