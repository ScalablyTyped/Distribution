package typings.storybookApi.refsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubState extends js.Object {
  
  var refs: Refs = js.native
}
object SubState {
  
  @scala.inline
  def apply(refs: Refs): SubState = {
    val __obj = js.Dynamic.literal(refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
    
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
    def setRefs(value: Refs): Self = this.set("refs", value.asInstanceOf[js.Any])
  }
}
