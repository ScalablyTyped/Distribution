package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Noop extends StObject {
  
  /**
    * The action object which was dispatched.
    */
  var action: NavigationAction
  
  /**
    * Whether the action was a no-op, i.e. resulted any state changes.
    */
  var noop: Boolean
  
  /**
    * Stack trace of the action, this will only be available during development.
    */
  var stack: js.UndefOr[String] = js.undefined
}
object Noop {
  
  inline def apply(action: NavigationAction, noop: Boolean): Noop = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop]
  }
  
  extension [Self <: Noop](x: Self) {
    
    inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
