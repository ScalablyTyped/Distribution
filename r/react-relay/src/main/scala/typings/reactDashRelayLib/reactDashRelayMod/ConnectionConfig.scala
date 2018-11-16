package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionConfig[P] extends js.Object {
  var direction: js.UndefOr[
    reactDashRelayLib.reactDashRelayLibStrings.backward | reactDashRelayLib.reactDashRelayLibStrings.forward
  ] = js.undefined
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ P, js.UndefOr[ConnectionData | scala.Null]]] = js.undefined
  var getFragmentVariables: js.UndefOr[
    js.Function2[
      /* prevVars */ relayDashRuntimeLib.relayDashRuntimeMod.Variables, 
      /* totalCount */ scala.Double, 
      relayDashRuntimeLib.relayDashRuntimeMod.Variables
    ]
  ] = js.undefined
  var query: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  def getVariables(
    props: ScalablyTyped.runtime.StringDictionary[js.Any],
    paginationInfo: reactDashRelayLib.Anon_Count,
    fragmentVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): relayDashRuntimeLib.relayDashRuntimeMod.Variables
}

