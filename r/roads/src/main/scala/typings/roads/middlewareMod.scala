package typings.roads

import typings.roads.roadMod.Middleware
import typings.roads.simpleRouterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads/types/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  @js.native
  /**
    * @param {Road} [road] - The road that will receive the SimpleRouter middleware
    */
  class SimpleRouter () extends default {
    def this(road: typings.roads.roadMod.default) = this()
  }
  
  var cookie: Middleware = js.native
  /**
    * Any requests with trailing slashes will immediately return a Response object redirecting to a non-trailing-slash path
    */
  var killSlash: Middleware = js.native
  /**
    * Attempts the parse the request body into a useful object
    */
  var parseBody: Middleware = js.native
  /**
    * Adds two simple functions to get and set a page title on the request context. This is very helpful for isomorphic js, since on the client, page titles aren't part of the rendered view data.
    */
  var setTitle: Middleware = js.native
  def applyToContext(key: String, `val`: js.Any): Middleware = js.native
  def cors(options: AnonCacheMaxAge): Middleware = js.native
  def reroute(key: String, road: typings.roads.roadMod.default): Middleware = js.native
}

