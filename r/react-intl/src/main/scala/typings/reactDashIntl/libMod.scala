package typings.reactDashIntl

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.react.reactMod.RefAttributes
import typings.reactDashIntl.libComponentsHtmlDashMessageMod.default
import typings.reactDashIntl.libComponentsInjectIntlMod.Opts
import typings.reactDashIntl.libComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.libComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.libComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.libComponentsRelativeMod.Props
import typings.reactDashIntl.libComponentsRelativeMod.State
import typings.reactDashIntl.libTypesMod.CustomFormatConfig
import typings.reactDashIntl.libTypesMod.FormatNumberOptions
import typings.reactDashIntl.libTypesMod.IntlCache
import typings.reactDashIntl.libTypesMod.IntlConfig
import typings.reactDashIntl.libTypesMod.IntlShape
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

@JSImport("react-intl/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class FormattedHTMLMessage () extends default
  
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] ()
    extends typings.reactDashIntl.libComponentsMessageMod.default[V]
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typings.reactDashIntl.libComponentsRelativeMod.default {
    def this(props: Props) = this()
  }
  
  @js.native
  class IntlProvider ()
    extends typings.reactDashIntl.libComponentsProviderMod.default
  
  val FormattedDate: FC[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedDateParts: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val FormattedList: FC[IntlListFormatOptions with Anon_ValueArray] = js.native
  val FormattedNumber: FC[UnifiedNumberFormatOptions with CustomFormatConfig with Anon_ValueNumber] = js.native
  val FormattedNumberParts: FC[FormatNumberOptions with Anon_0] = js.native
  val FormattedPlural: (ForwardRefExoticComponent[
    (Pick[
      typings.reactDashIntl.libComponentsPluralMod.Props, 
      children | other | zero | one | two | few | many | `type` | localeMatcher | format | value
    ]) with Anon_ForwardedRefInstance with RefAttributes[_]
  ]) with Anon_WrappedComponentComponentType = js.native
  val FormattedTime: FC[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedTimeParts: FunctionComponent[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with Anon_WrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with Anon_WrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent[P] = js.native
  def useIntl(): IntlShape = js.native
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
    def getDerivedStateFromProps(props: Props, state: State): Partial[State] | Null = js.native
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
      hasPrevConfigCache: typings.reactDashIntl.libComponentsProviderMod.State
    ): Partial[typings.reactDashIntl.libComponentsProviderMod.State] | Null = js.native
  }
  
}

