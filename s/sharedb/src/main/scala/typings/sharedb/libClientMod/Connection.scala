package typings.sharedb.libClientMod

import typings.sharedb.Anon_ResultsArray
import typings.std.WebSocket
import typings.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", "Connection")
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

