package typings.reactMedia.mod

import typings.react.mod.ReactNode
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps extends js.Object {
  var render: js.UndefOr[js.Function0[ReactNode]] = js.native
  var targetWindow: js.UndefOr[Window] = js.native
}

object BaseProps {
  @scala.inline
  def apply(): BaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
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
    def setRender(value: () => ReactNode): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setTargetWindow(value: Window): Self = this.set("targetWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetWindow: Self = this.set("targetWindow", js.undefined)
  }
  
}

