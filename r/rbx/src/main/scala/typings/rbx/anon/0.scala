package typings.rbx.anon

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[TDefaultComponent /* <: ReactType[_] */] extends js.Object {
  var as: TDefaultComponent = js.native
}

object `0` {
  @scala.inline
  def apply[/* <: typings.react.mod.ReactType[_] */ TDefaultComponent](as: TDefaultComponent): `0`[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TDefaultComponent]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], /* <: typings.react.mod.ReactType[_] */ TDefaultComponent] (val x: Self with `0`[TDefaultComponent]) extends AnyVal {
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
    def setAs(value: TDefaultComponent): Self = this.set("as", value.asInstanceOf[js.Any])
  }
  
}

