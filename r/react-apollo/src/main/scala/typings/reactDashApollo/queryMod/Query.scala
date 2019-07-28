package typings.reactDashApollo.queryMod

import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[TData, TVariables]
  extends Component[QueryProps[TData, TVariables], js.Object, js.Any] {
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
  def componentDidMount_MQuery(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MQuery(prevProps: QueryProps[TData, TVariables]): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MQuery(nextProps: QueryProps[TData, TVariables], nextContext: QueryContext): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MQuery(): Unit = js.native
  def fetchData(): js.Promise[ApolloQueryResult[_]] | Boolean = js.native
}

