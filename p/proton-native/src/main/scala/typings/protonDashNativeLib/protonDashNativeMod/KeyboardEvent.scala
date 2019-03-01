package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  var extKey: scala.Double
  var key: java.lang.String
  var modifierKey: scala.Double
  var modifiers: scala.Double
}

object KeyboardEvent {
  @scala.inline
  def apply(extKey: scala.Double, key: java.lang.String, modifierKey: scala.Double, modifiers: scala.Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extKey")(extKey)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("modifierKey")(modifierKey)
    __obj.updateDynamic("modifiers")(modifiers)
    __obj.asInstanceOf[KeyboardEvent]
  }
}

