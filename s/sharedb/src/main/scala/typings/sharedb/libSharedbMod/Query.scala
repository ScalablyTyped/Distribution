package typings.sharedb.libSharedbMod

import typings.sharedb.libClientMod.Connection
import typings.sharedb.sharedbStrings.qf
import typings.sharedb.sharedbStrings.qs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/sharedb", "Query")
@js.native
open class Query[T] () extends TypedEmitter[QueryEventMap[T]] {
  
  var action: qf | qs = js.native
  
  var collection: String = js.native
  
  var connection: Connection = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: Callback): Unit = js.native
  
  var extra: Any = js.native
  
  var id: String = js.native
  
  var query: RequestQuery = js.native
  
  var ready: Boolean = js.native
  
  var results: js.Array[Doc[T]] = js.native
  
  var sent: Boolean = js.native
}
