package typings.reactDashAlert.reactDashAlertMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.reactDashAlert.Anon_Alert
import typings.reactDashAlert.reactDashAlertStrings.alert
import typings.std.Exclude
import typings.std.Pick
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
  def useAlert(context: Context[js.UndefOr[AlertManager]]): AlertManager = js.native
  def withAlert[P /* <: Anon_Alert */](): js.Function1[/* c */ ComponentType[P], ComponentType[Pick[P, Exclude[String, alert]]]] = js.native
  def withAlert[P /* <: Anon_Alert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[/* c */ ComponentType[P], ComponentType[Pick[P, Exclude[String, alert]]]] = js.native
}

