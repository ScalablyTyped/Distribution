package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sharedb.sharedb/lib/sharedb.EditOp */
@js.native
trait EditOp extends StObject {
  
  var c: String = js.native
  
  var create: js.UndefOr[scala.Nothing] = js.native
  
  var d: String = js.native
  
  var del: js.UndefOr[scala.Nothing] = js.native
  
  var m: js.Any = js.native
  
  var op: js.Array[typings.sharedb.sharedbMod.Op] = js.native
  
  var seq: Double = js.native
  
  var src: String = js.native
  
  var v: Double = js.native
}
object EditOp {
  
  @scala.inline
  def apply(
    c: String,
    d: String,
    m: js.Any,
    op: js.Array[typings.sharedb.sharedbMod.Op],
    seq: Double,
    src: String,
    v: Double
  ): EditOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOp]
  }
  
  @scala.inline
  implicit class EditOpMutableBuilder[Self <: EditOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: js.Any): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: js.Array[typings.sharedb.sharedbMod.Op]): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpVarargs(value: typings.sharedb.sharedbMod.Op*): Self = StObject.set(x, "op", js.Array(value :_*))
    
    @scala.inline
    def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
