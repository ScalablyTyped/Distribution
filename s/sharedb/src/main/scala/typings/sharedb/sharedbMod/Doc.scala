package typings.sharedb.sharedbMod

import typings.sharedb.clientMod.Connection
import typings.sharedb.sharedbStrings.`type`
import typings.sharedb.sharedbStrings.data
import typings.sharedb.sharedbStrings.v
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/sharedb", "Doc")
@js.native
open class Doc[T] () extends TypedEmitter[DocEventMap[T]] {
  
  var collection: String = js.native
  
  var connection: Connection = js.native
  
  def create(data: Any): Unit = js.native
  def create(data: Any, callback: Callback): Unit = js.native
  def create(data: Any, `type`: String): Unit = js.native
  def create(data: Any, `type`: String, callback: Callback): Unit = js.native
  def create(data: Any, `type`: String, options: Unit, callback: Callback): Unit = js.native
  def create(data: Any, `type`: String, options: ShareDBSourceOptions): Unit = js.native
  def create(data: Any, `type`: String, options: ShareDBSourceOptions, callback: Callback): Unit = js.native
  def create(data: Any, `type`: Unit, callback: Callback): Unit = js.native
  def create(data: Any, `type`: Unit, options: Unit, callback: Callback): Unit = js.native
  def create(data: Any, `type`: Unit, options: ShareDBSourceOptions): Unit = js.native
  def create(data: Any, `type`: Unit, options: ShareDBSourceOptions, callback: Callback): Unit = js.native
  
  var data: T = js.native
  
  def del(options: ShareDBSourceOptions): Unit = js.native
  def del(options: ShareDBSourceOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: Callback): Unit = js.native
  
  def fetch(): Unit = js.native
  def fetch(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  def flush(): Unit = js.native
  
  def hasPending(): Boolean = js.native
  
  def hasWritePending(): Boolean = js.native
  
  var id: String = js.native
  
  def ingestSnapshot(snapshot: Pick[Snapshot[T], v | `type` | data]): Unit = js.native
  def ingestSnapshot(snapshot: Pick[Snapshot[T], v | `type` | data], callback: Callback): Unit = js.native
  
  def pause(): Unit = js.native
  
  var paused: Boolean = js.native
  
  var preventCompose: Boolean = js.native
  
  def resume(): Unit = js.native
  
  def submitOp(data: Any): Unit = js.native
  def submitOp(data: Any, options: Unit, callback: Callback): Unit = js.native
  def submitOp(data: Any, options: ShareDBSourceOptions): Unit = js.native
  def submitOp(data: Any, options: ShareDBSourceOptions, callback: Callback): Unit = js.native
  
  var submitSource: Boolean = js.native
  
  def subscribe(): Unit = js.native
  def subscribe(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  var subscribed: Boolean = js.native
  
  var `type`: Type | Null = js.native
  
  def unsubscribe(): Unit = js.native
  def unsubscribe(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  var version: VersionNumber | Null = js.native
  
  def whenNothingPending(callback: js.Function0[Unit]): Unit = js.native
}
