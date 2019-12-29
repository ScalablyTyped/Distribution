package typings.std.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayBuffer
import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object

@JSGlobal("WebAssembly.Module")
@js.native
object Module extends Instantiable1[/* bytes */ BufferSource, Module] {
  def customSections(moduleObject: Module, sectionName: String): js.Array[ArrayBuffer] = js.native
  def exports(moduleObject: Module): js.Array[ModuleExportDescriptor] = js.native
  def imports(moduleObject: Module): js.Array[ModuleImportDescriptor] = js.native
}

