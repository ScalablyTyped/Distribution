package typings.sketchapp

import typings.sketchapp.sketchappStrings.assetCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSDocumentAssets extends js.Object {
  var _class: assetCollection
  var colors: js.Array[_]
  var gradients: js.Array[_]
  var imageCollection: SketchMSImageCollection
  var images: js.Array[_]
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
}

