package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBIndexParameters extends js.Object {
  var multiEntry: js.UndefOr[scala.Boolean] = js.native
  var unique: js.UndefOr[scala.Boolean] = js.native
}

object IDBIndexParameters {
  @scala.inline
  def apply(): IDBIndexParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBIndexParameters]
  }
  @scala.inline
  implicit class IDBIndexParametersOps[Self <: IDBIndexParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMultiEntry(value: scala.Boolean): Self = this.set("multiEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiEntry: Self = this.set("multiEntry", js.undefined)
    @scala.inline
    def setUnique(value: scala.Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

