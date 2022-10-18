package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditOp
  extends StObject
     with RawOp {
  
  var create: Unit
  
  var del: Unit
  
  var op: js.Array[Any]
}
object EditOp {
  
  inline def apply(
    c: CollectionName,
    create: Unit,
    d: DocumentID,
    del: Unit,
    m: Any,
    op: js.Array[Any],
    seq: Double,
    src: String,
    v: VersionNumber
  ): EditOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOp]
  }
  
  extension [Self <: EditOp](x: Self) {
    
    inline def setCreate(value: Unit): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setDel(value: Unit): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setOp(value: js.Array[Any]): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpVarargs(value: Any*): Self = StObject.set(x, "op", js.Array(value*))
  }
}
