package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOp
  extends StObject
     with RawOp {
  
  var create: Unit
  
  var del: Boolean
  
  var op: Unit
}
object DeleteOp {
  
  inline def apply(
    c: CollectionName,
    create: Unit,
    d: DocumentID,
    del: Boolean,
    m: Any,
    op: Unit,
    seq: Double,
    src: String,
    v: VersionNumber
  ): DeleteOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOp]
  }
  
  extension [Self <: DeleteOp](x: Self) {
    
    inline def setCreate(value: Unit): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setDel(value: Boolean): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setOp(value: Unit): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
