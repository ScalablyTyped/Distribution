package typings.relayDashRuntime.libStoreRelayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.fetch
import typings.relayDashRuntime.relayDashRuntimeStrings.insert
import typings.relayDashRuntime.relayDashRuntimeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionEvent[TEdge] extends js.Object {
  var args: js.UndefOr[Variables] = js.undefined
  var edge: js.UndefOr[TEdge] = js.undefined
  var edgeData: js.UndefOr[StringDictionary[TEdge]] = js.undefined
  var edges: js.UndefOr[js.Array[TEdge]] = js.undefined
  var kind: js.UndefOr[fetch | insert | update] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
}

object ConnectionEvent {
  @scala.inline
  def apply[TEdge](
    args: Variables = null,
    edge: TEdge = null,
    edgeData: StringDictionary[TEdge] = null,
    edges: js.Array[TEdge] = null,
    kind: fetch = null,
    pageInfo: PageInfo = null
  ): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (edgeData != null) __obj.updateDynamic("edgeData")(edgeData)
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
}

