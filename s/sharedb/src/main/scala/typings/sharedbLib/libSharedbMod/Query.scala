package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/sharedb", "Query")
@js.native
class Query ()
  extends nodeLib.eventsMod.EventEmitter {
  var extra: js.Any = js.native
  var ready: scala.Boolean = js.native
  var results: js.Array[Doc] = js.native
  def addListener(event: QueryEvent, callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def destroy(): scala.Unit = js.native
  def on(event: QueryEvent, callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def removeListener(event: QueryEvent, listener: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
}

