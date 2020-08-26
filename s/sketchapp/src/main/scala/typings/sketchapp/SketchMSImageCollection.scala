package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSImageCollection extends js.Object {
  var _class: imageCollection = js.native
  var images: js.Array[_] = js.native
}

object SketchMSImageCollection {
  @scala.inline
  def apply(_class: imageCollection, images: js.Array[_]): SketchMSImageCollection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageCollection]
  }
  @scala.inline
  implicit class SketchMSImageCollectionOps[Self <: SketchMSImageCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_class(value: imageCollection): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
  }
  
}

