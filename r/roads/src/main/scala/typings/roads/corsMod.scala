package typings.roads

import typings.roads.anon.CacheMaxAge
import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corsMod {
  
  @JSImport("roads/types/middleware/cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: CacheMaxAge): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
}
