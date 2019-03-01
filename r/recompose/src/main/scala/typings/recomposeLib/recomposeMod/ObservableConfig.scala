package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// setObservableConfig: https://github.com/acdlite/recompose/blob/master/docs/API.md#setObservableConfig
trait ObservableConfig extends js.Object {
  var fromESObservable: js.UndefOr[js.Function1[/* observable */ Subscribable[_], _]] = js.undefined
  var toESObservable: js.UndefOr[js.Function1[/* stream */ js.Any, Subscribable[_]]] = js.undefined
}

object ObservableConfig {
  @scala.inline
  def apply(
    fromESObservable: js.Function1[/* observable */ Subscribable[_], _] = null,
    toESObservable: js.Function1[/* stream */ js.Any, Subscribable[_]] = null
  ): ObservableConfig = {
    val __obj = js.Dynamic.literal()
    if (fromESObservable != null) __obj.updateDynamic("fromESObservable")(fromESObservable)
    if (toESObservable != null) __obj.updateDynamic("toESObservable")(toESObservable)
    __obj.asInstanceOf[ObservableConfig]
  }
}

