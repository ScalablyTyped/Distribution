package typings.sqlDotJs.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SqlJs {
  import typings.emscripten.EmscriptenModule
  import typings.std.Partial
  import typings.std.Record
  import typings.std.Uint8Array

  type Config = Partial[EmscriptenModule]
  type ParamsCallback = js.Function1[/* obj */ ParamsObject, Unit]
  type ParamsObject = Record[String, ValueType]
  type ValueType = Double | String | Uint8Array | Null
}
