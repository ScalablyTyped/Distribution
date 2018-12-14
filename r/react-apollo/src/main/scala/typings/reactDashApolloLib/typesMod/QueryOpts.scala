package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryOpts[TGraphQLVariables] extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[_]] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errorPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined
  var partialRefetch: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[TGraphQLVariables] = js.undefined
}

