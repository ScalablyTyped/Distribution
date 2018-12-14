package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryProps[TData, TVariables]
  extends reactDashApolloLib.typesMod.QueryOpts[TVariables] {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData | js.Object, scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit]
  ] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  def children(result: QueryResult[TData, TVariables]): reactLib.reactMod.ReactNs.ReactNode
}

