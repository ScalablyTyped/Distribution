package typings.restify.restifyMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var chain: Chain
  var method: String
  var name: String
  var path: String | RegExp
  var spec: RouteSpec
}

object Route {
  @scala.inline
  def apply(chain: Chain, method: String, name: String, path: String | RegExp, spec: RouteSpec): Route = {
    val __obj = js.Dynamic.literal(chain = chain, method = method, name = name, path = path.asInstanceOf[js.Any], spec = spec)
  
    __obj.asInstanceOf[Route]
  }
}

