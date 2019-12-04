package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedbMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.sharedb.libSharedbMod.Snapshot
  import typings.sharedb.sharedbNumbers.`true`

  type AddNumOp = typings.sharedb.libSharedbMod.AddNumOp
  type BasicCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], Unit]
  type DBQueryCallback = js.Function3[
    /* err */ Error | Null, 
    /* snapshots */ js.Array[Snapshot], 
    /* extra */ js.UndefOr[js.Any], 
    Unit
  ]
  type DBQueryMethod = js.Function5[
    /* collection */ String, 
    /* query */ js.Any, 
    /* fields */ js.UndefOr[ProjectionFields], 
    /* options */ js.Any, 
    /* callback */ DBQueryCallback, 
    Unit
  ]
  type Doc = typings.sharedb.libSharedbMod.Doc
  type Error = typings.sharedb.libSharedbMod.Error
  type ListDeleteOp = typings.sharedb.libSharedbMod.ListDeleteOp
  type ListInsertOp = typings.sharedb.libSharedbMod.ListInsertOp
  type ListMoveOp = typings.sharedb.libSharedbMod.ListMoveOp
  type ListReplaceOp = typings.sharedb.libSharedbMod.ListReplaceOp
  type ObjectDeleteOp = typings.sharedb.libSharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typings.sharedb.libSharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typings.sharedb.libSharedbMod.ObjectReplaceOp
  type Op = typings.sharedb.libSharedbMod.Op
  type Path = typings.sharedb.libSharedbMod.Path
  type ProjectionFields = StringDictionary[`true`]
  type Query = typings.sharedb.libSharedbMod.Query
  type ShareDBSourceOptions = typings.sharedb.libSharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typings.sharedb.libSharedbMod.StringDeleteOp
  type StringInsertOp = typings.sharedb.libSharedbMod.StringInsertOp
  type SubtypeOp = typings.sharedb.libSharedbMod.SubtypeOp
}
