package typings.reactRelay.mod

import typings.reactRelay.anon.Count
import typings.reactRelay.reactRelayStrings.backward
import typings.reactRelay.reactRelayStrings.forward
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig[Props] extends js.Object {
  var direction: js.UndefOr[backward | forward] = js.undefined
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.undefined
  var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.undefined
  var query: GraphQLTaggedNode
  def getVariables(props: Props, paginationInfo: Count, fragmentVariables: Variables): Variables
}

object ConnectionConfig {
  @scala.inline
  def apply[Props](
    getVariables: (Props, Count, Variables) => Variables,
    query: GraphQLTaggedNode,
    direction: backward | forward = null,
    getConnectionFromProps: /* props */ Props => js.UndefOr[ConnectionData | Null] = null,
    getFragmentVariables: (/* prevVars */ Variables, /* totalCount */ Double) => Variables = null
  ): ConnectionConfig[Props] = {
    val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getConnectionFromProps != null) __obj.updateDynamic("getConnectionFromProps")(js.Any.fromFunction1(getConnectionFromProps))
    if (getFragmentVariables != null) __obj.updateDynamic("getFragmentVariables")(js.Any.fromFunction2(getFragmentVariables))
    __obj.asInstanceOf[ConnectionConfig[Props]]
  }
}

