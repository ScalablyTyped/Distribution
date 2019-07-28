package typings.shelljs.makeMod.Global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var done: js.UndefOr[Boolean] = js.native
  var result: js.UndefOr[js.Any] = js.native
  def apply(args: js.Any*): Unit = js.native
}

@JSGlobal("target")
@js.native
object target extends /* s */ StringDictionary[Target] {
  var all: js.UndefOr[Target] = js.native
}

