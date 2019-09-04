package typings.reactDashIntl.reactDashIntlMod

import typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormatOptions
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.react.reactMod.RefAttributes
import typings.reactDashIntl.Anon_0
import typings.reactDashIntl.Anon_Children
import typings.reactDashIntl.Anon_ForwardedRefInstance
import typings.reactDashIntl.Anon_Value
import typings.reactDashIntl.Anon_ValueNumber
import typings.reactDashIntl.Anon_WrappedComponent
import typings.reactDashIntl.Anon_WrappedComponentComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.Opts
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distComponentsPluralMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distDefineDashMessagesMod.Messages
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.FormatNumberOptions
import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.reactDashIntl.reactDashIntlNumbers.`false`
import typings.reactDashIntl.reactDashIntlNumbers.`true`
import typings.reactDashIntl.reactDashIntlStrings.`type`
import typings.reactDashIntl.reactDashIntlStrings.children
import typings.reactDashIntl.reactDashIntlStrings.few
import typings.reactDashIntl.reactDashIntlStrings.format
import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
import typings.reactDashIntl.reactDashIntlStrings.many
import typings.reactDashIntl.reactDashIntlStrings.one
import typings.reactDashIntl.reactDashIntlStrings.other
import typings.reactDashIntl.reactDashIntlStrings.two
import typings.reactDashIntl.reactDashIntlStrings.value
import typings.reactDashIntl.reactDashIntlStrings.zero
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormattedDate: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedDateParts: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val FormattedNumber: FunctionComponent[UnifiedNumberFormatOptions with CustomFormatConfig with Anon_ValueNumber] = js.native
  val FormattedNumberParts: FC[FormatNumberOptions with Anon_0] = js.native
  val FormattedPlural: (ForwardRefExoticComponent[
    (Pick[
      Props, 
      children | other | zero | one | two | few | many | `type` | localeMatcher | format | value
    ]) with Anon_ForwardedRefInstance with RefAttributes[_]
  ]) with Anon_WrappedComponentComponentType = js.native
  val FormattedTime: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedTimeParts: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[Names /* <: String */](messageDescriptors: Messages[Names]): Messages[Names] = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent = js.native
  def useIntl(): js.Any = js.native
}

