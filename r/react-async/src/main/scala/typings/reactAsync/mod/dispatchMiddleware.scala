package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "dispatchMiddleware")
@js.native
object dispatchMiddleware extends js.Object {
  
  def apply[T](dispatch: js.Function2[/* action */ AsyncAction[T], /* repeated */ js.Any, Unit]): js.Function2[/* action */ AsyncAction[T], /* repeated */ js.Any, Unit] = js.native
}
