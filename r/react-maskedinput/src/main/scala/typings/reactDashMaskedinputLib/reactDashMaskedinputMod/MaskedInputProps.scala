package typings
package reactDashMaskedinputLib.reactDashMaskedinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[js.Any] {
  var formatCharacters: js.UndefOr[CharsFormatters] = js.undefined
  var mask: java.lang.String
  var placeholderChar: js.UndefOr[java.lang.String] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    mask: java.lang.String,
    InputHTMLAttributes: reactLib.reactMod.ReactNs.InputHTMLAttributes[js.Any] = null,
    formatCharacters: CharsFormatters = null,
    placeholderChar: java.lang.String = null
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mask")(mask)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (formatCharacters != null) __obj.updateDynamic("formatCharacters")(formatCharacters)
    if (placeholderChar != null) __obj.updateDynamic("placeholderChar")(placeholderChar)
    __obj.asInstanceOf[MaskedInputProps]
  }
}

