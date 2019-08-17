package typings.rrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rrcMod {
  import typings.history.historyMod.Location
  import typings.history.historyMod.LocationState
  import typings.react.reactMod.ComponentType
  import typings.reactDashRouter.reactDashRouterMod.RouteProps
  import typings.reactDashRouter.reactDashRouterMod.`match`
  import typings.rrc.Anon_Inject

  type ComponentConstructor[Props] = ComponentType[Props]
  type GetKeyFunction[Params] = js.Function3[
    /* match */ `match`[Params], 
    /* route */ RouteConfiguration, 
    /* location */ Location[LocationState], 
    String
  ]
  type IsActiveCallback = js.Function0[Boolean]
  type OnUpdateCall = js.Function1[/* location */ Location[LocationState], Unit]
  type PropIdCallback = js.Function0[String]
  type RouteConfiguration = RouteProps with Anon_Inject
  type WhenActiveReturnType[Props] = js.Function1[/* component */ ComponentConstructor[Props], ComponentConstructor[Props]]
}
