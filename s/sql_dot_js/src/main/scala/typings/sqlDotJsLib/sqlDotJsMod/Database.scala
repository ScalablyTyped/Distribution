package typings
package sqlDotJsLib.sqlDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql.js", "Database")
@js.native
class Database () extends js.Object {
  def this(data: js.Array[scala.Double]) = this()
  def this(data: nodeLib.Buffer) = this()
  def this(data: stdLib.Uint8Array) = this()
  def close(): scala.Unit = js.native
  def create_function(name: java.lang.String, func: js.Function): scala.Unit = js.native
  def each(sql: java.lang.String, callback: ParamsCallback, done: js.Function0[scala.Unit]): scala.Unit = js.native
  def each(
    sql: java.lang.String,
    params: js.Array[ValueType],
    callback: ParamsCallback,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def each(
    sql: java.lang.String,
    params: ParamsObject,
    callback: ParamsCallback,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def exec(sql: java.lang.String): js.Array[QueryResults] = js.native
  def export(): stdLib.Uint8Array = js.native
  def getRowsModified(): scala.Double = js.native
  def prepare(sql: java.lang.String): Statement = js.native
  def prepare(sql: java.lang.String, params: js.Array[ValueType]): Statement = js.native
  def prepare(sql: java.lang.String, params: ParamsObject): Statement = js.native
  def run(sql: java.lang.String): Database = js.native
  def run(sql: java.lang.String, params: js.Array[ValueType]): Database = js.native
  def run(sql: java.lang.String, params: ParamsObject): Database = js.native
}

