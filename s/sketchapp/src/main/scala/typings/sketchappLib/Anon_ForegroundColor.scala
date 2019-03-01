package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForegroundColor extends js.Object {
  var MSAttributedStringFontAttribute: Anon_Attributes
  var foregroundColor: SketchMSKeyValueArchive
  var paragraphStyle: Anon_AllowsDefaultTighteningForTruncation
}

object Anon_ForegroundColor {
  @scala.inline
  def apply(
    MSAttributedStringFontAttribute: Anon_Attributes,
    foregroundColor: SketchMSKeyValueArchive,
    paragraphStyle: Anon_AllowsDefaultTighteningForTruncation
  ): Anon_ForegroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSAttributedStringFontAttribute")(MSAttributedStringFontAttribute)
    __obj.updateDynamic("foregroundColor")(foregroundColor)
    __obj.updateDynamic("paragraphStyle")(paragraphStyle)
    __obj.asInstanceOf[Anon_ForegroundColor]
  }
}

