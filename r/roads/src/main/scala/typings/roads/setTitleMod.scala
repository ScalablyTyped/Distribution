package typings.roads

import typings.roads.roadMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roads/types/middleware/setTitle", JSImport.Namespace)
@js.native
object setTitleMod extends js.Object {
  
  /**
    * Adds two simple functions to get and set a page title on the request context. This is very helpful for isomorphic js, since on the client, page titles aren't part of the rendered view data.
    */
  var default: Middleware = js.native
}
