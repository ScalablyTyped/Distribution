package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.remixRunRouterStrings.blocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockerBlocked
  extends StObject
     with Blocker {
  
  var location: Location
  
  def proceed(): Unit
  
  def reset(): Unit
  
  var state: blocked
}
object BlockerBlocked {
  
  inline def apply(location: Location, proceed: () => Unit, reset: () => Unit): BlockerBlocked = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], proceed = js.Any.fromFunction0(proceed), reset = js.Any.fromFunction0(reset), state = "blocked")
    __obj.asInstanceOf[BlockerBlocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockerBlocked] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProceed(value: () => Unit): Self = StObject.set(x, "proceed", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setState(value: blocked): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
