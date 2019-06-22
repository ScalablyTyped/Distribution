package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[TData, TVariables]
  extends reactLib.reactMod.Component[QueryProps[TData, TVariables], js.Object, js.Any] {
  var client: js.Any = js.native
  @JSName("context")
  var context_Query: js.UndefOr[QueryContext] = js.native
  var extractOptsFromProps: js.Any = js.native
  var getQueryResult: js.Any = js.native
  var handleErrorOrCompleted: js.Any = js.native
  var hasMounted: js.Any = js.native
  var initializeQueryObservable: js.Any = js.native
  var lastRenderedResult: js.Any = js.native
  var operation: js.UndefOr[js.Any] = js.native
  var queryObservable: js.UndefOr[js.Any] = js.native
  var querySubscription: js.UndefOr[js.Any] = js.native
  var refetcherQueue: js.UndefOr[js.Any] = js.native
  var removeQuerySubscription: js.Any = js.native
  var resubscribeToQuery: js.Any = js.native
  var setOperations: js.Any = js.native
  var startQuerySubscription: js.Any = js.native
  var updateCurrentData: js.Any = js.native
  var updateQuery: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MQuery(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MQuery(prevProps: QueryProps[TData, TVariables]): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MQuery(nextProps: QueryProps[TData, TVariables], nextContext: QueryContext): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MQuery(): scala.Unit = js.native
  def fetchData(): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]] | scala.Boolean = js.native
}

