package typings.sketchapp

import typings.sketchapp.sketchappStrings.stringAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStringAttribute extends js.Object {
  var _class: stringAttribute
  var attributes: Anon_ForegroundColor
}

object SketchMSStringAttribute {
  @scala.inline
  def apply(_class: stringAttribute, attributes: Anon_ForegroundColor): SketchMSStringAttribute = {
    val __obj = js.Dynamic.literal(_class = _class, attributes = attributes)
  
    __obj.asInstanceOf[SketchMSStringAttribute]
  }
}

