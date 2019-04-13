package typings
package promiseDashPgLib.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "Client")
@js.native
class Client protected () extends js.Object {
  def this(config: ClientConfig) = this()
  def this(connection: java.lang.String) = this()
  var raw: pgLib.pgMod.Client = js.native
  def connect(): qLib.qMod.Promise[scala.Unit] = js.native
  def copyFrom(queryText: java.lang.String): nodeLib.streamMod.Writable = js.native
  def copyTo(queryText: java.lang.String): nodeLib.streamMod.Readable = js.native
  def end(): qLib.qMod.Promise[scala.Unit] = js.native
  def on(event: java.lang.String, listener: js.Function): Client = js.native
  @JSName("on")
  def on_drain(event: promiseDashPgLib.promiseDashPgLibStrings.drain, listener: js.Function0[scala.Unit]): Client = js.native
  @JSName("on")
  def on_error(
    event: promiseDashPgLib.promiseDashPgLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): Client = js.native
  @JSName("on")
  def on_notice(
    event: promiseDashPgLib.promiseDashPgLibStrings.notice,
    listener: js.Function1[/* message */ js.Any, scala.Unit]
  ): Client = js.native
  @JSName("on")
  def on_notification(
    event: promiseDashPgLib.promiseDashPgLibStrings.notification,
    listener: js.Function1[/* message */ js.Any, scala.Unit]
  ): Client = js.native
  def pauseDrain(): scala.Unit = js.native
  def query(config: QueryConfig): Query = js.native
  def query(queryText: java.lang.String): Query = js.native
  def query(queryText: java.lang.String, values: js.Array[_]): Query = js.native
  def resumeDrain(): scala.Unit = js.native
  def transaction(task: js.Function0[qLib.qMod.Promise[_]]): qLib.qMod.Promise[_] = js.native
}

