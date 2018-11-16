package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReactIntl")
@js.native
object ReactIntlNsMembers extends js.Object {
  val intlShape: IntlShape = js.native
  def addLocaleData(data: js.Array[Locale]): scala.Unit = js.native
  def addLocaleData(data: Locale): scala.Unit = js.native
  def defineMessages[T /* <: Messages */](messages: T): T = js.native
  def injectIntl[P /* <: InjectedIntlProps */](component: reactLib.reactMod.ReactNs.ComponentType[P]): (reactLib.reactMod.ReactNs.ComponentClass[
    stdLib.Pick[
      stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]], 
      stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]
    ], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashIntlLib.Anon_WrappedComponent[P] = js.native
  def injectIntl[P /* <: InjectedIntlProps */](component: reactLib.reactMod.ReactNs.ComponentType[P], options: InjectIntlConfig): (reactLib.reactMod.ReactNs.ComponentClass[
    stdLib.Pick[
      stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]], 
      stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]
    ], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashIntlLib.Anon_WrappedComponent[P] = js.native
}

