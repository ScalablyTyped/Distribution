package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sharedb.sharedb/lib/sharedb.RawOp & {  del :boolean,   create :undefined,   op :undefined} */
@js.native
trait DeleteOp extends StObject {
  
  var c: String = js.native
  
  var create: js.UndefOr[scala.Nothing] = js.native
  
  var d: String = js.native
  
  var del: Boolean = js.native
  
  var m: js.Any = js.native
  
  var op: js.UndefOr[scala.Nothing] = js.native
  
  var seq: Double = js.native
  
  var src: String = js.native
  
  var v: Double = js.native
}
object DeleteOp {
  
  @scala.inline
  def apply(c: String, d: String, del: Boolean, m: js.Any, seq: Double, src: String, v: Double): DeleteOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOp]
  }
  
  @scala.inline
  implicit class DeleteOpMutableBuilder[Self <: DeleteOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: Boolean): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: js.Any): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
