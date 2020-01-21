package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCollectionResponse extends js.Object {
  // collection that was deleted
  var data: js.UndefOr[Collection] = js.undefined
}

object DeleteCollectionResponse {
  @scala.inline
  def apply(data: Collection = null): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
}

