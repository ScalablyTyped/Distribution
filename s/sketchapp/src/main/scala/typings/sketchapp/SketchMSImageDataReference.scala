package typings.sketchapp

import typings.sketchapp.anon.Data
import typings.sketchapp.sketchappStrings.imageData
import typings.sketchapp.sketchappStrings.jSONOriginalDataReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImageDataReference extends js.Object {
  var _class: jSONOriginalDataReference
  var _ref: String
  var _ref_class: imageData
  var data: Data
  var sha1: Data
}

object SketchMSImageDataReference {
  @scala.inline
  def apply(_class: jSONOriginalDataReference, _ref: String, _ref_class: imageData, data: Data, sha1: Data): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
}

