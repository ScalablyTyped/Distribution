package typings.reactMotionLoop.mod

import typings.react.mod.ReactElement
import typings.reactMotion.mod.PlainStyle
import typings.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-motion.react-motion.MotionProps> */
@js.native
trait ReactMotionLoopProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, ReactElement]] = js.native
  var defaultStyle: js.UndefOr[PlainStyle] = js.native
  var onRest: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[Style] = js.native
  var styleFrom: Style = js.native
  var styleTo: Style = js.native
}

object ReactMotionLoopProps {
  @scala.inline
  def apply(styleFrom: Style, styleTo: Style): ReactMotionLoopProps = {
    val __obj = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMotionLoopProps]
  }
  @scala.inline
  implicit class ReactMotionLoopPropsOps[Self <: ReactMotionLoopProps] (val x: Self) extends AnyVal {
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
    def setStyleFrom(value: Style): Self = this.set("styleFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleTo(value: Style): Self = this.set("styleTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: /* interpolatedStyle */ PlainStyle => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultStyle(value: PlainStyle): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    @scala.inline
    def setOnRest(value: () => Unit): Self = this.set("onRest", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

