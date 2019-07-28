package typings.reduxDashInjectableDashStore

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashInjectableDashStoreMod {
  type WrapReducer[S] = js.Function1[/* reducer */ Reducer[S, AnyAction], Reducer[S, AnyAction]]
}
