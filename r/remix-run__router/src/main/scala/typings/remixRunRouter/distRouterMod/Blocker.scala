package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distHistoryMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.remixRunRouter.distRouterMod.BlockerUnblocked
  - typings.remixRunRouter.distRouterMod.BlockerBlocked
  - typings.remixRunRouter.distRouterMod.BlockerProceeding
*/
trait Blocker extends StObject
object Blocker {
  
  inline def BlockerBlocked(location: Location, proceed: () => Unit, reset: () => Unit): typings.remixRunRouter.distRouterMod.BlockerBlocked = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], proceed = js.Any.fromFunction0(proceed), reset = js.Any.fromFunction0(reset), state = "blocked")
    __obj.asInstanceOf[typings.remixRunRouter.distRouterMod.BlockerBlocked]
  }
  
  inline def BlockerProceeding(location: Location, proceed: Unit, reset: Unit): typings.remixRunRouter.distRouterMod.BlockerProceeding = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], proceed = proceed.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], state = "proceeding")
    __obj.asInstanceOf[typings.remixRunRouter.distRouterMod.BlockerProceeding]
  }
  
  inline def BlockerUnblocked(location: Unit, proceed: Unit, reset: Unit): typings.remixRunRouter.distRouterMod.BlockerUnblocked = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], proceed = proceed.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], state = "unblocked")
    __obj.asInstanceOf[typings.remixRunRouter.distRouterMod.BlockerUnblocked]
  }
}
