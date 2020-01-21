package typings.sqlJs.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SqlJs {
  type Config = typings.std.Partial[typings.emscripten.EmscriptenModule]
  type ParamsCallback = js.Function1[/* obj */ typings.sqlJs.moduleMod.SqlJs.ParamsObject, scala.Unit]
  type ParamsObject = typings.std.Record[java.lang.String, typings.sqlJs.moduleMod.SqlJs.ValueType]
  type ValueType = scala.Double | java.lang.String | typings.std.Uint8Array | scala.Null
}
