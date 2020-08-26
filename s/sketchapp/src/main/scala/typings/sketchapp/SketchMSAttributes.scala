package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSAttributes extends js.Object {
  var MSAttributedStringColorAttribute: SketchMSColor = js.native
  var MSAttributedStringFontAttribute: SketchMSFontAttribute = js.native
  var kerning: Double = js.native
  var paragraphStyle: SketchMSParagraphStyle = js.native
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
  @scala.inline
  implicit class SketchMSAttributesOps[Self <: SketchMSAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSAttributedStringColorAttribute(value: SketchMSColor): Self = this.set("MSAttributedStringColorAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSAttributedStringFontAttribute(value: SketchMSFontAttribute): Self = this.set("MSAttributedStringFontAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setKerning(value: Double): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraphStyle(value: SketchMSParagraphStyle): Self = this.set("paragraphStyle", value.asInstanceOf[js.Any])
  }
  
}

