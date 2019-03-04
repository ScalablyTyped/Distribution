package typings
package reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringConfig extends js.Object {
  var delay: java.lang.String
  var duration: java.lang.String
  var easeFunction: java.lang.String
}

object SpringConfig {
  @scala.inline
  def apply(delay: java.lang.String, duration: java.lang.String, easeFunction: java.lang.String): SpringConfig = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, easeFunction = easeFunction)
  
    __obj.asInstanceOf[SpringConfig]
  }
}

