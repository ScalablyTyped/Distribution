package typings.rmcInputNumber.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType
  extends typings.rmcInputNumber.baseMod.PropsType {
  var className: js.UndefOr[js.Any] = js.native
  var downHandler: js.UndefOr[ReactNode] = js.native
  var focusOnUpDown: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var upHandler: js.UndefOr[ReactNode] = js.native
}

object PropsType {
  @scala.inline
  def apply(): PropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
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
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDownHandler(value: ReactNode): Self = this.set("downHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownHandler: Self = this.set("downHandler", js.undefined)
    @scala.inline
    def setFocusOnUpDown(value: Boolean): Self = this.set("focusOnUpDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnUpDown: Self = this.set("focusOnUpDown", js.undefined)
    @scala.inline
    def setFormatter(value: /* v */ js.Any => Unit): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setUpHandler(value: ReactNode): Self = this.set("upHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpHandler: Self = this.set("upHandler", js.undefined)
  }
  
}

