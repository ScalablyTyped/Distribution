package typings.reduxDashPromiseDashListener.reduxDashPromiseDashListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReduxPromiseListener {
  import typings.redux.reduxMod.AnyAction

  type ActionMatcher = js.Function1[/* action */ AnyAction, Boolean]
}
