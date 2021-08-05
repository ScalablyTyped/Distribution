package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropsBase extends StObject {
  
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onBlur(): Unit
  
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onFocus(): Unit
  
  /**
    * The value of the HTML tabindex attribute the root node will have
    */
  var tabIndex: TabIndex
}
object ComponentPropsBase {
  
  inline def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentPropsBase = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsBase]
  }
  
  extension [Self <: ComponentPropsBase](x: Self) {
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setTabIndex(value: TabIndex): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
