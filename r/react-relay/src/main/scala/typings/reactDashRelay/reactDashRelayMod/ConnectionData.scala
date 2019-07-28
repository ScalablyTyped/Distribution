package typings.reactDashRelay.reactDashRelayMod

import typings.relayDashRuntime.relayDashRuntimeMod.PageInfo
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends js.Object {
  var edges: js.UndefOr[js.Array[_] | Null] = js.undefined
  var pageInfo: js.UndefOr[Partial[PageInfo] | Null] = js.undefined
}

object ConnectionData {
  @scala.inline
  def apply(edges: js.Array[_] = null, pageInfo: Partial[PageInfo] = null): ConnectionData = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    __obj.asInstanceOf[ConnectionData]
  }
}

