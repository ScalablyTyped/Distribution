package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Op extends js.Object

object Op {
  @scala.inline
  def ListReplaceOp(ld: js.Any, li: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def ListDeleteOp(ld: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def ListInsertOp(li: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def ObjectReplaceOp(od: js.Any, oi: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def ObjectDeleteOp(od: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def StringInsertOp(p: Path, si: String): Op = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def SubtypeOp(o: js.Any, p: Path, t: String): Op = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def ListMoveOp(lm: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def ObjectInsertOp(oi: js.Any, p: Path): Op = {
    val __obj = js.Dynamic.literal(oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def StringDeleteOp(p: Path, sd: String): Op = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  def AddNumOp(na: Double, p: Path): Op = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Op]
  }
}

