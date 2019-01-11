package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def whenActive[Props](): rrcLib.rrcMod.WhenActiveReturnType[Props] = js.native
  def whenActive[Props](options: rrcLib.rrcMod.WhenActiveOptions): rrcLib.rrcMod.WhenActiveReturnType[Props] = js.native
  def withScroll(
    component: rrcLib.rrcMod.ComponentConstructor[
      (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
        _, 
        reactDashRouterLib.reactDashRouterMod.StaticContext, 
        historyLib.historyMod.LocationState
      ]) | js.Object
    ]
  ): rrcLib.rrcMod.ComponentConstructor[
    (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
      _, 
      reactDashRouterLib.reactDashRouterMod.StaticContext, 
      historyLib.historyMod.LocationState
    ]) | js.Object
  ] = js.native
  def withScroll(
    component: rrcLib.rrcMod.ComponentConstructor[
      (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
        _, 
        reactDashRouterLib.reactDashRouterMod.StaticContext, 
        historyLib.historyMod.LocationState
      ]) | js.Object
    ],
    options: rrcLib.rrcMod.WithScrollOptions
  ): rrcLib.rrcMod.ComponentConstructor[
    (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
      _, 
      reactDashRouterLib.reactDashRouterMod.StaticContext, 
      historyLib.historyMod.LocationState
    ]) | js.Object
  ] = js.native
  def wrapSwitch[WrapperProps, Params](Wrapper: rrcLib.rrcMod.ComponentConstructor[WrapperProps]): rrcLib.rrcMod.ComponentConstructor[rrcLib.rrcMod.WrapSwitchProps[Params] with WrapperProps] = js.native
}

