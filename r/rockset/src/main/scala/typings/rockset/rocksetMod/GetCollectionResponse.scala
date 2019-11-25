package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCollectionResponse extends js.Object {
  // collection that was requested
  var data: js.UndefOr[Collection] = js.undefined
}

object GetCollectionResponse {
  @scala.inline
  def apply(data: Collection = null): GetCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCollectionResponse]
  }
}

