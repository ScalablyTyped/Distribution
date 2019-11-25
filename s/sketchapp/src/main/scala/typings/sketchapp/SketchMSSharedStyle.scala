package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedStyle extends js.Object {
  var _class: sharedStyle
  var name: String
  var value: SketchMSStyle
}

object SketchMSSharedStyle {
  @scala.inline
  def apply(_class: sharedStyle, name: String, value: SketchMSStyle): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSSharedStyle]
  }
}

