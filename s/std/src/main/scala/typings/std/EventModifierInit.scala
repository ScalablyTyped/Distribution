package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventModifierInit extends UIEventInit {
  var altKey: js.UndefOr[scala.Boolean] = js.native
  var ctrlKey: js.UndefOr[scala.Boolean] = js.native
  var metaKey: js.UndefOr[scala.Boolean] = js.native
  var modifierAltGraph: js.UndefOr[scala.Boolean] = js.native
  var modifierCapsLock: js.UndefOr[scala.Boolean] = js.native
  var modifierFn: js.UndefOr[scala.Boolean] = js.native
  var modifierFnLock: js.UndefOr[scala.Boolean] = js.native
  var modifierHyper: js.UndefOr[scala.Boolean] = js.native
  var modifierNumLock: js.UndefOr[scala.Boolean] = js.native
  var modifierScrollLock: js.UndefOr[scala.Boolean] = js.native
  var modifierSuper: js.UndefOr[scala.Boolean] = js.native
  var modifierSymbol: js.UndefOr[scala.Boolean] = js.native
  var modifierSymbolLock: js.UndefOr[scala.Boolean] = js.native
  var shiftKey: js.UndefOr[scala.Boolean] = js.native
}

object EventModifierInit {
  @scala.inline
  def apply(): EventModifierInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventModifierInit]
  }
  @scala.inline
  implicit class EventModifierInitOps[Self <: EventModifierInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltKey(value: scala.Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    @scala.inline
    def setCtrlKey(value: scala.Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    @scala.inline
    def setMetaKey(value: scala.Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaKey: Self = this.set("metaKey", js.undefined)
    @scala.inline
    def setModifierAltGraph(value: scala.Boolean): Self = this.set("modifierAltGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierAltGraph: Self = this.set("modifierAltGraph", js.undefined)
    @scala.inline
    def setModifierCapsLock(value: scala.Boolean): Self = this.set("modifierCapsLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierCapsLock: Self = this.set("modifierCapsLock", js.undefined)
    @scala.inline
    def setModifierFn(value: scala.Boolean): Self = this.set("modifierFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierFn: Self = this.set("modifierFn", js.undefined)
    @scala.inline
    def setModifierFnLock(value: scala.Boolean): Self = this.set("modifierFnLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierFnLock: Self = this.set("modifierFnLock", js.undefined)
    @scala.inline
    def setModifierHyper(value: scala.Boolean): Self = this.set("modifierHyper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierHyper: Self = this.set("modifierHyper", js.undefined)
    @scala.inline
    def setModifierNumLock(value: scala.Boolean): Self = this.set("modifierNumLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierNumLock: Self = this.set("modifierNumLock", js.undefined)
    @scala.inline
    def setModifierScrollLock(value: scala.Boolean): Self = this.set("modifierScrollLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierScrollLock: Self = this.set("modifierScrollLock", js.undefined)
    @scala.inline
    def setModifierSuper(value: scala.Boolean): Self = this.set("modifierSuper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierSuper: Self = this.set("modifierSuper", js.undefined)
    @scala.inline
    def setModifierSymbol(value: scala.Boolean): Self = this.set("modifierSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierSymbol: Self = this.set("modifierSymbol", js.undefined)
    @scala.inline
    def setModifierSymbolLock(value: scala.Boolean): Self = this.set("modifierSymbolLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierSymbolLock: Self = this.set("modifierSymbolLock", js.undefined)
    @scala.inline
    def setShiftKey(value: scala.Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
  }
  
}

