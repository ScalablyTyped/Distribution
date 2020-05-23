package typings.std.global.WebAssembly

import typings.std.BufferSource
import typings.std.WebAssembly.Imports
import typings.std.WebAssembly.WebAssemblyInstantiatedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.instantiate")
@js.native
object instantiate extends js.Object {
  def apply(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(moduleObject: typings.std.WebAssembly.Module): js.Promise[typings.std.WebAssembly.Instance] = js.native
  def apply(moduleObject: typings.std.WebAssembly.Module, importObject: Imports): js.Promise[typings.std.WebAssembly.Instance] = js.native
}

