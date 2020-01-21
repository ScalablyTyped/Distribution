package typings.select2.mod

import typings.select2.AnonMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedResult[Result] extends js.Object {
  var pagination: js.UndefOr[AnonMore] = js.undefined
  var results: js.Array[Result]
}

object ProcessedResult {
  @scala.inline
  def apply[Result](results: js.Array[Result], pagination: AnonMore = null): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
}

