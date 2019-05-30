package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object

@JSGlobal("WebAssembly.Module")
@js.native
class ModuleCls protected () extends Module {
  def this(bytes: stdLib.BufferSource) = this()
}

@JSGlobal("WebAssembly.Module")
@js.native
object Module
  extends org.scalablytyped.runtime.Instantiable1[/* bytes */ stdLib.BufferSource, Module] {
  def customSections(module: stdLib.WebAssemblyNs.Module, sectionName: java.lang.String): js.Array[stdLib.ArrayBuffer] = js.native
  def exports(module: stdLib.WebAssemblyNs.Module): js.Array[stdLib.WebAssemblyNs.ModuleExportDescriptor] = js.native
  def imports(module: stdLib.WebAssemblyNs.Module): js.Array[stdLib.WebAssemblyNs.ModuleImportDescriptor] = js.native
}

