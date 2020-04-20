package typings.reactAlert.mod

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.reactAlert.AnonAlert
import typings.reactAlert.reactAlertStrings.alert
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-alert", "withAlert")
@js.native
object withAlert extends js.Object {
  def apply[P /* <: AnonAlert */](): js.Function1[
    /* c */ ComponentType[P], 
    ComponentType[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ] = js.native
  def apply[P /* <: AnonAlert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[
    /* c */ ComponentType[P], 
    ComponentType[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ] = js.native
}

