package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeaderMatch extends js.Object {
  /**
    * The header value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[Input[String]] = js.native
  /**
    * The header value sent by the client must begin with the specified characters.
    * * `range`- (Optional) The object that specifies the range of numbers that the header value sent by the client must be included in.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  var range: js.UndefOr[Input[RouteSpecHttpRouteMatchHeaderMatchRange]] = js.native
  /**
    * The header value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[Input[String]] = js.native
  /**
    * The header value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[Input[String]] = js.native
}

object RouteSpecHttpRouteMatchHeaderMatch {
  @scala.inline
  def apply(
    exact: Input[String] = null,
    prefix: Input[String] = null,
    range: Input[RouteSpecHttpRouteMatchHeaderMatchRange] = null,
    regex: Input[String] = null,
    suffix: Input[String] = null
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

