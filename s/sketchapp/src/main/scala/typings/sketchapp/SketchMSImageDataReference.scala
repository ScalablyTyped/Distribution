package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageData
import typings.sketchapp.sketchappStrings.jSONOriginalDataReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImageDataReference extends js.Object {
  var _class: jSONOriginalDataReference
  var _ref: String
  var _ref_class: imageData
  var data: AnonData
  var sha1: AnonData
}

object SketchMSImageDataReference {
  @scala.inline
  def apply(
    _class: jSONOriginalDataReference,
    _ref: String,
    _ref_class: imageData,
    data: AnonData,
    sha1: AnonData
  ): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
}

