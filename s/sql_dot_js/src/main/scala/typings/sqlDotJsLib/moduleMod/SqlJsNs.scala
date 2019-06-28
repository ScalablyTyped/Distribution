package typings
package sqlDotJsLib.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql.js/module", "SqlJs")
@js.native
object SqlJsNs extends js.Object {
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
  
  @js.native
  trait InitSqlJsStatic
    extends js.Function {
    val default: this.type = js.native
    def apply(): js.Promise[SqlJsStatic] = js.native
    def apply(config: Config): js.Promise[SqlJsStatic] = js.native
  }
  
  trait QueryResults extends js.Object {
    var columns: js.Array[java.lang.String]
    var values: js.Array[ValueType]
  }
  
  trait SqlJsStatic extends js.Object {
    var Database: org.scalablytyped.runtime.Instantiable0[Database]
    var Statement: org.scalablytyped.runtime.Instantiable0[Statement]
  }
  
  @js.native
  class Statement () extends js.Object {
    def bind(): scala.Boolean = js.native
    def bind(values: js.Array[ValueType]): scala.Boolean = js.native
    def bind(values: ParamsObject): scala.Boolean = js.native
    def free(): scala.Boolean = js.native
    def freemem(): scala.Unit = js.native
    def get(): js.Array[ValueType] = js.native
    def get(params: js.Array[ValueType]): js.Array[ValueType] = js.native
    def get(params: ParamsObject): js.Array[ValueType] = js.native
    def getAsObject(): ParamsObject = js.native
    def getAsObject(params: js.Array[ValueType]): ParamsObject = js.native
    def getAsObject(params: ParamsObject): ParamsObject = js.native
    def getColumnNames(): js.Array[java.lang.String] = js.native
    def reset(): scala.Unit = js.native
    def run(): scala.Unit = js.native
    def run(values: js.Array[ValueType]): scala.Unit = js.native
    def run(values: ParamsObject): scala.Unit = js.native
    def step(): scala.Boolean = js.native
  }
  
  type Config = stdLib.Partial[emscriptenLib.EmscriptenModule]
  type ParamsCallback = js.Function1[/* obj */ ParamsObject, scala.Unit]
  type ParamsObject = stdLib.Record[java.lang.String, ValueType]
  type ValueType = scala.Double | java.lang.String | stdLib.Uint8Array
}

