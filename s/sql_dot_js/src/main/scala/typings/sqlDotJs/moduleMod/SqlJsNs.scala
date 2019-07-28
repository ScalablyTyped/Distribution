package typings.sqlDotJs.moduleMod

import org.scalablytyped.runtime.Instantiable0
import typings.emscripten.EmscriptenModule
import typings.node.Buffer
import typings.sqlDotJs.moduleMod.SqlJsNs.Config
import typings.sqlDotJs.moduleMod.SqlJsNs.Database
import typings.sqlDotJs.moduleMod.SqlJsNs.ParamsCallback
import typings.sqlDotJs.moduleMod.SqlJsNs.ParamsObject
import typings.sqlDotJs.moduleMod.SqlJsNs.QueryResults
import typings.sqlDotJs.moduleMod.SqlJsNs.SqlJsStatic
import typings.sqlDotJs.moduleMod.SqlJsNs.Statement
import typings.sqlDotJs.moduleMod.SqlJsNs.ValueType
import typings.std.Partial
import typings.std.Record
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql.js/module", "SqlJs")
@js.native
object SqlJsNs extends js.Object {
  @js.native
  class Database () extends js.Object {
    def this(data: js.Array[Double]) = this()
    def this(data: Buffer) = this()
    def this(data: Uint8Array) = this()
    def close(): Unit = js.native
    def create_function(name: String, func: js.Function): Unit = js.native
    def each(sql: String, callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
    def each(sql: String, params: js.Array[ValueType], callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
    def each(sql: String, params: ParamsObject, callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
    def exec(sql: String): js.Array[QueryResults] = js.native
    def export(): Uint8Array = js.native
    def getRowsModified(): Double = js.native
    def prepare(sql: String): Statement = js.native
    def prepare(sql: String, params: js.Array[ValueType]): Statement = js.native
    def prepare(sql: String, params: ParamsObject): Statement = js.native
    def run(sql: String): Database = js.native
    def run(sql: String, params: js.Array[ValueType]): Database = js.native
    def run(sql: String, params: ParamsObject): Database = js.native
  }
  
  @js.native
  trait InitSqlJsStatic
    extends js.Function {
    val default: this.type = js.native
    def apply(): js.Promise[SqlJsStatic] = js.native
    def apply(config: Config): js.Promise[SqlJsStatic] = js.native
  }
  
  trait QueryResults extends js.Object {
    var columns: js.Array[String]
    var values: js.Array[ValueType]
  }
  
  trait SqlJsStatic extends js.Object {
    var Database: Instantiable0[typings.sqlDotJs.moduleMod.SqlJsNs.Database]
    var Statement: Instantiable0[typings.sqlDotJs.moduleMod.SqlJsNs.Statement]
  }
  
  @js.native
  class Statement () extends js.Object {
    def bind(): Boolean = js.native
    def bind(values: js.Array[ValueType]): Boolean = js.native
    def bind(values: ParamsObject): Boolean = js.native
    def free(): Boolean = js.native
    def freemem(): Unit = js.native
    def get(): js.Array[ValueType] = js.native
    def get(params: js.Array[ValueType]): js.Array[ValueType] = js.native
    def get(params: ParamsObject): js.Array[ValueType] = js.native
    def getAsObject(): ParamsObject = js.native
    def getAsObject(params: js.Array[ValueType]): ParamsObject = js.native
    def getAsObject(params: ParamsObject): ParamsObject = js.native
    def getColumnNames(): js.Array[String] = js.native
    def reset(): Unit = js.native
    def run(): Unit = js.native
    def run(values: js.Array[ValueType]): Unit = js.native
    def run(values: ParamsObject): Unit = js.native
    def step(): Boolean = js.native
  }
  
  type Config = Partial[EmscriptenModule]
  type ParamsCallback = js.Function1[/* obj */ ParamsObject, Unit]
  type ParamsObject = Record[String, ValueType]
  type ValueType = Double | String | Uint8Array
}

