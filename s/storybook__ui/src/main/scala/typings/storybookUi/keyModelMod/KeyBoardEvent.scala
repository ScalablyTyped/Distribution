package typings.storybookUi.keyModelMod

import typings.storybookUi.keyCodesMod.KeyCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBoardEvent extends js.Object {
  val altKey: Boolean = js.native
  val code: String = js.native
  val ctrlKey: Boolean = js.native
  val key: String = js.native
  val keyCodeKey: KeyCode = js.native
  val metaKey: Boolean = js.native
  val shiftKey: Boolean = js.native
}

object KeyBoardEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    code: String,
    ctrlKey: Boolean,
    key: String,
    keyCodeKey: KeyCode,
    metaKey: Boolean,
    shiftKey: Boolean
  ): KeyBoardEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCodeKey = keyCodeKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBoardEvent]
  }
  @scala.inline
  implicit class KeyBoardEventOps[Self <: KeyBoardEvent] (val x: Self) extends AnyVal {
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
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyCodeKey(value: KeyCode): Self = this.set("keyCodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
  }
  
}

