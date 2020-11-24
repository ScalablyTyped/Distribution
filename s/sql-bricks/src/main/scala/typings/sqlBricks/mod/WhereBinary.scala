package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhereBinary extends _WhereExpression {
  
  var col: String | SelectStatement = js.native
  
  var op: String = js.native
  
  var quantifier: String = js.native
  
  var `val`: js.Any = js.native
}
object WhereBinary {
  
  @scala.inline
  def apply(col: String | SelectStatement, op: String, quantifier: String, `val`: js.Any): WhereBinary = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereBinary]
  }
  
  @scala.inline
  implicit class WhereBinaryOps[Self <: WhereBinary] (val x: Self) extends AnyVal {
    
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
    def setCol(value: String | SelectStatement): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantifier(value: String): Self = this.set("quantifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: js.Any): Self = this.set("val", value.asInstanceOf[js.Any])
  }
}
