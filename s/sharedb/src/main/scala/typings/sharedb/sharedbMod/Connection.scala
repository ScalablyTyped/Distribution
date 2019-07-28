package typings.sharedb.sharedbMod

import typings.sharedb.Anon_Results
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: WebSocket) = this()
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typings.sharedb.libSharedbMod.Query = js.native
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typings.sharedb.libSharedbMod.Query = js.native
  def get(collectionName: String, documentID: String): typings.sharedb.libSharedbMod.Doc = js.native
}

