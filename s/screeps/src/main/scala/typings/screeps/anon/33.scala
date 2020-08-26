package typings.screeps.anon

import typings.screeps.screepsStrings.XGHO2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `33` extends js.Object {
  var X: XGHO2 = js.native
}

object `33` {
  @scala.inline
  def apply(X: XGHO2): `33` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`33`]
  }
  @scala.inline
  implicit class `33Ops`[Self <: `33`] (val x: Self) extends AnyVal {
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
    def setX(value: XGHO2): Self = this.set("X", value.asInstanceOf[js.Any])
  }
  
}

