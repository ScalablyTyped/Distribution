package typings.reduxThunk.anon

import typings.redux.mod.AnyAction
import typings.reduxThunk.mod.ThunkMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithExtraArgument extends js.Object {
  def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E]
}

object WithExtraArgument {
  @scala.inline
  def apply(withExtraArgument: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): WithExtraArgument = {
    val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
    __obj.asInstanceOf[WithExtraArgument]
  }
}

