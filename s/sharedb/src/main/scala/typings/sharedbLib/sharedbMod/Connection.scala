package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: stdLib.WebSocket) = this()
  def createFetchQuery(
    collectionName: java.lang.String,
    query: java.lang.String,
    options: sharedbLib.Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): sharedbLib.libSharedbMod.Query = js.native
  def createSubscribeQuery(
    collectionName: java.lang.String,
    query: java.lang.String,
    options: sharedbLib.Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): sharedbLib.libSharedbMod.Query = js.native
  def get(collectionName: java.lang.String, documentID: java.lang.String): sharedbLib.libSharedbMod.Doc = js.native
}

