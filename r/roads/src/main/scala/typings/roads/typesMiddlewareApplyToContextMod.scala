package typings.roads

import typings.roads.typesCoreRoadMod.Context
import typings.roads.typesCoreRoadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareApplyToContextMod {
  
  @JSImport("roads/types/middleware/applyToContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(key: String, `val`: Any): Middleware[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Middleware[Context]]
}
