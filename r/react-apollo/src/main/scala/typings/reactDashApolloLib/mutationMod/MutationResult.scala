package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationResult[TData] extends js.Object {
  var called: scala.Boolean
  var client: apolloDashClientLib.apolloDashClientMod.default[js.Object]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var loading: scala.Boolean
}

