package typings.sharedb

import typings.sharedb.anon.`0`
import typings.sharedb.sharedbMod.Types
import typings.std.WebSocket
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  
  val types: Types = js.native
  
  @js.native
  class Connection protected () extends js.Object {
    def this(ws: WebSocket) = this()
    def this(ws: ^) = this()
    
    // This direct reference from connection to agent is not used internal to
    // ShareDB, but it is handy for server-side only user code that may cache
    // state on the agent and read it in middleware
    var agent: typings.sharedb.agentMod.^  | Null = js.native
    
    def createFetchQuery(
      collectionName: String,
      query: js.Any,
      options: `0`,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    
    def createSubscribeQuery(
      collectionName: String,
      query: js.Any,
      options: `0`,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]
    ): Query = js.native
    
    def get(collectionName: String, documentID: String): Doc = js.native
  }
  
  type AddNumOp = typings.sharedb.sharedbMod.AddNumOp
  
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
  
  type Query = typings.sharedb.sharedbMod.Query
  
  type ShareDBSourceOptions = typings.sharedb.sharedbMod.ShareDBSourceOptions
  
  type StringDeleteOp = typings.sharedb.sharedbMod.StringDeleteOp
  
  type StringInsertOp = typings.sharedb.sharedbMod.StringInsertOp
  
  type SubtypeOp = typings.sharedb.sharedbMod.SubtypeOp
}
