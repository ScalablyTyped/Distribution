package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeaderMatch extends js.Object {
  /**
    * The header value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[String] = js.native
  /**
    * Specifies the path with which to match requests.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    * * `range`- (Optional) The object that specifies the range of numbers that the header value sent by the client must be included in.
    */
  var prefix: js.UndefOr[String] = js.native
  var range: js.UndefOr[RouteSpecHttpRouteMatchHeaderMatchRange] = js.native
  /**
    * The header value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[String] = js.native
  /**
    * The header value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[String] = js.native
}

object RouteSpecHttpRouteMatchHeaderMatch {
  @scala.inline
  def apply(
    exact: String = null,
    prefix: String = null,
    range: RouteSpecHttpRouteMatchHeaderMatchRange = null,
    regex: String = null,
    suffix: String = null
  ): RouteSpecHttpRouteMatchHeaderMatch = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatch]
  }
}

