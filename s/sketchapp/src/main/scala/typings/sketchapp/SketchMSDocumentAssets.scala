package typings.sketchapp

import typings.sketchapp.sketchappStrings.assetCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSDocumentAssets extends js.Object {
  var _class: assetCollection = js.native
  var colors: js.Array[_] = js.native
  var gradients: js.Array[_] = js.native
  var imageCollection: SketchMSImageCollection = js.native
  var images: js.Array[_] = js.native
}

object SketchMSDocumentAssets {
  @scala.inline
  def apply(
    _class: assetCollection,
    colors: js.Array[_],
    gradients: js.Array[_],
    imageCollection: SketchMSImageCollection,
    images: js.Array[_]
  ): SketchMSDocumentAssets = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], imageCollection = imageCollection.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocumentAssets]
  }
  @scala.inline
  implicit class SketchMSDocumentAssetsOps[Self <: SketchMSDocumentAssets] (val x: Self) extends AnyVal {
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
    def set_class(value: assetCollection): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradientsVarargs(value: js.Any*): Self = this.set("gradients", js.Array(value :_*))
    @scala.inline
    def setGradients(value: js.Array[_]): Self = this.set("gradients", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageCollection(value: SketchMSImageCollection): Self = this.set("imageCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
  }
  
}

