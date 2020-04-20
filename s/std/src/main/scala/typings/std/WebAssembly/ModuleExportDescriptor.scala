package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleExportDescriptor extends js.Object {
  var kind: ImportExportKind
  var name: String
}

object ModuleExportDescriptor {
  @scala.inline
  def apply(kind: ImportExportKind, name: String): ModuleExportDescriptor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExportDescriptor]
  }
}

