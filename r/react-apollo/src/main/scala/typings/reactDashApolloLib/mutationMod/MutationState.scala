package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationState[TData] extends js.Object {
  var called: scala.Boolean
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var loading: scala.Boolean
}

object MutationState {
  @scala.inline
  def apply[TData](
    called: scala.Boolean,
    loading: scala.Boolean,
    data: TData = null,
    error: apolloDashClientLib.apolloDashClientMod.ApolloError = null
  ): MutationState[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("called")(called)
    __obj.updateDynamic("loading")(loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MutationState[TData]]
  }
}

