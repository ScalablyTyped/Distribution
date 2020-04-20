package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImageCollection extends js.Object {
  var _class: imageCollection
  var images: js.Array[_]
}

object SketchMSImageCollection {
  @scala.inline
  def apply(_class: imageCollection, images: js.Array[_]): SketchMSImageCollection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageCollection]
  }
}

