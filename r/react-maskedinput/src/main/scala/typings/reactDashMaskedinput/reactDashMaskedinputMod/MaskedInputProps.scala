package typings.reactDashMaskedinput.reactDashMaskedinputMod

import typings.react.reactMod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps
  extends InputHTMLAttributes[js.Any] {
  var formatCharacters: js.UndefOr[CharsFormatters] = js.undefined
  var mask: String
  var placeholderChar: js.UndefOr[String] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    mask: String,
    InputHTMLAttributes: InputHTMLAttributes[js.Any] = null,
    formatCharacters: CharsFormatters = null,
    placeholderChar: String = null
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal(mask = mask)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (formatCharacters != null) __obj.updateDynamic("formatCharacters")(formatCharacters)
    if (placeholderChar != null) __obj.updateDynamic("placeholderChar")(placeholderChar)
    __obj.asInstanceOf[MaskedInputProps]
  }
}

