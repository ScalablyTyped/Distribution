package typings.rcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTextChange extends js.Object {
  /** Must useMemo, to assume that `valueTexts` only match on the first change */
  var valueTexts: js.Array[String]
  def onTextChange(text: String): Unit
}

object OnTextChange {
  @scala.inline
  def apply(onTextChange: String => Unit, valueTexts: js.Array[String]): OnTextChange = {
    val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction1(onTextChange), valueTexts = valueTexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnTextChange]
  }
}

