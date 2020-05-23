package typings.select2.mod

import typings.select2.anon.More
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedResult[Result] extends js.Object {
  var pagination: js.UndefOr[More] = js.undefined
  var results: js.Array[Result]
}

object ProcessedResult {
  @scala.inline
  def apply[Result](results: js.Array[Result], pagination: More = null): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
}

