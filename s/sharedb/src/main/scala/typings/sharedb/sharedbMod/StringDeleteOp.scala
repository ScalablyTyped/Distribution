package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringDeleteOp extends Op {
  
  var p: Path = js.native
  
  var sd: String = js.native
}
object StringDeleteOp {
  
  @scala.inline
  def apply(p: Path, sd: String): StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeleteOp]
  }
  
  @scala.inline
  implicit class StringDeleteOpOps[Self <: StringDeleteOp] (val x: Self) extends AnyVal {
    
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
    def setPVarargs(value: (String | Double)*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(value: Path): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSd(value: String): Self = this.set("sd", value.asInstanceOf[js.Any])
  }
}
