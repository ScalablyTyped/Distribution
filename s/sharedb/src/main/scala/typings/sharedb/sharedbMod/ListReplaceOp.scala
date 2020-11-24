package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReplaceOp extends Op {
  
  var ld: js.Any = js.native
  
  var li: js.Any = js.native
  
  var p: Path = js.native
}
object ListReplaceOp {
  
  @scala.inline
  def apply(ld: js.Any, li: js.Any, p: Path): ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReplaceOp]
  }
  
  @scala.inline
  implicit class ListReplaceOpOps[Self <: ListReplaceOp] (val x: Self) extends AnyVal {
    
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
    def setLd(value: js.Any): Self = this.set("ld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLi(value: js.Any): Self = this.set("li", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(value: Path): Self = this.set("p", value.asInstanceOf[js.Any])
  }
}
