package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.libSharedbMod.AddNumOp
  - typings.sharedb.libSharedbMod.ListInsertOp
  - typings.sharedb.libSharedbMod.ListDeleteOp
  - typings.sharedb.libSharedbMod.ListReplaceOp
  - typings.sharedb.libSharedbMod.ListMoveOp
  - typings.sharedb.libSharedbMod.ObjectInsertOp
  - typings.sharedb.libSharedbMod.ObjectDeleteOp
  - typings.sharedb.libSharedbMod.ObjectReplaceOp
  - typings.sharedb.libSharedbMod.StringInsertOp
  - typings.sharedb.libSharedbMod.StringDeleteOp
  - typings.sharedb.libSharedbMod.SubtypeOp
*/
trait Op extends StObject
object Op {
  
  inline def AddNumOp(na: Double, p: Path): typings.sharedb.libSharedbMod.AddNumOp = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.AddNumOp]
  }
  
  inline def ListDeleteOp(ld: Any, p: Path): typings.sharedb.libSharedbMod.ListDeleteOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ListDeleteOp]
  }
  
  inline def ListInsertOp(li: Any, p: Path): typings.sharedb.libSharedbMod.ListInsertOp = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ListInsertOp]
  }
  
  inline def ListMoveOp(lm: Any, p: Path): typings.sharedb.libSharedbMod.ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ListMoveOp]
  }
  
  inline def ListReplaceOp(ld: Any, li: Any, p: Path): typings.sharedb.libSharedbMod.ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ListReplaceOp]
  }
  
  inline def ObjectDeleteOp(od: Any, p: Path): typings.sharedb.libSharedbMod.ObjectDeleteOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ObjectDeleteOp]
  }
  
  inline def ObjectInsertOp(oi: Any, p: Path): typings.sharedb.libSharedbMod.ObjectInsertOp = {
    val __obj = js.Dynamic.literal(oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ObjectInsertOp]
  }
  
  inline def ObjectReplaceOp(od: Any, oi: Any, p: Path): typings.sharedb.libSharedbMod.ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.ObjectReplaceOp]
  }
  
  inline def StringDeleteOp(p: Path, sd: String): typings.sharedb.libSharedbMod.StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.StringDeleteOp]
  }
  
  inline def StringInsertOp(p: Path, si: String): typings.sharedb.libSharedbMod.StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.StringInsertOp]
  }
  
  inline def SubtypeOp(o: Any, p: Path, t: String): typings.sharedb.libSharedbMod.SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.libSharedbMod.SubtypeOp]
  }
}
