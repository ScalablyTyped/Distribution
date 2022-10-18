package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.reactNavigationCore.anon.Data2
import typings.reactNavigationCore.anon.DataNoop
import typings.reactNavigationCore.anon.DataOptionsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationContainerEventMap extends StObject {
  
  /**
    * Event which fires when an action is dispatched.
    * Only intended for debugging purposes, don't use it for app logic.
    * This event will be emitted before state changes have been applied.
    */
  var __unsafe_action__ : DataNoop
  
  /**
    * Event which fires when current options changes.
    */
  var options: DataOptionsObject
  
  /**
    * Event which fires when the navigation state changes.
    */
  var state: Data2
}
object NavigationContainerEventMap {
  
  inline def apply(__unsafe_action__ : DataNoop, options: DataOptionsObject, state: Data2): NavigationContainerEventMap = {
    val __obj = js.Dynamic.literal(__unsafe_action__ = __unsafe_action__.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerEventMap]
  }
  
  extension [Self <: NavigationContainerEventMap](x: Self) {
    
    inline def setOptions(value: DataOptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setState(value: Data2): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def set__unsafe_action__(value: DataNoop): Self = StObject.set(x, "__unsafe_action__", value.asInstanceOf[js.Any])
  }
}
