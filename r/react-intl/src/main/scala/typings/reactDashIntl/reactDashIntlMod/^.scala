package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.reactDashIntl.Anon_Children
import typings.reactDashIntl.Anon_ChildrenVal
import typings.reactDashIntl.Anon_WrappedComponent
import typings.reactDashIntl.Anon_WrappedComponentComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.Opts
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distComponentsPluralMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distDefineDashMessagesMod.Messages
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormattedDate: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val FormattedNumber: FunctionComponent[NumberFormatOptions with CustomFormatConfig with Anon_ChildrenVal] = js.native
  val FormattedPlural: ((ComponentClass[WithIntlProps[Props], _]) with Anon_WrappedComponentComponentType) | (FunctionComponent[WithIntlProps[Props]] with Anon_WrappedComponentComponentType) = js.native
  val FormattedTime: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[Names /* <: String */](messageDescriptors: Messages[Names]): Messages[Names] = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  def useIntl(): js.Any = js.native
}

