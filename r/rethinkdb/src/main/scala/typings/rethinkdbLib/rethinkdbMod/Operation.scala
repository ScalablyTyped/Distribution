package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation[T] extends js.Object {
  def run(conn: Connection): js.Promise[T] = js.native
  def run(conn: Connection, cb: js.Function2[/* err */ nodeLib.Error, /* result */ T, scala.Unit]): scala.Unit = js.native
  def run(conn: Connection, opts: OperationOptions): js.Promise[T] = js.native
  /**
    * Run a query on a connection. The callback will get either an error, a single JSON result, or a cursor, depending on the query.
    *
    * See: https://rethinkdb.com/api/javascript/run/
    */
  def run(
    conn: Connection,
    opts: OperationOptions,
    cb: js.Function2[/* err */ nodeLib.Error, /* result */ T, scala.Unit]
  ): scala.Unit = js.native
}

