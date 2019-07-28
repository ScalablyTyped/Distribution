package typings.select2.select2Mod

import typings.select2.Anon_More
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedResult[Result] extends js.Object {
  var pagination: js.UndefOr[Anon_More] = js.undefined
  var results: js.Array[Result]
}

object ProcessedResult {
  @scala.inline
  def apply[Result](results: js.Array[Result], pagination: Anon_More = null): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal(results = results)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
}

