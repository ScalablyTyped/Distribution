package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchExt[Ext] extends js.Object {
  var dispatch: Ext = js.native
}

object DispatchExt {
  @scala.inline
  def apply[Ext](dispatch: Ext): DispatchExt[Ext] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchExt[Ext]]
  }
  @scala.inline
  implicit class DispatchExtOps[Self <: DispatchExt[_], Ext] (val x: Self with DispatchExt[Ext]) extends AnyVal {
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
    def setDispatch(value: Ext): Self = this.set("dispatch", value.asInstanceOf[js.Any])
  }
  
}

