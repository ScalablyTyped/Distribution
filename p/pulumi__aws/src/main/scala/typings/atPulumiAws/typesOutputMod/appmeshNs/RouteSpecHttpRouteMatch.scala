package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpecHttpRouteMatch extends js.Object {
  /**
    * Specifies the path with which to match requests.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: String
}

object RouteSpecHttpRouteMatch {
  @scala.inline
  def apply(prefix: String): RouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix)
  
    __obj.asInstanceOf[RouteSpecHttpRouteMatch]
  }
}

