package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.libSharedbMod.Logger
import typings.sharedb.libSharedbMod.Types
import typings.sharedb.sharedbBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def logger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("logger").asInstanceOf[Logger]
inline def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])

/* static member */
inline def types: Types = ^.asInstanceOf[js.Dynamic].selectDynamic("types").asInstanceOf[Types]
inline def types_=(x: Types): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])

type AddNumOp = typings.sharedb.libSharedbMod.AddNumOp

type BasicCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]

type CreateOp = typings.sharedb.libSharedbMod.CreateOp

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

type DeleteOp = typings.sharedb.libSharedbMod.DeleteOp

type Doc = typings.sharedb.libSharedbMod.Doc[Any]

type EditOp = typings.sharedb.libSharedbMod.EditOp

type Error = typings.sharedb.libSharedbMod.Error

type ErrorHandler = js.Function2[/* error */ js.Error, /* context */ ErrorHandlerContext, Unit]

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

type Query = typings.sharedb.libSharedbMod.Query[Any]

type ShareDBSourceOptions = typings.sharedb.libSharedbMod.ShareDBSourceOptions

type Snapshot = typings.sharedb.libSharedbMod.Snapshot[Any]

type StringDeleteOp = typings.sharedb.libSharedbMod.StringDeleteOp

type StringInsertOp = typings.sharedb.libSharedbMod.StringInsertOp

type SubtypeOp = typings.sharedb.libSharedbMod.SubtypeOp
