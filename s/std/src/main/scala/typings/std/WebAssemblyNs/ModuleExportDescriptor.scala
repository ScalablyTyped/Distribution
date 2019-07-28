package typings.std.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleExportDescriptor extends js.Object {
  var kind: ImportExportKind
  var name: java.lang.String
}

object ModuleExportDescriptor {
  @scala.inline
  def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[ModuleExportDescriptor]
  }
}

