package typings.reduxDashAuthDashWrapper.history3RedirectMod

import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", "createOnEnter")
@js.native
object createOnEnter extends js.Object {
  def apply[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[_, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[/* location */ LocationDescriptorObject[LocationState], Unit], 
    Unit
  ] = js.native
}

