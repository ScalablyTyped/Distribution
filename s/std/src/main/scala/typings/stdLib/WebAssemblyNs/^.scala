package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object ^ extends js.Object {
  def compile(bytes: stdLib.BufferSource): js.Promise[Module] = js.native
  def instantiate(bytes: stdLib.BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def instantiate(bytes: stdLib.BufferSource, importObject: js.Any): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def instantiate(moduleObject: Module): js.Promise[Instance] = js.native
  def instantiate(moduleObject: Module, importObject: js.Any): js.Promise[Instance] = js.native
  def validate(bytes: stdLib.BufferSource): scala.Boolean = js.native
}

