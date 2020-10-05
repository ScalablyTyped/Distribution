package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[Ext1, Ext2, Ext3] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 = js.native
}

object `1` {
  @scala.inline
  def apply[Ext1, Ext2, Ext3](dispatch: Ext1 with Ext2 with Ext3): `1`[Ext1, Ext2, Ext3] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[Ext1, Ext2, Ext3]]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_, _, _], Ext1, Ext2, Ext3] (val x: Self with (`1`[Ext1, Ext2, Ext3])) extends AnyVal {
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
    def setDispatch(value: Ext1 with Ext2 with Ext3): Self = this.set("dispatch", value.asInstanceOf[js.Any])
  }
  
}

