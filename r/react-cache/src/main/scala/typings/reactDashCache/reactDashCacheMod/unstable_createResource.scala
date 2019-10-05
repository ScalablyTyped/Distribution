package typings.reactDashCache.reactDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-cache", "unstable_createResource")
@js.native
object unstable_createResource extends js.Object {
  def apply[Input, Value](fetch: js.Function1[/* input */ Input, js.Thenable[Value]]): Resource[Input, Value] = js.native
  def apply[Input, Value](
    fetch: js.Function1[/* input */ Input, js.Thenable[Value]],
    maybeHashInput: js.Function1[/* input */ Input, String | Double]
  ): Resource[Input, Value] = js.native
}

