package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeader extends js.Object {
  /**
    * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: js.UndefOr[RouteSpecHttpRouteMatchHeaderMatch] = js.native
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: String = js.native
}

object RouteSpecHttpRouteMatchHeader {
  @scala.inline
  def apply(
    name: String,
    invert: js.UndefOr[Boolean] = js.undefined,
    `match`: RouteSpecHttpRouteMatchHeaderMatch = null
  ): RouteSpecHttpRouteMatchHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.get.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeader]
  }
}

