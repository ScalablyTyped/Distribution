package typings.roads

import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rerouteMod {
  
  @JSImport("roads/types/middleware/reroute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(key: String, road: typings.roads.roadMod.default): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], road.asInstanceOf[js.Any])).asInstanceOf[Middleware]
}
