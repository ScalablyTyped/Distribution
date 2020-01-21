package typings.sharedb

import typings.sharedb.clientMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultsArray extends js.Object {
  var results: js.UndefOr[js.Array[Query]] = js.undefined
}

object AnonResultsArray {
  @scala.inline
  def apply(results: js.Array[Query] = null): AnonResultsArray = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultsArray]
  }
}

