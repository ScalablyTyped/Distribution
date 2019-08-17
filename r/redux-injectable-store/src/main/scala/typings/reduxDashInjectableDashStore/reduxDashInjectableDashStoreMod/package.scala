package typings.reduxDashInjectableDashStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashInjectableDashStoreMod {
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.Reducer

  type WrapReducer[S] = js.Function1[/* reducer */ Reducer[S, AnyAction], Reducer[S, AnyAction]]
}
