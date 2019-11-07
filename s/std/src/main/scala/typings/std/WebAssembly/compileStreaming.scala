package typings.std.WebAssembly

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.compileStreaming")
@js.native
object compileStreaming extends js.Object {
  def apply(source: js.Promise[Response]): js.Promise[Module] = js.native
  def apply(source: Response): js.Promise[Module] = js.native
}

