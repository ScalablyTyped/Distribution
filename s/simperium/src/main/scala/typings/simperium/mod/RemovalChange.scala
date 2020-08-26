package typings.simperium.mod

import typings.simperium.simperiumStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovalChange
  extends Change[js.Any] {
  var ccid: String = js.native
  var id: String = js.native
  var o: `-_` = js.native
}

object RemovalChange {
  @scala.inline
  def apply(ccid: String, id: String, o: `-_`): RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovalChange]
  }
  @scala.inline
  implicit class RemovalChangeOps[Self <: RemovalChange] (val x: Self) extends AnyVal {
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
    def setO(value: `-_`): Self = this.set("o", value.asInstanceOf[js.Any])
  }
  
}

