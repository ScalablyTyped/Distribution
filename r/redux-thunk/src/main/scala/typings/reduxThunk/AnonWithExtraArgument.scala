package typings.reduxThunk

import typings.redux.mod.AnyAction
import typings.reduxThunk.mod.ThunkMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWithExtraArgument extends js.Object {
  def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E]
}

object AnonWithExtraArgument {
  @scala.inline
  def apply(withExtraArgument: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): AnonWithExtraArgument = {
    val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
    __obj.asInstanceOf[AnonWithExtraArgument]
  }
}

