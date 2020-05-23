package typings.std.global.WebAssembly

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.compileStreaming")
@js.native
object compileStreaming extends js.Object {
  def apply(source: js.Promise[Response]): js.Promise[typings.std.WebAssembly.Module] = js.native
  def apply(source: Response): js.Promise[typings.std.WebAssembly.Module] = js.native
}

