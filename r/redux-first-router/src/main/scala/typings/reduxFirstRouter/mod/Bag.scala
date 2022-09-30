package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bag extends StObject {
  
  var action: ReceivedAction | Action
  
  var extra: js.UndefOr[Any] = js.undefined
}
object Bag {
  
  inline def apply(action: ReceivedAction | Action): Bag = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
  
  extension [Self <: Bag](x: Self) {
    
    inline def setAction(value: ReceivedAction | Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
  }
}
