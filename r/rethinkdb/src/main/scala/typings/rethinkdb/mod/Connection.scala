package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  def addListener(event: String, cb: js.Function): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  def close(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def close(opts: NoReplyWait): js.Promise[Unit] = js.native
  def close(opts: NoReplyWait, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def on(event: String, cb: js.Function): Unit = js.native
  
  var open: Boolean = js.native
  
  def reconnect(): js.Promise[Connection] = js.native
  def reconnect(cb: js.Function2[/* err */ js.Error, /* conn */ this.type, Unit]): Unit = js.native
  def reconnect(opts: NoReplyWait): js.Promise[Connection] = js.native
  def reconnect(opts: NoReplyWait, cb: js.Function2[/* err */ js.Error, /* conn */ this.type, Unit]): Unit = js.native
  
  def server(): js.Promise[ServerResult] = js.native
  def server(cb: js.Function2[/* err */ js.Error, /* conn */ ServerResult, Unit]): Unit = js.native
  
  def use(dbName: String): Unit = js.native
}
