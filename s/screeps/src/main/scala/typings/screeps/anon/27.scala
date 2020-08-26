package typings.screeps.anon

import typings.screeps.screepsStrings.XUH2O
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `27` extends js.Object {
  var X: XUH2O = js.native
}

object `27` {
  @scala.inline
  def apply(X: XUH2O): `27` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  @scala.inline
  implicit class `27Ops`[Self <: `27`] (val x: Self) extends AnyVal {
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
    def setX(value: XUH2O): Self = this.set("X", value.asInstanceOf[js.Any])
  }
  
}

