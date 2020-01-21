package typings.reduxPromiseListener.mod.ReduxPromiseListener

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var getError: js.UndefOr[js.Function1[/* action */ AnyAction, _]] = js.undefined
  var getPayload: js.UndefOr[js.Function1[/* action */ AnyAction, _]] = js.undefined
  var reject: String | ActionMatcher
  var resolve: String | ActionMatcher
  var setPayload: js.UndefOr[js.Function2[/* action */ AnyAction, /* payload */ js.Any, AnyAction]] = js.undefined
  var start: String
}

object Config {
  @scala.inline
  def apply(
    reject: String | ActionMatcher,
    resolve: String | ActionMatcher,
    start: String,
    getError: /* action */ AnyAction => _ = null,
    getPayload: /* action */ AnyAction => _ = null,
    setPayload: (/* action */ AnyAction, /* payload */ js.Any) => AnyAction = null
  ): Config = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (getError != null) __obj.updateDynamic("getError")(js.Any.fromFunction1(getError))
    if (getPayload != null) __obj.updateDynamic("getPayload")(js.Any.fromFunction1(getPayload))
    if (setPayload != null) __obj.updateDynamic("setPayload")(js.Any.fromFunction2(setPayload))
    __obj.asInstanceOf[Config]
  }
}

