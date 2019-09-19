package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSAttributes extends js.Object {
  var MSAttributedStringColorAttribute: SketchMSColor
  var MSAttributedStringFontAttribute: SketchMSFontAttribute
  var kerning: Double
  var paragraphStyle: SketchMSParagraphStyle
}

object SketchMSAttributes {
  @scala.inline
  def apply(
    MSAttributedStringColorAttribute: SketchMSColor,
    MSAttributedStringFontAttribute: SketchMSFontAttribute,
    kerning: Double,
    paragraphStyle: SketchMSParagraphStyle
  ): SketchMSAttributes = {
    val __obj = js.Dynamic.literal(MSAttributedStringColorAttribute = MSAttributedStringColorAttribute, MSAttributedStringFontAttribute = MSAttributedStringFontAttribute, kerning = kerning, paragraphStyle = paragraphStyle)
  
    __obj.asInstanceOf[SketchMSAttributes]
  }
}

