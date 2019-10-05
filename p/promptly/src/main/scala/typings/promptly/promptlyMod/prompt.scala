package typings.promptly.promptlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promptly", "prompt")
@js.native
object prompt extends js.Object {
  def apply(message: String): js.Any = js.native
  def apply(message: String, fn: Callback): js.Any = js.native
  def apply(message: String, opts: Options): js.Any = js.native
  def apply(message: String, opts: Options, fn: Callback): js.Any = js.native
}

