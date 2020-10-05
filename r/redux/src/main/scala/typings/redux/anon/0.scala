package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2 = js.native
}

object `0` {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): `0`[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[Ext1, Ext2]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_, _], Ext1, Ext2] (val x: Self with (`0`[Ext1, Ext2])) extends AnyVal {
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
    def setDispatch(value: Ext1 with Ext2): Self = this.set("dispatch", value.asInstanceOf[js.Any])
  }
  
}

