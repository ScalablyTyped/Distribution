package typings.roads

import typings.roads.typesCoreRoadMod.Context
import typings.roads.typesCoreRoadMod.Middleware
import typings.roads.typesCoreRoadMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareRerouteMod {
  
  @JSImport("roads/types/middleware/reroute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(key: String, road: default): Middleware[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(key.asInstanceOf[js.Any], road.asInstanceOf[js.Any])).asInstanceOf[Middleware[Context]]
}
