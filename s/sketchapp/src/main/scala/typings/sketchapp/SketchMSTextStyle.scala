package typings.sketchapp

import typings.sketchapp.sketchappStrings.textStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSTextStyle extends js.Object {
  var _class: textStyle
  var encodedAttributes: Anon_MSAttributedStringColorAttribute
}

object SketchMSTextStyle {
  @scala.inline
  def apply(_class: textStyle, encodedAttributes: Anon_MSAttributedStringColorAttribute): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal(_class = _class, encodedAttributes = encodedAttributes)
  
    __obj.asInstanceOf[SketchMSTextStyle]
  }
}

