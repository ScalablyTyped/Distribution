package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedStyleContainer extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.sharedStyleContainer
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var objects: js.Array[SketchMSSharedStyle]
}

object SketchMSSharedStyleContainer {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.sharedStyleContainer,
    objects: js.Array[SketchMSSharedStyle],
    do_objectID: java.lang.String = null
  ): SketchMSSharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class, objects = objects)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSharedStyleContainer]
  }
}

