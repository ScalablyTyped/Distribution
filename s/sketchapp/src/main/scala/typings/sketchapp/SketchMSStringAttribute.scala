package typings.sketchapp

import typings.sketchapp.sketchappStrings.stringAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStringAttribute extends js.Object {
  var _class: stringAttribute
  var attributes: SketchMSAttributes
}

object SketchMSStringAttribute {
  @scala.inline
  def apply(_class: stringAttribute, attributes: SketchMSAttributes): SketchMSStringAttribute = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStringAttribute]
  }
}

