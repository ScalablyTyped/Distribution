package typings.reactIntl

import typings.formatjsIntlListformat.mod.IntlListFormatOptions
import typings.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Provider
import typings.react.mod.RefAttributes
import typings.reactIntl.htmlMessageMod.default
import typings.reactIntl.injectIntlMod.Opts
import typings.reactIntl.injectIntlMod.WithIntlProps
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import typings.reactIntl.providerMod.OptionalIntlConfig
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.reactIntlStrings.`type`
import typings.reactIntl.reactIntlStrings.children
import typings.reactIntl.reactIntlStrings.defaultFormats
import typings.reactIntl.reactIntlStrings.defaultLocale
import typings.reactIntl.reactIntlStrings.few
import typings.reactIntl.reactIntlStrings.format
import typings.reactIntl.reactIntlStrings.formats
import typings.reactIntl.reactIntlStrings.localeMatcher
import typings.reactIntl.reactIntlStrings.many
import typings.reactIntl.reactIntlStrings.messages
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.reactIntlStrings.one
import typings.reactIntl.reactIntlStrings.other
import typings.reactIntl.reactIntlStrings.textComponent
import typings.reactIntl.reactIntlStrings.timeZone
import typings.reactIntl.reactIntlStrings.two
import typings.reactIntl.reactIntlStrings.unit
import typings.reactIntl.reactIntlStrings.value
import typings.reactIntl.reactIntlStrings.zero
import typings.reactIntl.relativeMod.Props
import typings.reactIntl.relativeMod.State
import typings.reactIntl.typesMod.CustomFormatConfig
import typings.reactIntl.typesMod.FormatNumberOptions
import typings.reactIntl.typesMod.IntlCache
import typings.reactIntl.typesMod.IntlConfig
import typings.reactIntl.typesMod.IntlShape
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
    extends typings.reactIntl.messageMod.default[V]
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typings.reactIntl.relativeMod.default {
    def this(props: Props) = this()
  }
  
  @js.native
  class IntlProvider ()
    extends typings.reactIntl.providerMod.default
  
  val FormattedDate: FC[DateTimeFormatOptions with CustomFormatConfig with AnonValue] = js.native
  val FormattedDateParts: FC[DateTimeFormatOptions with CustomFormatConfig with AnonChildren] = js.native
  val FormattedList: FC[IntlListFormatOptions with AnonValueArray] = js.native
  val FormattedNumber: FC[UnifiedNumberFormatOptions with CustomFormatConfig with AnonValueNumber] = js.native
  val FormattedNumberParts: FC[FormatNumberOptions with Anon0] = js.native
  val FormattedPlural: (ForwardRefExoticComponent[
    (Pick[
      typings.reactIntl.pluralMod.Props, 
      children | other | zero | one | two | few | many | format | localeMatcher | `type` | value
    ]) with AnonForwardedRefInstance with RefAttributes[_]
  ]) with AnonWrappedComponentComponentType = js.native
  val FormattedTime: FC[DateTimeFormatOptions with CustomFormatConfig with AnonValue] = js.native
  val FormattedTimeParts: FC[DateTimeFormatOptions with CustomFormatConfig with AnonChildren] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with AnonWrappedComponent[P] = js.native
  def useIntl(): IntlShape = js.native
  /* static members */
  @js.native
  object FormattedHTMLMessage extends js.Object {
    var defaultProps: AnonSpan = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    var defaultProps: AnonValues = js.native
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
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typings.reactIntl.providerMod.State): Partial[typings.reactIntl.providerMod.State] | Null = js.native
  }
  
}

