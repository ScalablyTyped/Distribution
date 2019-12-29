package typings.sharedb

import typings.std.WebSocket
import typings.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", JSImport.Namespace)
@js.native
object libClientMod extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(ws: WebSocket) = this()
    def this(ws: ^) = this()
    def createFetchQuery(
      collectionName: String,
      query: js.Any,
      options: Anon_ResultsArray,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def createSubscribeQuery(
      collectionName: String,
      query: js.Any,
      options: Anon_ResultsArray,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    def get(collectionName: String, documentID: String): Doc = js.native
  }
  
  type AddNumOp = typings.sharedb.libSharedbMod.AddNumOp
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
  type Query = typings.sharedb.libSharedbMod.Query
  type ShareDBSourceOptions = typings.sharedb.libSharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typings.sharedb.libSharedbMod.StringDeleteOp
  type StringInsertOp = typings.sharedb.libSharedbMod.StringInsertOp
  type SubtypeOp = typings.sharedb.libSharedbMod.SubtypeOp
}

