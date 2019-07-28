package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashIntl.Anon_WrappedComponent
import typings.reactDashIntl.ReactIntlNs.InjectIntlConfig
import typings.reactDashIntl.ReactIntlNs.InjectedIntlProps
import typings.reactDashIntl.ReactIntlNs.IntlShape
import typings.reactDashIntl.ReactIntlNs.Locale
import typings.reactDashIntl.ReactIntlNs.Messages
import typings.reactDashIntl.reactDashIntlStrings.intl
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val intlShape: IntlShape = js.native
  def addLocaleData(data: js.Array[Locale]): Unit = js.native
  def addLocaleData(data: Locale): Unit = js.native
  def defineMessages[Names /* <: String */](messages: Messages[Names]): Messages[Names] = js.native
  def injectIntl[P](component: ComponentType[P with InjectedIntlProps]): (ComponentClass[Pick[P, Exclude[String, intl]], ComponentState]) with Anon_WrappedComponent[P] = js.native
  def injectIntl[P](component: ComponentType[P with InjectedIntlProps], options: InjectIntlConfig): (ComponentClass[Pick[P, Exclude[String, intl]], ComponentState]) with Anon_WrappedComponent[P] = js.native
}

