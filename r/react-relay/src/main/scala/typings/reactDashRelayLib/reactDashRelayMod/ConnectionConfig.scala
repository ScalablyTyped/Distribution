package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig[Props] extends js.Object {
  var direction: js.UndefOr[
    reactDashRelayLib.reactDashRelayLibStrings.backward | reactDashRelayLib.reactDashRelayLibStrings.forward
  ] = js.undefined
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | scala.Null]]] = js.undefined
  var getFragmentVariables: js.UndefOr[FragmentVariablesGetter] = js.undefined
  var query: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode
  def getVariables(
    props: Props,
    paginationInfo: reactDashRelayLib.Anon_Count,
    fragmentVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): relayDashRuntimeLib.relayDashRuntimeMod.Variables
}

object ConnectionConfig {
  @scala.inline
  def apply[Props](
    getVariables: (Props, reactDashRelayLib.Anon_Count, relayDashRuntimeLib.relayDashRuntimeMod.Variables) => relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    query: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode,
    direction: reactDashRelayLib.reactDashRelayLibStrings.backward | reactDashRelayLib.reactDashRelayLibStrings.forward = null,
    getConnectionFromProps: /* props */ Props => js.UndefOr[ConnectionData | scala.Null] = null,
    getFragmentVariables: FragmentVariablesGetter = null
  ): ConnectionConfig[Props] = {
    val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getConnectionFromProps != null) __obj.updateDynamic("getConnectionFromProps")(js.Any.fromFunction1(getConnectionFromProps))
    if (getFragmentVariables != null) __obj.updateDynamic("getFragmentVariables")(getFragmentVariables)
    __obj.asInstanceOf[ConnectionConfig[Props]]
  }
}

