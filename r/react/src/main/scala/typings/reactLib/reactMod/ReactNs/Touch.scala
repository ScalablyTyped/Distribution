package typings
package reactLib.reactMod.ReactNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Touch]
  }
}

