package typings.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-redux", "useSelector")
@js.native
object useSelector extends js.Object {
  def apply[TState, TSelected](selector: js.Function1[/* state */ TState, TSelected]): TSelected = js.native
  def apply[TState, TSelected](
    selector: js.Function1[/* state */ TState, TSelected],
    equalityFn: js.Function2[/* left */ TSelected, /* right */ TSelected, Boolean]
  ): TSelected = js.native
}

