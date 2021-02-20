package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentPropsBase extends StObject {
  
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
  implicit class ComponentPropsBaseMutableBuilder[Self <: ComponentPropsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTabIndex(value: TabIndex): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
