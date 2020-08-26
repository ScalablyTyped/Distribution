package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutablePage
import typings.sketchapp.sketchappStrings.MSJSONFileReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSPageReference extends js.Object {
  var _class: MSJSONFileReference = js.native
  var _ref: String = js.native
  var _ref_class: MSImmutablePage = js.native
}

object SketchMSPageReference {
  @scala.inline
  def apply(_class: MSJSONFileReference, _ref: String, _ref_class: MSImmutablePage): SketchMSPageReference = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSPageReference]
  }
  @scala.inline
  implicit class SketchMSPageReferenceOps[Self <: SketchMSPageReference] (val x: Self) extends AnyVal {
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
    def set_class(value: MSJSONFileReference): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ref(value: String): Self = this.set("_ref", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ref_class(value: MSImmutablePage): Self = this.set("_ref_class", value.asInstanceOf[js.Any])
  }
  
}

