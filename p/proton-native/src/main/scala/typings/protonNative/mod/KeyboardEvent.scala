package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent extends js.Object {
  var extKey: Double = js.native
  var key: String = js.native
  var modifierKey: Double = js.native
  var modifiers: Double = js.native
}

object KeyboardEvent {
  @scala.inline
  def apply(extKey: Double, key: String, modifierKey: Double, modifiers: Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal(extKey = extKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifierKey = modifierKey.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtKey(value: Double): Self = this.set("extKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifierKey(value: Double): Self = this.set("modifierKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiers(value: Double): Self = this.set("modifiers", value.asInstanceOf[js.Any])
  }
  
}

