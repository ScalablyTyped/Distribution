package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditOp
  extends StObject
     with RawOp {
  
  var create: Unit
  
  var del: Unit
  
  var op: js.Array[Op]
}
object EditOp {
  
  @scala.inline
  def apply(
    c: String,
    create: Unit,
    d: String,
    del: Unit,
    m: js.Any,
    op: js.Array[Op],
    seq: Double,
    src: String,
    v: Double
  ): EditOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOp]
  }
  
  @scala.inline
  implicit class EditOpMutableBuilder[Self <: EditOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Unit): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: Unit): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: js.Array[Op]): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpVarargs(value: Op*): Self = StObject.set(x, "op", js.Array(value :_*))
  }
}
