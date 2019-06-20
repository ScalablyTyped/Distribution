package typings
package receptacleLib.receptacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Items[T]]] = js.undefined
  var lastModified: js.UndefOr[stdLib.Date] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    id: scala.Double | java.lang.String = null,
    items: js.Array[Items[T]] = null,
    lastModified: stdLib.Date = null,
    max: scala.Int | scala.Double = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

