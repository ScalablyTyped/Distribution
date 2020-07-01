package typings.simperium.mod

import typings.simperium.simperiumStrings.M
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModificationChange[T] extends Change[T] {
  var ccid: String
  var d: js.UndefOr[T] = js.undefined
  var id: String
  var o: M
  var sv: js.UndefOr[Double] = js.undefined
  var v: JSONDiff[T]
}

object ModificationChange {
  @scala.inline
  def apply[T](ccid: String, id: String, o: M, v: JSONDiff[T], d: T = null, sv: js.UndefOr[Double] = js.undefined): ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (!js.isUndefined(sv)) __obj.updateDynamic("sv")(sv.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModificationChange[T]]
  }
}

