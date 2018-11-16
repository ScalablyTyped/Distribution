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

