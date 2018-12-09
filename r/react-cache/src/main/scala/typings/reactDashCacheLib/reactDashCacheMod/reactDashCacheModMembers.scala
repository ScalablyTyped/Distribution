package typings
package reactDashCacheLib.reactDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-cache", JSImport.Namespace)
@js.native
object reactDashCacheModMembers extends js.Object {
  def unstable_createResource[Input, Value](fetch: js.Function1[/* input */ Input, js.Thenable[Value]]): Resource[Input, Value] = js.native
  def unstable_createResource[Input, Value](
    fetch: js.Function1[/* input */ Input, js.Thenable[Value]],
    maybeHashInput: js.Function1[/* input */ Input, java.lang.String | scala.Double]
  ): Resource[Input, Value] = js.native
}

