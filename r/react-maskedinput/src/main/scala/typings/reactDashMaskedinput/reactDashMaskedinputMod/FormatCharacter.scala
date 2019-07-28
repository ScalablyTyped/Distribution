package typings.reactDashMaskedinput.reactDashMaskedinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCharacter extends js.Object {
  var transform: js.UndefOr[js.Function1[/* char */ String, String]] = js.undefined
  def validate(char: String): String
}

object FormatCharacter {
  @scala.inline
  def apply(validate: String => String, transform: /* char */ String => String = null): FormatCharacter = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FormatCharacter]
  }
}

