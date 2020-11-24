package typings.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modals extends js.Object {
  
  var modals: js.Array[_] = js.native
  
  var overlays: js.Array[_] = js.native
  
  var root: js.Any = js.native
}
object Modals {
  
  @scala.inline
  def apply(modals: js.Array[_], overlays: js.Array[_], root: js.Any): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
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
    def setModalsVarargs(value: js.Any*): Self = this.set("modals", js.Array(value :_*))
    
    @scala.inline
    def setModals(value: js.Array[_]): Self = this.set("modals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysVarargs(value: js.Any*): Self = this.set("overlays", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(value: js.Array[_]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
