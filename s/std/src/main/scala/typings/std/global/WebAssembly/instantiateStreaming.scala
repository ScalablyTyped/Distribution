package typings.std.global.WebAssembly

import typings.std.Response
import typings.std.WebAssembly.Imports
import typings.std.WebAssembly.WebAssemblyInstantiatedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.instantiateStreaming")
@js.native
object instantiateStreaming extends js.Object {
  def apply(response: js.Thenable[Response]): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: js.Thenable[Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: Response): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
}

