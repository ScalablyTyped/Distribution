package typings.relayDashRuntime.libNetworkRelayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponseWithData extends GraphQLResponse {
  var data: PayloadData
  var errors: js.UndefOr[js.Array[PayloadError]] = js.undefined
  var extensions: js.UndefOr[PayloadExtensions] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object GraphQLResponseWithData {
  @scala.inline
  def apply(
    data: PayloadData,
    errors: js.Array[PayloadError] = null,
    extensions: PayloadExtensions = null,
    label: String = null,
    path: js.Array[Double | String] = null
  ): GraphQLResponseWithData = {
    val __obj = js.Dynamic.literal(data = data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (label != null) __obj.updateDynamic("label")(label)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GraphQLResponseWithData]
  }
}

