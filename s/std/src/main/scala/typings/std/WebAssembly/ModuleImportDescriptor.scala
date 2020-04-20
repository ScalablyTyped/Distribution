package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImportDescriptor extends js.Object {
  var kind: ImportExportKind
  var module: String
  var name: String
}

object ModuleImportDescriptor {
  @scala.inline
  def apply(kind: ImportExportKind, module: String, name: String): ModuleImportDescriptor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportDescriptor]
  }
}

