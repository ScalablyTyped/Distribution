package typings.reactOnclickoutside.mod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigObject extends js.Object {
  
  var excludeScrollbar: js.UndefOr[Boolean] = js.native
  
  var handleClickOutside: js.UndefOr[MouseEventHandler[_]] = js.native
}
object ConfigObject {
  
  @scala.inline
  def apply(): ConfigObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigObject]
  }
  
  @scala.inline
  implicit class ConfigObjectOps[Self <: ConfigObject] (val x: Self) extends AnyVal {
    
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
    def setExcludeScrollbar(value: Boolean): Self = this.set("excludeScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeScrollbar: Self = this.set("excludeScrollbar", js.undefined)
    
    @scala.inline
    def setHandleClickOutside(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("handleClickOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleClickOutside: Self = this.set("handleClickOutside", js.undefined)
  }
}
