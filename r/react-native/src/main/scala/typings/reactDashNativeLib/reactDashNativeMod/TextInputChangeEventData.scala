package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputChangeEventData extends js.Object {
  var eventCount: scala.Double
  var target: scala.Double
  var text: java.lang.String
}

object TextInputChangeEventData {
  @scala.inline
  def apply(eventCount: scala.Double, target: scala.Double, text: java.lang.String): TextInputChangeEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount, target = target, text = text)
  
    __obj.asInstanceOf[TextInputChangeEventData]
  }
}

