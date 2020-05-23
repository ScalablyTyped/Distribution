package typings.sharedb.anon

import typings.sharedb.clientMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsArray extends js.Object {
  var results: js.UndefOr[js.Array[Query]] = js.undefined
}

object ResultsArray {
  @scala.inline
  def apply(results: js.Array[Query] = null): ResultsArray = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsArray]
  }
}

