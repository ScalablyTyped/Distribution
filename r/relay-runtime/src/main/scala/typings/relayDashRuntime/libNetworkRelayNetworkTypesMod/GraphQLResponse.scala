package typings.relayDashRuntime.libNetworkRelayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponseWithData
  - typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponseWithoutData
*/
trait GraphQLResponse extends js.Object

object GraphQLResponse {
  @scala.inline
  def GraphQLResponseWithData(
    data: PayloadData,
    errors: js.Array[PayloadError] = null,
    extensions: PayloadExtensions = null,
    label: String = null,
    path: js.Array[Double | String] = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponse]
  }
  @scala.inline
  def GraphQLResponseWithoutData(
    errors: js.Array[PayloadError],
    data: PayloadData = null,
    extensions: PayloadExtensions = null,
    label: String = null,
    path: js.Array[String | Double] = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponse]
  }
}

