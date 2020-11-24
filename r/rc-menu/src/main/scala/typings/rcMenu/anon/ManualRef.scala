package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualRef extends js.Object {
  
  var manualRef: js.Function0[Unit] = js.native
  
  var onMouseEnter: js.Function0[Unit] = js.native
  
  var onMouseLeave: js.Function0[Unit] = js.native
  
  var onSelect: js.Function0[Unit] = js.native
}
object ManualRef {
  
  @scala.inline
  def apply(manualRef: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit, onSelect: () => Unit): ManualRef = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[ManualRef]
  }
  
  @scala.inline
  implicit class ManualRefOps[Self <: ManualRef] (val x: Self) extends AnyVal {
    
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
    def setManualRef(value: () => Unit): Self = this.set("manualRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseEnter(value: () => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelect(value: () => Unit): Self = this.set("onSelect", js.Any.fromFunction0(value))
  }
}
