package typings.reduxStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionTypeCheckCallback = js.Function1[/* type */ java.lang.String, scala.Boolean]
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[
    /* store */ typings.redux.mod.Store[TState, typings.redux.mod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type StateMerger = js.Function2[/* oldState */ js.Any, /* newState */ js.Any, js.Any]
}
