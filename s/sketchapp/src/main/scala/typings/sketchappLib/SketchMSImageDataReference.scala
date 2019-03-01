package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImageDataReference extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.jSONOriginalDataReference
  var _ref: java.lang.String
  var _ref_class: sketchappLib.sketchappLibStrings.imageData
  var data: Anon_Data
  var sha1: Anon_Data
}

object SketchMSImageDataReference {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.jSONOriginalDataReference,
    _ref: java.lang.String,
    _ref_class: sketchappLib.sketchappLibStrings.imageData,
    data: Anon_Data,
    sha1: Anon_Data
  ): SketchMSImageDataReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("_ref")(_ref)
    __obj.updateDynamic("_ref_class")(_ref_class)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("sha1")(sha1)
    __obj.asInstanceOf[SketchMSImageDataReference]
  }
}

