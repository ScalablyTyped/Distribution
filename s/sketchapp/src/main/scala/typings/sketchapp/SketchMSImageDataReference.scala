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
  var data: Anon_Data
  var sha1: Anon_Data
}

object SketchMSImageDataReference {
  @scala.inline
  def apply(
    _class: jSONOriginalDataReference,
    _ref: String,
    _ref_class: imageData,
    data: Anon_Data,
    sha1: Anon_Data
  ): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = _class, _ref = _ref, _ref_class = _ref_class, data = data, sha1 = sha1)
  
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
}

