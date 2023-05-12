package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.remixRunRouterStrings.unblocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockerUnblocked
  extends StObject
     with Blocker {
  
  var location: Unit
  
  var proceed: Unit
  
  var reset: Unit
  
  var state: unblocked
}
object BlockerUnblocked {
  
  inline def apply(location: Unit, proceed: Unit, reset: Unit): BlockerUnblocked = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], proceed = proceed.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], state = "unblocked")
    __obj.asInstanceOf[BlockerUnblocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockerUnblocked] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Unit): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProceed(value: Unit): Self = StObject.set(x, "proceed", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Unit): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setState(value: unblocked): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
