package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `32` extends js.Object {
  var X: typings.screeps.screepsStrings.XZHO2 = js.native
}

object `32` {
  @scala.inline
  def apply(X: typings.screeps.screepsStrings.XZHO2): `32` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  @scala.inline
  implicit class `32Ops`[Self <: `32`] (val x: Self) extends AnyVal {
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
    def setX(value: typings.screeps.screepsStrings.XZHO2): Self = this.set("X", value.asInstanceOf[js.Any])
  }
  
}

