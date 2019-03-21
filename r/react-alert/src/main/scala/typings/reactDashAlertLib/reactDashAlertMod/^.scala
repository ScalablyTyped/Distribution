package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-alert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val positions: Positions = js.native
  val transitions: Transitions = js.native
  val types: Types = js.native
  def useAlert(): AlertManager = js.native
  def useAlert(context: reactLib.reactMod.ReactNs.Context[js.UndefOr[AlertManager]]): AlertManager = js.native
  def withAlert[P /* <: reactDashAlertLib.Anon_Alert */](): js.Function1[
    /* c */ reactLib.reactMod.ReactNs.ComponentType[P], 
    reactLib.reactMod.ReactNs.ComponentType[
      stdLib.Pick[
        P, 
        stdLib.Exclude[java.lang.String, reactDashAlertLib.reactDashAlertLibStrings.alert]
      ]
    ]
  ] = js.native
  def withAlert[P /* <: reactDashAlertLib.Anon_Alert */](context: reactLib.reactMod.ReactNs.Context[js.UndefOr[AlertManager]]): js.Function1[
    /* c */ reactLib.reactMod.ReactNs.ComponentType[P], 
    reactLib.reactMod.ReactNs.ComponentType[
      stdLib.Pick[
        P, 
        stdLib.Exclude[java.lang.String, reactDashAlertLib.reactDashAlertLibStrings.alert]
      ]
    ]
  ] = js.native
}

