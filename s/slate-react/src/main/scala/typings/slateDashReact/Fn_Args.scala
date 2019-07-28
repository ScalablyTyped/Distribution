package typings.slateDashReact

import typings.slate.slateMod.CommandFunc
import typings.slate.slateMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Args extends js.Object {
  def apply(name: String, args: js.Any*): Editor = js.native
  def apply(name: CommandFunc, args: js.Any*): Editor = js.native
}

