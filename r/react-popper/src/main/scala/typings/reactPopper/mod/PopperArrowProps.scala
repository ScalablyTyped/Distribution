package typings.reactPopper.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperArrowProps extends js.Object {
  var ref: Ref[_] = js.native
  var style: CSSProperties = js.native
}

object PopperArrowProps {
  @scala.inline
  def apply(style: CSSProperties): PopperArrowProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperArrowProps]
  }
  @scala.inline
  implicit class PopperArrowPropsOps[Self <: PopperArrowProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

