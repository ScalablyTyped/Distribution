package typings.receptacle.receptacleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var id: js.UndefOr[Double | String] = js.undefined
  var items: js.UndefOr[js.Array[Items[T]]] = js.undefined
  var lastModified: js.UndefOr[Date] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    id: Double | String = null,
    items: js.Array[Items[T]] = null,
    lastModified: Date = null,
    max: Int | Double = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

