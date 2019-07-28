package typings.simplemde.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStyleOptions extends js.Object {
  var bold: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var italic: js.UndefOr[String] = js.undefined
}

object BlockStyleOptions {
  @scala.inline
  def apply(bold: String = null, code: String = null, italic: String = null): BlockStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold)
    if (code != null) __obj.updateDynamic("code")(code)
    if (italic != null) __obj.updateDynamic("italic")(italic)
    __obj.asInstanceOf[BlockStyleOptions]
  }
}

