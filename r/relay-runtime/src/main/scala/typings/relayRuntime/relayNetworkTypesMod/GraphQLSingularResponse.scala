package typings.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData
  - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly
  - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData
*/
trait GraphQLSingularResponse extends js.Object

object GraphQLSingularResponse {
  @scala.inline
  def GraphQLResponseWithData(
    data: PayloadData,
    errors: js.Array[PayloadError] = null,
    extensions: PayloadExtensions = null,
    label: String = null,
    path: js.Array[Double | String] = null
  ): GraphQLSingularResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSingularResponse]
  }
  @scala.inline
  def GraphQLResponseWithExtensionsOnly(data: Null, extensions: PayloadExtensions): GraphQLSingularResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSingularResponse]
  }
  @scala.inline
  def GraphQLResponseWithoutData(
    errors: js.Array[PayloadError],
    data: PayloadData = null,
    extensions: PayloadExtensions = null,
    label: String = null,
    path: js.Array[String | Double] = null
  ): GraphQLSingularResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSingularResponse]
  }
}

