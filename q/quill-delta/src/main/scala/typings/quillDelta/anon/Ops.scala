package typings.quillDelta.anon

import typings.quillDelta.opMod.Op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ops extends js.Object {
  
  var ops: js.Array[Op] = js.native
}
object Ops {
  
  @scala.inline
  def apply(ops: js.Array[Op]): Ops = {
    val __obj = js.Dynamic.literal(ops = ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ops]
  }
  
  @scala.inline
  implicit class OpsOps[Self <: Ops] (val x: Self) extends AnyVal {
    
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
    def setOpsVarargs(value: Op*): Self = this.set("ops", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: js.Array[Op]): Self = this.set("ops", value.asInstanceOf[js.Any])
  }
}
