package typings
package rrcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rrcMod {
  type ComponentConstructor[Props] = reactLib.reactMod.ComponentType[Props]
  type GetKeyFunction[Params] = js.Function3[
    /* match */ reactDashRouterLib.reactDashRouterMod.`match`[Params], 
    /* route */ RouteConfiguration, 
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    java.lang.String
  ]
  type IsActiveCallback = js.Function0[scala.Boolean]
  type OnUpdateCall = js.Function1[
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    scala.Unit
  ]
  type PropIdCallback = js.Function0[java.lang.String]
  type RouteConfiguration = reactDashRouterLib.reactDashRouterMod.RouteProps with rrcLib.Anon_Inject
  type WhenActiveReturnType[Props] = js.Function1[/* component */ ComponentConstructor[Props], ComponentConstructor[Props]]
}
