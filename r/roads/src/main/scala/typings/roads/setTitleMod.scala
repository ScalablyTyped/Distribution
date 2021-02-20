package typings.roads

import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setTitleMod {
  
  @JSImport("roads/types/middleware/setTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds two simple functions to get and set a page title on the request context. This is very helpful for isomorphic js, since on the client, page titles aren't part of the rendered view data.
    */
  @JSImport("roads/types/middleware/setTitle", JSImport.Default)
  @js.native
  def default: Middleware = js.native
  @scala.inline
  def default_=(x: Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
