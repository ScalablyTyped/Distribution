package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change to the current location.
  */
trait Update extends StObject {
  
  /**
    * The action that triggered the change.
    */
  var action: Action
  
  /**
    * The new location.
    */
  var location: Location1
}
object Update {
  
  inline def apply(action: Action, location: Location1): Update = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location1): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
