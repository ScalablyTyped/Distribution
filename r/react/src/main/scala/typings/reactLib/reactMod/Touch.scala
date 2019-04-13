package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
  var identifier: scala.Double
  var pageX: scala.Double
  var pageY: scala.Double
  var screenX: scala.Double
  var screenY: scala.Double
  var target: reactLib.EventTarget
}

object Touch {
  @scala.inline
  def apply(
    clientX: scala.Double,
    clientY: scala.Double,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    screenX: scala.Double,
    screenY: scala.Double,
    target: reactLib.EventTarget
  ): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, identifier = identifier, pageX = pageX, pageY = pageY, screenX = screenX, screenY = screenY, target = target)
  
    __obj.asInstanceOf[Touch]
  }
}

