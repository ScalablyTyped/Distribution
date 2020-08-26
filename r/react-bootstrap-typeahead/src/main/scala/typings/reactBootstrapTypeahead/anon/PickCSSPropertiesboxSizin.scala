package typings.reactBootstrapTypeahead.anon

import typings.csstype.mod.Property.BoxSizing
import typings.csstype.mod.Property.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.CSSProperties, 'boxSizing' | 'width'> */
@js.native
trait PickCSSPropertiesboxSizin extends js.Object {
  var boxSizing: js.UndefOr[BoxSizing] = js.native
  var width: js.UndefOr[Width[String | Double]] = js.native
}

object PickCSSPropertiesboxSizin {
  @scala.inline
  def apply(): PickCSSPropertiesboxSizin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCSSPropertiesboxSizin]
  }
  @scala.inline
  implicit class PickCSSPropertiesboxSizinOps[Self <: PickCSSPropertiesboxSizin] (val x: Self) extends AnyVal {
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
    def setBoxSizing(value: BoxSizing): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxSizing: Self = this.set("boxSizing", js.undefined)
    @scala.inline
    def setWidth(value: Width[String | Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

