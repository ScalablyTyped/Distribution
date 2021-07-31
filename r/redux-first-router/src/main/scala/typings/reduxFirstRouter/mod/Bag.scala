package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bag extends StObject {
  
  var action: ReceivedAction | Action
  
  var extra: js.Any
}
object Bag {
  
  @scala.inline
  def apply(action: ReceivedAction | Action, extra: js.Any): Bag = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
  
  @scala.inline
  implicit class BagMutableBuilder[Self <: Bag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ReceivedAction | Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
  }
}
