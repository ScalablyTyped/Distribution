package typings.simperium.anon

import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`
  extends DiffOp[js.Any] {
  var o: `-_` = js.native
}

object `0` {
  @scala.inline
  def apply(o: `-_`): `0` = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setO(value: `-_`): Self = this.set("o", value.asInstanceOf[js.Any])
  }
  
}

