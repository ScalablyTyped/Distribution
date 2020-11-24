package typings.reactCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-cache", "unstable_createResource")
@js.native
object unstableCreateResource extends js.Object {
  
  def apply[Input, Value](fetch: js.Function1[/* input */ Input, js.Thenable[Value]]): Resource[Input, Value] = js.native
  def apply[Input, Value](
    fetch: js.Function1[/* input */ Input, js.Thenable[Value]],
    maybeHashInput: js.Function1[/* input */ Input, String | Double]
  ): Resource[Input, Value] = js.native
}
