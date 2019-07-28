package typings.sketchapp

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
    val __obj = js.Dynamic.literal(MSAttributedStringFontAttribute = MSAttributedStringFontAttribute, foregroundColor = foregroundColor, paragraphStyle = paragraphStyle)
  
    __obj.asInstanceOf[Anon_ForegroundColor]
  }
}

