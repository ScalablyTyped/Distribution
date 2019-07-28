package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCollectionsResponse extends js.Object {
  // list of all collections
  var data: js.UndefOr[js.Array[Collection]] = js.undefined
}

object ListCollectionsResponse {
  @scala.inline
  def apply(data: js.Array[Collection] = null): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ListCollectionsResponse]
  }
}

