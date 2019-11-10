package typings.reactDashIntl

import typings.atFormatjsIntlDashListformat.distCoreMod.IntlListFormatOptions
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
import typings.reactDashIntl.distComponentsHtmlDashMessageMod.default
import typings.reactDashIntl.distComponentsInjectIntlMod.Opts
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distComponentsRelativeMod.Props
import typings.reactDashIntl.distComponentsRelativeMod.State
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.FormatNumberOptions
import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlConfig
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.reactDashIntl.reactDashIntlNumbers.`false`
import typings.reactDashIntl.reactDashIntlNumbers.`true`
import typings.reactDashIntl.reactDashIntlStrings.`type`
import typings.reactDashIntl.reactDashIntlStrings.children
import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
import typings.reactDashIntl.reactDashIntlStrings.few
import typings.reactDashIntl.reactDashIntlStrings.format
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
import typings.reactDashIntl.reactDashIntlStrings.many
import typings.reactDashIntl.reactDashIntlStrings.messages
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.reactDashIntl.reactDashIntlStrings.one
import typings.reactDashIntl.reactDashIntlStrings.other
import typings.reactDashIntl.reactDashIntlStrings.textComponent
import typings.reactDashIntl.reactDashIntlStrings.timeZone
import typings.reactDashIntl.reactDashIntlStrings.two
import typings.reactDashIntl.reactDashIntlStrings.unit
import typings.reactDashIntl.reactDashIntlStrings.value
import typings.reactDashIntl.reactDashIntlStrings.zero
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object reactDashIntlMod extends js.Object {
  @js.native
  class FormattedHTMLMessage () extends default
  
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] ()
    extends typings.reactDashIntl.distComponentsMessageMod.default[V]
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typings.reactDashIntl.distComponentsRelativeMod.default {
    def this(props: Props) = this()
  }
  
  @js.native
  class IntlProvider ()
    extends typings.reactDashIntl.distComponentsProviderMod.default
  
  val FormattedDate: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedDateParts: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val FormattedList: FunctionComponent[IntlListFormatOptions with Anon_ValueArray] = js.native
  val FormattedNumber: FunctionComponent[UnifiedNumberFormatOptions with CustomFormatConfig with Anon_ValueNumber] = js.native
  val FormattedNumberParts: FC[FormatNumberOptions with Anon_0] = js.native
  val FormattedPlural: (ForwardRefExoticComponent[
    (Pick[
      typings.reactDashIntl.distComponentsPluralMod.Props, 
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
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent = js.native
  def useIntl(): js.Any = js.native
  /* static members */
  @js.native
  object FormattedHTMLMessage extends js.Object {
    var defaultProps: Anon_Span = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    var defaultProps: Anon_Values = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    var defaultProps: Pick[Props, unit | value] = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: Props, state: State): Anon_CurrentValueInSeconds | Null = js.native
  }
  
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    var defaultProps: Pick[
        IntlConfig, 
        formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
      ] = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(
      props: OptionalIntlConfig,
      hasPrevConfigCache: typings.reactDashIntl.distComponentsProviderMod.State
    ): Partial[typings.reactDashIntl.distComponentsProviderMod.State] | Null = js.native
  }
  
}

