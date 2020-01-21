package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddNumOp = typings.sharedb.sharedbMod.AddNumOp
  type BasicCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  type DBQueryCallback = js.Function3[
    /* err */ typings.sharedb.mod.Error | scala.Null, 
    /* snapshots */ js.Array[typings.sharedb.sharedbMod.Snapshot], 
    /* extra */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type DBQueryMethod = js.Function5[
    /* collection */ java.lang.String, 
    /* query */ js.Any, 
    /* fields */ js.UndefOr[typings.sharedb.mod.ProjectionFields], 
    /* options */ js.Any, 
    /* callback */ typings.sharedb.mod.DBQueryCallback, 
    scala.Unit
  ]
  type Doc = typings.sharedb.sharedbMod.Doc
  type Error = typings.sharedb.sharedbMod.Error
  type ListDeleteOp = typings.sharedb.sharedbMod.ListDeleteOp
  type ListInsertOp = typings.sharedb.sharedbMod.ListInsertOp
  type ListMoveOp = typings.sharedb.sharedbMod.ListMoveOp
  type ListReplaceOp = typings.sharedb.sharedbMod.ListReplaceOp
  type ObjectDeleteOp = typings.sharedb.sharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typings.sharedb.sharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typings.sharedb.sharedbMod.ObjectReplaceOp
  type Op = typings.sharedb.sharedbMod.Op
  type Path = typings.sharedb.sharedbMod.Path
  type ProjectionFields = org.scalablytyped.runtime.StringDictionary[typings.sharedb.sharedbBooleans.`true`]
  type Query = typings.sharedb.sharedbMod.Query
  type ShareDBSourceOptions = typings.sharedb.sharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typings.sharedb.sharedbMod.StringDeleteOp
  type StringInsertOp = typings.sharedb.sharedbMod.StringInsertOp
  type SubtypeOp = typings.sharedb.sharedbMod.SubtypeOp
}
