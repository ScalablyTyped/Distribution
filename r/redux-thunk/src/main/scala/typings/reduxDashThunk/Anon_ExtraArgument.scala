package typings.reduxDashThunk

import typings.redux.reduxMod.AnyAction
import typings.reduxDashThunk.reduxDashThunkMod.ThunkMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraArgument extends js.Object {
  def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E]
}

object Anon_ExtraArgument {
  @scala.inline
  def apply(withExtraArgument: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): Anon_ExtraArgument = {
    val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
  
    __obj.asInstanceOf[Anon_ExtraArgument]
  }
}

