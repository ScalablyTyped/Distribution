package typings.rcPicker.uiUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardConfig extends js.Object {
  var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
}

object KeyboardConfig {
  @scala.inline
  def apply(): KeyboardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardConfig]
  }
  @scala.inline
  implicit class KeyboardConfigOps[Self <: KeyboardConfig] (val x: Self) extends AnyVal {
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
    def setOnCtrlLeftRight(value: /* diff */ Double => Unit): Self = this.set("onCtrlLeftRight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCtrlLeftRight: Self = this.set("onCtrlLeftRight", js.undefined)
    @scala.inline
    def setOnCtrlLeftRightNull: Self = this.set("onCtrlLeftRight", null)
    @scala.inline
    def setOnEnter(value: () => Unit): Self = this.set("onEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEnterNull: Self = this.set("onEnter", null)
    @scala.inline
    def setOnLeftRight(value: /* diff */ Double => Unit): Self = this.set("onLeftRight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLeftRight: Self = this.set("onLeftRight", js.undefined)
    @scala.inline
    def setOnLeftRightNull: Self = this.set("onLeftRight", null)
    @scala.inline
    def setOnPageUpDown(value: /* diff */ Double => Unit): Self = this.set("onPageUpDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageUpDown: Self = this.set("onPageUpDown", js.undefined)
    @scala.inline
    def setOnPageUpDownNull: Self = this.set("onPageUpDown", null)
    @scala.inline
    def setOnUpDown(value: /* diff */ Double => Unit): Self = this.set("onUpDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpDown: Self = this.set("onUpDown", js.undefined)
    @scala.inline
    def setOnUpDownNull: Self = this.set("onUpDown", null)
  }
  
}

