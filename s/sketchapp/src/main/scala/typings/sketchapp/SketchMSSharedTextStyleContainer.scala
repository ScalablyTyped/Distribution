package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedTextStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedTextStyleContainer extends js.Object {
  var _class: sharedTextStyleContainer
  var do_objectID: js.UndefOr[String] = js.undefined
  var objects: js.Array[_]
}

object SketchMSSharedTextStyleContainer {
  @scala.inline
  def apply(_class: sharedTextStyleContainer, objects: js.Array[_], do_objectID: String = null): SketchMSSharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class, objects = objects)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSharedTextStyleContainer]
  }
}

