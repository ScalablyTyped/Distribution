package typings
package shelljsLib.makeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var done: js.UndefOr[scala.Boolean] = js.native
  var result: js.UndefOr[js.Any] = js.native
  def apply(args: js.Any*): scala.Unit = js.native
}

@JSGlobal("target")
@js.native
object target
  extends /* s */ org.scalablytyped.runtime.StringDictionary[Target] {
  var all: js.UndefOr[shelljsLib.makeMod.Global.Target] = js.native
}

