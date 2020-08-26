package typings.sketchapp

import typings.sketchapp.anon.Name
import typings.sketchapp.sketchappStrings.fontDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSFontAttribute extends js.Object {
  var _class: fontDescriptor = js.native
  var attributes: Name = js.native
}

object SketchMSFontAttribute {
  @scala.inline
  def apply(_class: fontDescriptor, attributes: Name): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
  @scala.inline
  implicit class SketchMSFontAttributeOps[Self <: SketchMSFontAttribute] (val x: Self) extends AnyVal {
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
    def set_class(value: fontDescriptor): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: Name): Self = this.set("attributes", value.asInstanceOf[js.Any])
  }
  
}

