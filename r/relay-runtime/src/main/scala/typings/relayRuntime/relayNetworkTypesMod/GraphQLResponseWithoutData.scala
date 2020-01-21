package typings.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponseWithoutData extends GraphQLResponse {
  var data: js.UndefOr[PayloadData] = js.undefined
  var errors: js.Array[PayloadError]
  var extensions: js.UndefOr[PayloadExtensions] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object GraphQLResponseWithoutData {
  @scala.inline
  def apply(
    errors: js.Array[PayloadError],
    data: PayloadData = null,
    extensions: PayloadExtensions = null,
    label: String = null,
    path: js.Array[String | Double] = null
  ): GraphQLResponseWithoutData = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponseWithoutData]
  }
}

