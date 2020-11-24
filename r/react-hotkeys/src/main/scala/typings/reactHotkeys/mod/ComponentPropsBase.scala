package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentPropsBase extends js.Object {
  
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onBlur(): Unit = js.native
  
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onFocus(): Unit = js.native
  
  /**
    * The value of the HTML tabindex attribute the root node will have
    */
  var tabIndex: TabIndex = js.native
}
object ComponentPropsBase {
  
  @scala.inline
  def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentPropsBase = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsBase]
  }
  
  @scala.inline
  implicit class ComponentPropsBaseOps[Self <: ComponentPropsBase] (val x: Self) extends AnyVal {
    
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
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTabIndex(value: TabIndex): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
}
