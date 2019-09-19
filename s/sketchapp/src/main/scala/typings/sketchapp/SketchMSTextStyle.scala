package typings.sketchapp

import typings.sketchapp.sketchappStrings.textStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSTextStyle extends js.Object {
  var _class: textStyle
  var encodedAttributes: SketchMSAttributes
}

object SketchMSTextStyle {
  @scala.inline
  def apply(_class: textStyle, encodedAttributes: SketchMSAttributes): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal(_class = _class, encodedAttributes = encodedAttributes)
  
    __obj.asInstanceOf[SketchMSTextStyle]
  }
}

