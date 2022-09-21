package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.sharedbMod.AddNumOp
  - typings.sharedb.sharedbMod.ListInsertOp
  - typings.sharedb.sharedbMod.ListDeleteOp
  - typings.sharedb.sharedbMod.ListReplaceOp
  - typings.sharedb.sharedbMod.ListMoveOp
  - typings.sharedb.sharedbMod.ObjectInsertOp
  - typings.sharedb.sharedbMod.ObjectDeleteOp
  - typings.sharedb.sharedbMod.ObjectReplaceOp
  - typings.sharedb.sharedbMod.StringInsertOp
  - typings.sharedb.sharedbMod.StringDeleteOp
  - typings.sharedb.sharedbMod.SubtypeOp
*/
trait Op extends StObject
object Op {
  
  inline def AddNumOp(na: Double, p: Path): typings.sharedb.sharedbMod.AddNumOp = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.AddNumOp]
  }
  
  inline def ListDeleteOp(ld: Any, p: Path): typings.sharedb.sharedbMod.ListDeleteOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ListDeleteOp]
  }
  
  inline def ListInsertOp(li: Any, p: Path): typings.sharedb.sharedbMod.ListInsertOp = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ListInsertOp]
  }
  
  inline def ListMoveOp(lm: Any, p: Path): typings.sharedb.sharedbMod.ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ListMoveOp]
  }
  
  inline def ListReplaceOp(ld: Any, li: Any, p: Path): typings.sharedb.sharedbMod.ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ListReplaceOp]
  }
  
  inline def ObjectDeleteOp(od: Any, p: Path): typings.sharedb.sharedbMod.ObjectDeleteOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ObjectDeleteOp]
  }
  
  inline def ObjectInsertOp(oi: Any, p: Path): typings.sharedb.sharedbMod.ObjectInsertOp = {
    val __obj = js.Dynamic.literal(oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ObjectInsertOp]
  }
  
  inline def ObjectReplaceOp(od: Any, oi: Any, p: Path): typings.sharedb.sharedbMod.ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.ObjectReplaceOp]
  }
  
  inline def StringDeleteOp(p: Path, sd: String): typings.sharedb.sharedbMod.StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.StringDeleteOp]
  }
  
  inline def StringInsertOp(p: Path, si: String): typings.sharedb.sharedbMod.StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.StringInsertOp]
  }
  
  inline def SubtypeOp(o: Any, p: Path, t: String): typings.sharedb.sharedbMod.SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sharedb.sharedbMod.SubtypeOp]
  }
}
