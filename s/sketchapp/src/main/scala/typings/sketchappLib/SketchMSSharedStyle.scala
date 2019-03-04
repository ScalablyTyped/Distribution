package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedStyle extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.sharedStyle
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var objectID: java.lang.String
  var value: SketchMSStyle
}

object SketchMSSharedStyle {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.sharedStyle,
    name: java.lang.String,
    objectID: java.lang.String,
    value: SketchMSStyle,
    do_objectID: java.lang.String = null
  ): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = _class, name = name, objectID = objectID, value = value)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSharedStyle]
  }
}

