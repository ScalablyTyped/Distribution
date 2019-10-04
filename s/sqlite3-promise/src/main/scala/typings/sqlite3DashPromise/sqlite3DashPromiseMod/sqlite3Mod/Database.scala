package typings.sqlite3DashPromise.sqlite3DashPromiseMod.sqlite3Mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def allAsync(sql: String): js.Promise[js.Array[_]] = js.native
  def closeAsync(): js.Promise[Unit] = js.native
  def eachAsync(sql: String): js.Promise[Double] = js.native
  def eachAsync(
    sql: String,
    cb: js.ThisFunction2[
      /* this */ typings.sqlite3.sqlite3Mod.Statement, 
      /* err */ Error | Null, 
      /* row */ js.Any, 
      Unit
    ]
  ): js.Promise[Double] = js.native
  def eachAsync(sql: String, params: js.Any): js.Promise[Double] = js.native
  def eachAsync(
    sql: String,
    params: js.Any,
    cb: js.ThisFunction2[
      /* this */ typings.sqlite3.sqlite3Mod.Statement, 
      /* err */ Error | Null, 
      /* row */ js.Any, 
      Unit
    ]
  ): js.Promise[Double] = js.native
  def execAsync(sql: String): js.Promise[typings.sqlite3.sqlite3Mod.Statement] = js.native
  def getAsync(sql: String): js.Promise[_] = js.native
  def runAsync(sql: String): js.Promise[Unit] = js.native
}

