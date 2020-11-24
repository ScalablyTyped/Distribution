package typings.sharedb.sharedbMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/sharedb", "Query")
@js.native
class Query () extends EventEmitter {
  
  def addListener(event: QueryEvent, callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  
  def destroy(): Unit = js.native
  
  var extra: js.Any = js.native
  
  def on(event: QueryEvent, callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  
  var ready: Boolean = js.native
  
  def removeListener(event: QueryEvent, listener: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  
  var results: js.Array[Doc] = js.native
}
