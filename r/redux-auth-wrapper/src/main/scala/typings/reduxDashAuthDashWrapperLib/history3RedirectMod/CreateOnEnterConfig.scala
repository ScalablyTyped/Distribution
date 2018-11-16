package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOnEnterConfig[State]
  extends reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthConfig {
  var allowRedirectBack: js.UndefOr[scala.Boolean | (StateMutateSelector[State, scala.Boolean])] = js.native
  @JSName("authenticatedSelector")
  var authenticatedSelector_Original: StateMutateSelector[State, scala.Boolean] = js.native
  var authenticatingSelector: js.UndefOr[StateMutateSelector[State, scala.Boolean]] = js.native
  var redirectPath: java.lang.String | (StateMutateSelector[State, java.lang.String]) = js.native
  var redirectQueryParamName: js.UndefOr[java.lang.String] = js.native
  def authenticatedSelector(state: State, nextState: State): scala.Boolean = js.native
}

