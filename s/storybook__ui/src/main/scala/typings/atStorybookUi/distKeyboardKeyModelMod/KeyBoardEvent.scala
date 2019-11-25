package typings.atStorybookUi.distKeyboardKeyModelMod

import typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBoardEvent extends js.Object {
  val altKey: Boolean
  val code: String
  val ctrlKey: Boolean
  val key: String
  val keyCodeKey: KeyCode
  val metaKey: Boolean
  val shiftKey: Boolean
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
}

