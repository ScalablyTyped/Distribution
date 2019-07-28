package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImageCollection extends js.Object {
  var _class: imageCollection
  var do_objectID: js.UndefOr[String] = js.undefined
  var images: js.Array[_]
}

object SketchMSImageCollection {
  @scala.inline
  def apply(_class: imageCollection, images: js.Array[_], do_objectID: String = null): SketchMSImageCollection = {
    val __obj = js.Dynamic.literal(_class = _class, images = images)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSImageCollection]
  }
}

