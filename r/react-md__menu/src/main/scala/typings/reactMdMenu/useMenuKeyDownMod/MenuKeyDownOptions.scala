package typings.reactMdMenu.useMenuKeyDownMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuKeyDownOptions extends js.Object {
  
  var defaultFocus: String = js.native
  
  var horizontal: Boolean = js.native
  
  var menu: HTMLDivElement | Null = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  def onRequestClose(): Unit = js.native
  
  var portalled: Boolean = js.native
}
object MenuKeyDownOptions {
  
  @scala.inline
  def apply(defaultFocus: String, horizontal: Boolean, onRequestClose: () => Unit, portalled: Boolean): MenuKeyDownOptions = {
    val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), portalled = portalled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuKeyDownOptions]
  }
  
  @scala.inline
  implicit class MenuKeyDownOptionsOps[Self <: MenuKeyDownOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultFocus(value: String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPortalled(value: Boolean): Self = this.set("portalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: HTMLDivElement): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuNull: Self = this.set("menu", null)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
}
