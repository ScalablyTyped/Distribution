package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeader extends js.Object {
  /**
    * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
    */
  var invert: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: js.UndefOr[Input[RouteSpecHttpRouteMatchHeaderMatch]] = js.native
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: Input[String] = js.native
}

object RouteSpecHttpRouteMatchHeader {
  @scala.inline
  def apply(
    name: Input[String],
    invert: Input[Boolean] = null,
    `match`: Input[RouteSpecHttpRouteMatchHeaderMatch] = null
  ): RouteSpecHttpRouteMatchHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (invert != null) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeader]
  }
}

