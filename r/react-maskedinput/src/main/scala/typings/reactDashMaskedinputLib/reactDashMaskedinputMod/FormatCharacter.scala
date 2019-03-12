package typings
package reactDashMaskedinputLib.reactDashMaskedinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCharacter extends js.Object {
  var transform: js.UndefOr[js.Function1[/* char */ java.lang.String, java.lang.String]] = js.undefined
  def validate(char: java.lang.String): java.lang.String
}

object FormatCharacter {
  @scala.inline
  def apply(
    validate: java.lang.String => java.lang.String,
    transform: /* char */ java.lang.String => java.lang.String = null
  ): FormatCharacter = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[FormatCharacter]
  }
}

