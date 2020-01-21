package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebAssembly {
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typings.std.WebAssembly.Global
    - typings.std.WebAssembly.Memory
    - typings.std.WebAssembly.Table
  */
  type ExportValue = typings.std.WebAssembly._ExportValue | js.Function
  type Exports = typings.std.Record[java.lang.String, typings.std.WebAssembly.ExportValue]
  type ImportValue = typings.std.WebAssembly.ExportValue | scala.Double
  type Imports = typings.std.Record[java.lang.String, typings.std.WebAssembly.ModuleImports]
  type ModuleImports = typings.std.Record[java.lang.String, typings.std.WebAssembly.ImportValue]
  type TableKind = typings.std.stdStrings.anyfunc
}
