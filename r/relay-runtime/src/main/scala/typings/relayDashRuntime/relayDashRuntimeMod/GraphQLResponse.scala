package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponse extends js.Object {
  var data: js.UndefOr[Null | PayloadData] = js.undefined
  var errors: js.UndefOr[js.Array[PayloadError]] = js.undefined
  var extensions: js.UndefOr[PayloadExtensions] = js.undefined
}

object GraphQLResponse {
  @scala.inline
  def apply(
    data: PayloadData = null,
    errors: js.Array[PayloadError] = null,
    extensions: PayloadExtensions = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[GraphQLResponse]
  }
}

