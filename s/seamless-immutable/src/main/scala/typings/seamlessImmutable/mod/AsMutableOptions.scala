package typings.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsMutableOptions[TDeep /* <: Boolean */] extends js.Object {
  var deep: TDeep = js.native
}

object AsMutableOptions {
  @scala.inline
  def apply[/* <: scala.Boolean */ TDeep](deep: TDeep): AsMutableOptions[TDeep] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsMutableOptions[TDeep]]
  }
  @scala.inline
  implicit class AsMutableOptionsOps[Self <: AsMutableOptions[_], /* <: scala.Boolean */ TDeep] (val x: Self with AsMutableOptions[TDeep]) extends AnyVal {
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
    def setDeep(value: TDeep): Self = this.set("deep", value.asInstanceOf[js.Any])
  }
  
}

