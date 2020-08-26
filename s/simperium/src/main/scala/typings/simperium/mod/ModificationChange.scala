package typings.simperium.mod

import typings.simperium.simperiumStrings.M
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModificationChange[T] extends Change[T] {
  var ccid: String = js.native
  var d: js.UndefOr[T] = js.native
  var id: String = js.native
  var o: M = js.native
  var sv: js.UndefOr[Double] = js.native
  var v: JSONDiff[T] = js.native
}

object ModificationChange {
  @scala.inline
  def apply[T](ccid: String, id: String, o: M, v: JSONDiff[T]): ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModificationChange[T]]
  }
  @scala.inline
  implicit class ModificationChangeOps[Self <: ModificationChange[_], T] (val x: Self with ModificationChange[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCcid(value: String): Self = this.set("ccid", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setO(value: M): Self = this.set("o", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: JSONDiff[T]): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: T): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setSv(value: Double): Self = this.set("sv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSv: Self = this.set("sv", js.undefined)
  }
  
}

