package typings.reduxDashStorage

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashStorageMod {
  type ActionTypeCheckCallback = js.Function1[/* type */ String, Boolean]
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[/* store */ Store[TState, AnyAction], js.Thenable[js.Any]]
  type StateMerger = js.Function2[/* oldState */ js.Any, /* newState */ js.Any, js.Any]
}
