package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  var extKey: Double
  var key: String
  var modifierKey: Double
  var modifiers: Double
}

object KeyboardEvent {
  @scala.inline
  def apply(extKey: Double, key: String, modifierKey: Double, modifiers: Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal(extKey = extKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifierKey = modifierKey.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyboardEvent]
  }
}

