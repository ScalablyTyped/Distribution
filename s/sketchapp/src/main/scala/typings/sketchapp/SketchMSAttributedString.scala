package typings.sketchapp

import typings.sketchapp.anon.Archive
import typings.sketchapp.sketchappStrings.attributedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSAttributedString extends js.Object {
  var _class: attributedString = js.native
  var archivedAttributedString: js.UndefOr[Archive] = js.native
  var attributes: js.Array[SketchMSStringAttribute] = js.native
  var string: String = js.native
}

object SketchMSAttributedString {
  @scala.inline
  def apply(_class: attributedString, attributes: js.Array[SketchMSStringAttribute], string: String): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributedString]
  }
  @scala.inline
  implicit class SketchMSAttributedStringOps[Self <: SketchMSAttributedString] (val x: Self) extends AnyVal {
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
    def set_class(value: attributedString): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: SketchMSStringAttribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[SketchMSStringAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchivedAttributedString(value: Archive): Self = this.set("archivedAttributedString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchivedAttributedString: Self = this.set("archivedAttributedString", js.undefined)
  }
  
}

