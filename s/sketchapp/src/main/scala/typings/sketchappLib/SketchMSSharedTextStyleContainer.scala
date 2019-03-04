package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedTextStyleContainer extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.sharedTextStyleContainer
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var objects: js.Array[_]
}

object SketchMSSharedTextStyleContainer {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.sharedTextStyleContainer,
    objects: js.Array[_],
    do_objectID: java.lang.String = null
  ): SketchMSSharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class, objects = objects)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSharedTextStyleContainer]
  }
}

