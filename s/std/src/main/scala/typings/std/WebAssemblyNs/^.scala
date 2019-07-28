package typings.std.WebAssemblyNs

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object ^ extends js.Object {
  def compile(bytes: BufferSource): js.Promise[Module] = js.native
  def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def instantiate(bytes: BufferSource, importObject: js.Any): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def instantiate(moduleObject: Module): js.Promise[Instance] = js.native
  def instantiate(moduleObject: Module, importObject: js.Any): js.Promise[Instance] = js.native
  def validate(bytes: BufferSource): scala.Boolean = js.native
}

