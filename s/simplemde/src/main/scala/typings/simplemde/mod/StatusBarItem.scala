package typings.simplemde.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusBarItem extends js.Object {
  
  var className: String = js.native
  
  def defaultValue(element: HTMLElement): Unit = js.native
  
  def onUpdate(element: HTMLElement): Unit = js.native
}
object StatusBarItem {
  
  @scala.inline
  def apply(className: String, defaultValue: HTMLElement => Unit, onUpdate: HTMLElement => Unit): StatusBarItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultValue = js.Any.fromFunction1(defaultValue), onUpdate = js.Any.fromFunction1(onUpdate))
    __obj.asInstanceOf[StatusBarItem]
  }
  
  @scala.inline
  implicit class StatusBarItemOps[Self <: StatusBarItem] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: HTMLElement => Unit): Self = this.set("defaultValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdate(value: HTMLElement => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
  }
}
