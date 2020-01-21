package typings.sharedb

import typings.sharedb.sharedbMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResults extends js.Object {
  var results: js.UndefOr[js.Array[Query]] = js.undefined
}

object AnonResults {
  @scala.inline
  def apply(results: js.Array[Query] = null): AnonResults = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResults]
  }
}

