package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MSAttributedStringColorAttribute extends js.Object {
  var MSAttributedStringColorAttribute: js.UndefOr[SketchMSColor] = js.undefined
  var MSAttributedStringFontAttribute: js.UndefOr[SketchMSFontAttribute] = js.undefined
  var NSColor: SketchMSKeyValueArchive
  var NSKern: scala.Double
  var NSParagraphStyle: js.UndefOr[SketchMSKeyValueArchive] = js.undefined
}

object Anon_MSAttributedStringColorAttribute {
  @scala.inline
  def apply(
    NSColor: SketchMSKeyValueArchive,
    NSKern: scala.Double,
    MSAttributedStringColorAttribute: SketchMSColor = null,
    MSAttributedStringFontAttribute: SketchMSFontAttribute = null,
    NSParagraphStyle: SketchMSKeyValueArchive = null
  ): Anon_MSAttributedStringColorAttribute = {
    val __obj = js.Dynamic.literal(NSColor = NSColor, NSKern = NSKern)
    if (MSAttributedStringColorAttribute != null) __obj.updateDynamic("MSAttributedStringColorAttribute")(MSAttributedStringColorAttribute)
    if (MSAttributedStringFontAttribute != null) __obj.updateDynamic("MSAttributedStringFontAttribute")(MSAttributedStringFontAttribute)
    if (NSParagraphStyle != null) __obj.updateDynamic("NSParagraphStyle")(NSParagraphStyle)
    __obj.asInstanceOf[Anon_MSAttributedStringColorAttribute]
  }
}

