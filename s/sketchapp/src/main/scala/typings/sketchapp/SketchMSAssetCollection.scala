package typings.sketchapp

import typings.sketchapp.sketchappStrings.assetCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSAssetCollection extends js.Object {
  var _class: assetCollection
  var colors: js.Array[_]
  var do_objectID: js.UndefOr[String] = js.undefined
  var gradients: js.Array[_]
  var imageCollection: SketchMSImageCollection
  var images: js.Array[_]
}

object SketchMSAssetCollection {
  @scala.inline
  def apply(
    _class: assetCollection,
    colors: js.Array[_],
    gradients: js.Array[_],
    imageCollection: SketchMSImageCollection,
    images: js.Array[_],
    do_objectID: String = null
  ): SketchMSAssetCollection = {
    val __obj = js.Dynamic.literal(_class = _class, colors = colors, gradients = gradients, imageCollection = imageCollection, images = images)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSAssetCollection]
  }
}

