package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var chain: Chain
  var method: java.lang.String
  var name: java.lang.String
  var path: java.lang.String | stdLib.RegExp
  var spec: RouteSpec
}

object Route {
  @scala.inline
  def apply(
    chain: Chain,
    method: java.lang.String,
    name: java.lang.String,
    path: java.lang.String | stdLib.RegExp,
    spec: RouteSpec
  ): Route = {
    val __obj = js.Dynamic.literal(chain = chain, method = method, name = name, path = path.asInstanceOf[js.Any], spec = spec)
  
    __obj.asInstanceOf[Route]
  }
}

