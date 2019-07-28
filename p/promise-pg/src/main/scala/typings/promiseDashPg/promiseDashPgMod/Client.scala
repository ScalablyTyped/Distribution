package typings.promiseDashPg.promiseDashPgMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.promiseDashPg.promiseDashPgStrings.drain
import typings.promiseDashPg.promiseDashPgStrings.error
import typings.promiseDashPg.promiseDashPgStrings.notice
import typings.promiseDashPg.promiseDashPgStrings.notification
import typings.q.qMod.Promise
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "Client")
@js.native
class Client protected () extends js.Object {
  def this(config: ClientConfig) = this()
  def this(connection: String) = this()
  var raw: typings.pg.pgMod.Client = js.native
  def connect(): Promise[Unit] = js.native
  def copyFrom(queryText: String): Writable = js.native
  def copyTo(queryText: String): Readable = js.native
  def end(): Promise[Unit] = js.native
  def on(event: String, listener: js.Function): Client = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): Client = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): Client = js.native
  @JSName("on")
  def on_notice(event: notice, listener: js.Function1[/* message */ js.Any, Unit]): Client = js.native
  @JSName("on")
  def on_notification(event: notification, listener: js.Function1[/* message */ js.Any, Unit]): Client = js.native
  def pauseDrain(): Unit = js.native
  def query(config: QueryConfig): Query = js.native
  def query(queryText: String): Query = js.native
  def query(queryText: String, values: js.Array[_]): Query = js.native
  def resumeDrain(): Unit = js.native
  def transaction(task: js.Function0[Promise[_]]): Promise[_] = js.native
}

