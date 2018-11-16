package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var optimisticResponse: js.UndefOr[TData] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]) | reactDashApolloLib.typesMod.RefetchQueriesProviderFn
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

