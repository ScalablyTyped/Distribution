package typings.reactEmailEditor.anon

import typings.reactEmailEditor.mod.DockPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dock extends js.Object {
  
  val dock: DockPosition = js.native
}
object Dock {
  
  @scala.inline
  def apply(dock: DockPosition): Dock = {
    val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dock]
  }
  
  @scala.inline
  implicit class DockOps[Self <: Dock] (val x: Self) extends AnyVal {
    
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
    def setDock(value: DockPosition): Self = this.set("dock", value.asInstanceOf[js.Any])
  }
}
