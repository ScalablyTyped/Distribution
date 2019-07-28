package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedStyle extends js.Object {
  var _class: sharedStyle
  var do_objectID: js.UndefOr[String] = js.undefined
  var name: String
  var objectID: String
  var value: SketchMSStyle
}

object SketchMSSharedStyle {
  @scala.inline
  def apply(
    _class: sharedStyle,
    name: String,
    objectID: String,
    value: SketchMSStyle,
    do_objectID: String = null
  ): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = _class, name = name, objectID = objectID, value = value)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSharedStyle]
  }
}

