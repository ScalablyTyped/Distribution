package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation[T] extends StObject {
  
  def run(conn: Connection): js.Promise[T] = js.native
  def run(conn: Connection, cb: js.Function2[/* err */ js.Error, /* result */ T, Unit]): Unit = js.native
  def run(conn: Connection, opts: OperationOptions): js.Promise[T] = js.native
  /**
    * Run a query on a connection. The callback will get either an error, a single JSON result, or a cursor, depending on the query.
    *
    * See: https://rethinkdb.com/api/javascript/run/
    */
  def run(
    conn: Connection,
    opts: OperationOptions,
    cb: js.Function2[/* err */ js.Error, /* result */ T, Unit]
  ): Unit = js.native
}
