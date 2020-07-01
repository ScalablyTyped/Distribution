package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObject[T] extends js.Object {
  var data: T
  var id: EntityId
  var isIndexing: js.UndefOr[Boolean] = js.undefined
}

object BucketObject {
  @scala.inline
  def apply[T](data: T, id: EntityId, isIndexing: js.UndefOr[Boolean] = js.undefined): BucketObject[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndexing)) __obj.updateDynamic("isIndexing")(isIndexing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObject[T]]
  }
}

