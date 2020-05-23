package typings.std.global.WebAssembly

import typings.std.WebAssembly.Exports
import typings.std.WebAssembly.Imports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Instance")
@js.native
class InstanceCls protected ()
  extends typings.std.WebAssembly.Instance {
  def this(module: typings.std.WebAssembly.Module) = this()
  def this(module: typings.std.WebAssembly.Module, importObject: Imports) = this()
  /* CompleteClass */
  override val exports: Exports = js.native
}

