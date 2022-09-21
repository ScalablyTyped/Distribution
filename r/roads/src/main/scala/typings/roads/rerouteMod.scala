package typings.roads

import typings.roads.roadMod.Context
import typings.roads.roadMod.Middleware
import typings.roads.roadMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rerouteMod {
  
  @JSImport("roads/types/middleware/reroute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(key: String, road: default): Middleware[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(key.asInstanceOf[js.Any], road.asInstanceOf[js.Any])).asInstanceOf[Middleware[Context]]
}
