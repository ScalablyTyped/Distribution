package typings
package sharedbLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/client", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: stdLib.WebSocket) = this()
  def this(ws: wsLib.wsMod.namespaced) = this()
  def createFetchQuery(
    collectionName: java.lang.String,
    query: java.lang.String,
    options: sharedbLib.Anon_ResultsArray,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): Query = js.native
  def createSubscribeQuery(
    collectionName: java.lang.String,
    query: java.lang.String,
    options: sharedbLib.Anon_ResultsArray,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): Query = js.native
  def get(collectionName: java.lang.String, documentID: java.lang.String): Doc = js.native
}

