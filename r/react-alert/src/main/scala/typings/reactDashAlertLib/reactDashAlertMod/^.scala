package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-alert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Alert: reactLib.reactMod.ReactNs.Consumer[reactDashAlertLib.reactDashAlertMod.InjectedAlertProp] = js.native
  def withAlert[P /* <: reactDashAlertLib.Anon_Alert */](c: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentType[
    stdLib.Pick[
      P, 
      stdLib.Exclude[java.lang.String, reactDashAlertLib.reactDashAlertLibStrings.alert]
    ]
  ] = js.native
}

