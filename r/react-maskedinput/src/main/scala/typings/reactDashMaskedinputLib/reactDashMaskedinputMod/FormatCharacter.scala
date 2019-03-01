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
    validate: js.Function1[java.lang.String, java.lang.String],
    transform: js.Function1[/* char */ java.lang.String, java.lang.String] = null
  ): FormatCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validate")(validate)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[FormatCharacter]
  }
}

