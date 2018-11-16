package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryProps[TData, TVariables] extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var errorPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData | js.Object, scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit]
  ] = js.undefined
  var partialRefetch: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
  def children(result: QueryResult[TData, TVariables]): reactLib.reactMod.ReactNs.ReactNode
}

