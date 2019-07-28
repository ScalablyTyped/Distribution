package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedStyleContainer extends js.Object {
  var _class: sharedStyleContainer
  var do_objectID: js.UndefOr[String] = js.undefined
  var objects: js.Array[SketchMSSharedStyle]
}

object SketchMSSharedStyleContainer {
  @scala.inline
  def apply(_class: sharedStyleContainer, objects: js.Array[SketchMSSharedStyle], do_objectID: String = null): SketchMSSharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class, objects = objects)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSharedStyleContainer]
  }
}

