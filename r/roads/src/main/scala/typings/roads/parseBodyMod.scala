package typings.roads

import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseBodyMod {
  
  @JSImport("roads/types/middleware/parseBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attempts the parse the request body into a useful object
    */
  @JSImport("roads/types/middleware/parseBody", JSImport.Default)
  @js.native
  def default: Middleware = js.native
  @scala.inline
  def default_=(x: Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
