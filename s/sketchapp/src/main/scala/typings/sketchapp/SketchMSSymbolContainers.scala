package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolContainers extends js.Object {
  var _class: symbolContainer
  var do_objectID: js.UndefOr[String] = js.undefined
  var objects: js.Array[_]
}

object SketchMSSymbolContainers {
  @scala.inline
  def apply(_class: symbolContainer, objects: js.Array[_], do_objectID: String = null): SketchMSSymbolContainers = {
    val __obj = js.Dynamic.literal(_class = _class, objects = objects)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSymbolContainers]
  }
}

