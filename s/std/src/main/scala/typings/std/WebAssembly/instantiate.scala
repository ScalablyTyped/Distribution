package typings.std.WebAssembly

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.instantiate")
@js.native
object instantiate extends js.Object {
  def apply(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(moduleObject: Module): js.Promise[Instance] = js.native
  def apply(moduleObject: Module, importObject: Imports): js.Promise[Instance] = js.native
}

