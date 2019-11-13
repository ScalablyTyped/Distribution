package typings.reactDashQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UpdateQuery extends js.Object {
  var updateQuery: js.UndefOr[String | (js.Tuple2[String, js.Object])] = js.undefined
  var waitForRefetchQueries: js.UndefOr[Boolean] = js.undefined
}

object Anon_UpdateQuery {
  @scala.inline
  def apply(
    updateQuery: String | (js.Tuple2[String, js.Object]) = null,
    waitForRefetchQueries: js.UndefOr[Boolean] = js.undefined
  ): Anon_UpdateQuery = {
    val __obj = js.Dynamic.literal()
    if (updateQuery != null) __obj.updateDynamic("updateQuery")(updateQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForRefetchQueries)) __obj.updateDynamic("waitForRefetchQueries")(waitForRefetchQueries)
    __obj.asInstanceOf[Anon_UpdateQuery]
  }
}

