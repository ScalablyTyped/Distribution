package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedRouterRedirectConfig[OwnProps, State]
  extends reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthBaseConfig[OwnProps, State] {
  var allowRedirectBack: js.UndefOr[
    scala.Boolean | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean])
  ] = js.native
  var redirectAction: js.UndefOr[
    js.Function1[
      /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
      reduxLib.reduxMod.Action[_]
    ]
  ] = js.native
  var redirectPath: java.lang.String | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, java.lang.String]) = js.native
  var redirectQueryParamName: js.UndefOr[java.lang.String] = js.native
}

