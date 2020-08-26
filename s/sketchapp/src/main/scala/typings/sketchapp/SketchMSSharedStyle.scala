package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSSharedStyle extends js.Object {
  var _class: sharedStyle = js.native
  var name: String = js.native
  var value: SketchMSStyle = js.native
}

object SketchMSSharedStyle {
  @scala.inline
  def apply(_class: sharedStyle, name: String, value: SketchMSStyle): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedStyle]
  }
  @scala.inline
  implicit class SketchMSSharedStyleOps[Self <: SketchMSSharedStyle] (val x: Self) extends AnyVal {
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
    def set_class(value: sharedStyle): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: SketchMSStyle): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

