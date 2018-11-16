package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrc", JSImport.Namespace)
@js.native
object rrcModMembers extends js.Object {
  def whenActive[Props](): WhenActiveReturnType[Props] = js.native
  def whenActive[Props](options: WhenActiveOptions): WhenActiveReturnType[Props] = js.native
  def withScroll(
    component: ComponentConstructor[
      (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
        _, 
        reactDashRouterLib.reactDashRouterMod.StaticContext, 
        historyLib.historyMod.LocationState
      ]) | js.Object
    ]
  ): ComponentConstructor[
    (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
      _, 
      reactDashRouterLib.reactDashRouterMod.StaticContext, 
      historyLib.historyMod.LocationState
    ]) | js.Object
  ] = js.native
  def withScroll(
    component: ComponentConstructor[
      (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
        _, 
        reactDashRouterLib.reactDashRouterMod.StaticContext, 
        historyLib.historyMod.LocationState
      ]) | js.Object
    ],
    options: WithScrollOptions
  ): ComponentConstructor[
    (reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
      _, 
      reactDashRouterLib.reactDashRouterMod.StaticContext, 
      historyLib.historyMod.LocationState
    ]) | js.Object
  ] = js.native
  def wrapSwitch[WrapperProps, Params](Wrapper: ComponentConstructor[WrapperProps]): ComponentConstructor[WrapSwitchProps[Params] with WrapperProps] = js.native
}

