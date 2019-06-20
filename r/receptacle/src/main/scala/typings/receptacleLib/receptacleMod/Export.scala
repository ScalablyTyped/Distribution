package typings
package receptacleLib.receptacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Export[T, X] extends js.Object {
  var id: scala.Double | java.lang.String
  var items: js.Array[Items[T] with InternalItemData[T]]
  var lastModified: stdLib.Date
  var max: js.UndefOr[scala.Double] = js.undefined
}

object Export {
  @scala.inline
  def apply[T, X](
    id: scala.Double | java.lang.String,
    items: js.Array[Items[T] with InternalItemData[T]],
    lastModified: stdLib.Date,
    max: scala.Int | scala.Double = null
  ): Export[T, X] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items, lastModified = lastModified)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export[T, X]]
  }
}

