package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedbNs {
  type AddNumOp = sharedbLib.libSharedbMod.AddNumOp
  type Doc = sharedbLib.libSharedbMod.Doc
  type Error = sharedbLib.libSharedbMod.Error
  type ListDeleteOp = sharedbLib.libSharedbMod.ListDeleteOp
  type ListInsertOp = sharedbLib.libSharedbMod.ListInsertOp
  type ListMoveOp = sharedbLib.libSharedbMod.ListMoveOp
  type ListReplaceOp = sharedbLib.libSharedbMod.ListReplaceOp
  type MemoryDB = DB
  type ObjectDeleteOp = sharedbLib.libSharedbMod.ObjectDeleteOp
  type ObjectInsertOp = sharedbLib.libSharedbMod.ObjectInsertOp
  type ObjectReplaceOp = sharedbLib.libSharedbMod.ObjectReplaceOp
  type Op = sharedbLib.libSharedbMod.Op
  type Path = sharedbLib.libSharedbMod.Path
  type Query = sharedbLib.libSharedbMod.Query
  type ShareDBSourceOptions = sharedbLib.libSharedbMod.ShareDBSourceOptions
  type StringDeleteOp = sharedbLib.libSharedbMod.StringDeleteOp
  type StringInsertOp = sharedbLib.libSharedbMod.StringInsertOp
  type SubtypeOp = sharedbLib.libSharedbMod.SubtypeOp
  type UseAction = sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.submit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | (sharedbLib.sharedbLibStrings.`after submit`) | sharedbLib.sharedbLibStrings.receive
  type UseCallback = js.Function2[
    /* request */ sharedbLib.Anon_Req, 
    /* callback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}
