package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOptions extends js.Object {
  var refetchQueries: js.UndefOr[js.Array[String | (js.Tuple2[String, js.Object])]] = js.undefined
  var refetchQueriesOnFailure: js.UndefOr[Boolean] = js.undefined
}

object MutationOptions {
  @scala.inline
  def apply(
    refetchQueries: js.Array[String | (js.Tuple2[String, js.Object])] = null,
    refetchQueriesOnFailure: js.UndefOr[Boolean] = js.undefined
  ): MutationOptions = {
    val __obj = js.Dynamic.literal()
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchQueriesOnFailure)) __obj.updateDynamic("refetchQueriesOnFailure")(refetchQueriesOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions]
  }
}

