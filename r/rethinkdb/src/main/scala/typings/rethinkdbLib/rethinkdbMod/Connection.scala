package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var open: scala.Boolean = js.native
  def addListener(event: java.lang.String, cb: js.Function): scala.Unit = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def close(cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def close(opts: NoReplyWait): js.Promise[scala.Unit] = js.native
  def close(opts: NoReplyWait, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function): scala.Unit = js.native
  def reconnect(): js.Promise[Connection] = js.native
  def reconnect(cb: js.Function2[/* err */ nodeLib.Error, /* conn */ this.type, scala.Unit]): scala.Unit = js.native
  def reconnect(opts: NoReplyWait): js.Promise[Connection] = js.native
  def reconnect(opts: NoReplyWait, cb: js.Function2[/* err */ nodeLib.Error, /* conn */ this.type, scala.Unit]): scala.Unit = js.native
  def server(): js.Promise[ServerResult] = js.native
  def server(cb: js.Function2[/* err */ nodeLib.Error, /* conn */ ServerResult, scala.Unit]): scala.Unit = js.native
  def use(dbName: java.lang.String): scala.Unit = js.native
}

