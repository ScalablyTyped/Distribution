package typings.reactSwipe.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var child: CSSProperties = js.native
  var container: CSSProperties = js.native
  var wrapper: CSSProperties = js.native
}

object Style {
  @scala.inline
  def apply(child: CSSProperties, container: CSSProperties, wrapper: CSSProperties): Style = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def setChild(value: CSSProperties): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: CSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: CSSProperties): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

