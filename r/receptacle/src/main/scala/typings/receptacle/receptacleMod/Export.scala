package typings.receptacle.receptacleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Export[T, X] extends js.Object {
  var id: Double | String
  var items: js.Array[Items[T] with InternalItemData[T]]
  var lastModified: Date
  var max: js.UndefOr[Double] = js.undefined
}

object Export {
  @scala.inline
  def apply[T, X](
    id: Double | String,
    items: js.Array[Items[T] with InternalItemData[T]],
    lastModified: Date,
    max: Int | Double = null
  ): Export[T, X] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items, lastModified = lastModified)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export[T, X]]
  }
}

