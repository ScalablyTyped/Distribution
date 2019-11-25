package typings.sketchapp

import typings.sketchapp.sketchappStrings.attributedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSAttributedString extends js.Object {
  var _class: attributedString
  var attributes: js.Array[SketchMSStringAttribute]
  var string: String
}

object SketchMSAttributedString {
  @scala.inline
  def apply(_class: attributedString, attributes: js.Array[SketchMSStringAttribute], string: String): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSAttributedString]
  }
}

