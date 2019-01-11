package typings
package reactDashIntlLib.reactDashIntlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val intlShape: reactDashIntlLib.ReactIntlNs.IntlShape = js.native
  def addLocaleData(data: js.Array[reactDashIntlLib.ReactIntlNs.Locale]): scala.Unit = js.native
  def addLocaleData(data: reactDashIntlLib.ReactIntlNs.Locale): scala.Unit = js.native
  def defineMessages[T /* <: reactDashIntlLib.ReactIntlNs.Messages */](messages: T): T = js.native
  def injectIntl[P](
    component: reactLib.reactMod.ReactNs.ComponentType[P with reactDashIntlLib.ReactIntlNs.InjectedIntlProps]
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashIntlLib.Anon_WrappedComponent[P] = js.native
  def injectIntl[P](
    component: reactLib.reactMod.ReactNs.ComponentType[P with reactDashIntlLib.ReactIntlNs.InjectedIntlProps],
    options: reactDashIntlLib.ReactIntlNs.InjectIntlConfig
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashIntlLib.Anon_WrappedComponent[P] = js.native
}

