package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatch extends js.Object {
  /**
    * Specifies the path with which to match requests.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: String = js.native
}

object RouteSpecHttpRouteMatch {
  @scala.inline
  def apply(prefix: String): RouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecHttpRouteMatch]
  }
}

