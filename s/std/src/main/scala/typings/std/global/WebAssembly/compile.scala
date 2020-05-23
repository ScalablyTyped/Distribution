package typings.std.global.WebAssembly

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.compile")
@js.native
object compile extends js.Object {
  def apply(bytes: BufferSource): js.Promise[typings.std.WebAssembly.Module] = js.native
}

