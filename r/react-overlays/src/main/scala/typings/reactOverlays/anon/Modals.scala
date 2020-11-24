package typings.reactOverlays.anon

import typings.reactOverlays.esmModalManagerMod.ModalInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modals extends js.Object {
  
  var isOverflowing: js.UndefOr[Boolean] = js.native
  
  var modals: js.Array[ModalInstance] = js.native
  
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}
object Modals {
  
  @scala.inline
  def apply(modals: js.Array[ModalInstance]): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
  
  @scala.inline
  implicit class ModalsOps[Self <: Modals] (val x: Self) extends AnyVal {
    
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
    def setModalsVarargs(value: ModalInstance*): Self = this.set("modals", js.Array(value :_*))
    
    @scala.inline
    def setModals(value: js.Array[ModalInstance]): Self = this.set("modals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOverflowing(value: Boolean): Self = this.set("isOverflowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOverflowing: Self = this.set("isOverflowing", js.undefined)
    
    @scala.inline
    def setStyle(value: PartialCSSStyleDeclaratio): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
