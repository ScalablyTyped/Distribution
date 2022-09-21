package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.sharedbBooleans.`true`
import typings.sharedb.sharedbMod.Logger
import typings.sharedb.sharedbMod.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def logger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("logger").asInstanceOf[Logger]
inline def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])

/* static member */
inline def types: Types = ^.asInstanceOf[js.Dynamic].selectDynamic("types").asInstanceOf[Types]
inline def types_=(x: Types): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])

type AddNumOp = typings.sharedb.sharedbMod.AddNumOp

type BasicCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]

type CreateOp = typings.sharedb.sharedbMod.CreateOp

type DBQueryCallback = js.Function3[
/* err */ Error | Null, 
/* snapshots */ js.Array[Snapshot], 
/* extra */ js.UndefOr[Any], 
Unit]

type DBQueryMethod = js.Function5[
/* collection */ String, 
/* query */ Any, 
/* fields */ ProjectionFields, 
/* options */ Any, 
/* callback */ DBQueryCallback, 
Unit]

type DeleteOp = typings.sharedb.sharedbMod.DeleteOp

type Doc = typings.sharedb.sharedbMod.Doc[Any]

type EditOp = typings.sharedb.sharedbMod.EditOp

type Error = typings.sharedb.sharedbMod.Error

type ErrorHandler = js.Function2[/* error */ js.Error, /* context */ ErrorHandlerContext, Unit]

type ListDeleteOp = typings.sharedb.sharedbMod.ListDeleteOp

type ListInsertOp = typings.sharedb.sharedbMod.ListInsertOp

type ListMoveOp = typings.sharedb.sharedbMod.ListMoveOp

type ListReplaceOp = typings.sharedb.sharedbMod.ListReplaceOp

type ObjectDeleteOp = typings.sharedb.sharedbMod.ObjectDeleteOp

type ObjectInsertOp = typings.sharedb.sharedbMod.ObjectInsertOp

type ObjectReplaceOp = typings.sharedb.sharedbMod.ObjectReplaceOp

type Op = typings.sharedb.sharedbMod.Op

type Path = typings.sharedb.sharedbMod.Path

type ProjectionFields = StringDictionary[`true`]

type Query = typings.sharedb.sharedbMod.Query[Any]

type ShareDBSourceOptions = typings.sharedb.sharedbMod.ShareDBSourceOptions

type Snapshot = typings.sharedb.sharedbMod.Snapshot[Any]

type StringDeleteOp = typings.sharedb.sharedbMod.StringDeleteOp

type StringInsertOp = typings.sharedb.sharedbMod.StringInsertOp

type SubtypeOp = typings.sharedb.sharedbMod.SubtypeOp
