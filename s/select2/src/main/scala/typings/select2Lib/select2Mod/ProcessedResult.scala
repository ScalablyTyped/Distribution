package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedResult[Result] extends js.Object {
  var pagination: js.UndefOr[select2Lib.Anon_More] = js.undefined
  var results: js.Array[Result]
}

object ProcessedResult {
  @scala.inline
  def apply[Result](results: js.Array[Result], pagination: select2Lib.Anon_More = null): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
}

