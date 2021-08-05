package typings.roads

import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object killSlashMod {
  
  @JSImport("roads/types/middleware/killSlash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Any requests with trailing slashes will immediately return a Response object redirecting to a non-trailing-slash path
    */
  @JSImport("roads/types/middleware/killSlash", JSImport.Default)
  @js.native
  def default: Middleware = js.native
  inline def default_=(x: Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
