package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebAssembly {
  import typings.std.Record
  import typings.std.stdStrings.anyfunc

  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typings.std.WebAssembly.Global
    - typings.std.WebAssembly.Memory
    - typings.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  type Exports = Record[java.lang.String, ExportValue]
  type ImportValue = ExportValue | Double
  type Imports = Record[java.lang.String, ModuleImports]
  type ModuleImports = Record[java.lang.String, ImportValue]
  type TableKind = anyfunc
}
