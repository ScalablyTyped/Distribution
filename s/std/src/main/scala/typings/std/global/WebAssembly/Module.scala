package typings.std.global.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.WebAssembly.ModuleExportDescriptor
import typings.std.WebAssembly.ModuleImportDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Module")
@js.native
object Module
  extends Instantiable1[/* bytes */ BufferSource, typings.std.WebAssembly.Module] {
  def customSections(moduleObject: typings.std.WebAssembly.Module, sectionName: String): js.Array[ArrayBuffer] = js.native
  def exports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = js.native
  def imports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = js.native
}

