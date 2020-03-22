package typings.roads.simpleRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.roads.roadMod.ResponseMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteDetails extends js.Object {
  var method: String = js.native
  var path: String = js.native
  @JSName("route")
  var route_Original: Route = js.native
  def route(path: SimpleRouterURL, body: String, headers: StringDictionary[js.Any], next: ResponseMiddleware): js.Promise[typings.roads.responseMod.default] = js.native
}

