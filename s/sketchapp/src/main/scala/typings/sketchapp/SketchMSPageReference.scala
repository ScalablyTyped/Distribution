package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutablePage
import typings.sketchapp.sketchappStrings.MSJSONFileReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPageReference extends js.Object {
  var _class: MSJSONFileReference
  var _ref: String
  var _ref_class: MSImmutablePage
}

object SketchMSPageReference {
  @scala.inline
  def apply(_class: MSJSONFileReference, _ref: String, _ref_class: MSImmutablePage): SketchMSPageReference = {
    val __obj = js.Dynamic.literal(_class = _class, _ref = _ref, _ref_class = _ref_class)
  
    __obj.asInstanceOf[SketchMSPageReference]
  }
}

