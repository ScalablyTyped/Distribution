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
    val __obj = js.Dynamic.literal(MSAttributedStringColorAttribute = MSAttributedStringColorAttribute.asInstanceOf[js.Any], MSAttributedStringFontAttribute = MSAttributedStringFontAttribute.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], paragraphStyle = paragraphStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributes]
  }
}

