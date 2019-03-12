package typings
package reduxDashThunkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraArgument extends js.Object {
  def withExtraArgument[E](extraArgument: E): reduxDashThunkLib.reduxDashThunkMod.ThunkMiddleware[js.Object, reduxLib.reduxMod.AnyAction, E]
}

object Anon_ExtraArgument {
  @scala.inline
  def apply(
    withExtraArgument: js.Any => reduxDashThunkLib.reduxDashThunkMod.ThunkMiddleware[js.Object, reduxLib.reduxMod.AnyAction, js.Any]
  ): Anon_ExtraArgument = {
    val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
  
    __obj.asInstanceOf[Anon_ExtraArgument]
  }
}

