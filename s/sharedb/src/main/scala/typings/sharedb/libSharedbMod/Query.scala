package typings.sharedb.libSharedbMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/sharedb", "Query")
@js.native
class Query () extends EventEmitter {
  var extra: js.Any = js.native
  var ready: Boolean = js.native
  var results: js.Array[Doc] = js.native
  def addListener(event: QueryEvent, callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def destroy(): Unit = js.native
  def on(event: QueryEvent, callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def removeListener(event: QueryEvent, listener: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
}

