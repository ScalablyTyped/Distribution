package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.remixRunRouterStrings.proceeding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockerProceeding
  extends StObject
     with Blocker {
  
  var location: Location
  
  var proceed: Unit
  
  var reset: Unit
  
  var state: proceeding
}
object BlockerProceeding {
  
  inline def apply(location: Location, proceed: Unit, reset: Unit): BlockerProceeding = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], proceed = proceed.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], state = "proceeding")
    __obj.asInstanceOf[BlockerProceeding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockerProceeding] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProceed(value: Unit): Self = StObject.set(x, "proceed", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Unit): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setState(value: proceeding): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
