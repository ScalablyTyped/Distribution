package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionResponse extends js.Object {
  // collection that was created
  var data: js.UndefOr[Collection] = js.undefined
}

object CreateCollectionResponse {
  @scala.inline
  def apply(data: Collection = null): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionResponse]
  }
}

