package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatch extends js.Object {
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[js.Array[RouteSpecHttpRouteMatchHeader]] = js.native
  /**
    * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Specifies the path with which to match requests.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    * * `range`- (Optional) The object that specifies the range of numbers that the header value sent by the client must be included in.
    */
  var prefix: String = js.native
  /**
    * The client request header scheme to match on. Valid values: `http`, `https`.
    */
  var scheme: js.UndefOr[String] = js.native
}

object RouteSpecHttpRouteMatch {
  @scala.inline
  def apply(
    prefix: String,
    headers: js.Array[RouteSpecHttpRouteMatchHeader] = null,
    method: String = null,
    scheme: String = null
  ): RouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatch]
  }
}

