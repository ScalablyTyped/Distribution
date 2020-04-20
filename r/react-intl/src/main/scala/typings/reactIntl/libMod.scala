package typings.reactIntl

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactIntl.htmlMessageMod.default
import typings.reactIntl.injectIntlMod.Opts
import typings.reactIntl.injectIntlMod.WithIntlProps
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import typings.reactIntl.providerMod.OptionalIntlConfig
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.relativeMod.Props
import typings.reactIntl.relativeMod.State
import typings.reactIntl.typesMod.FormatNumberOptions
import typings.reactIntl.typesMod.IntlCache
import typings.reactIntl.typesMod.IntlShape
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
  
  val FormattedDate: FC[DateTimeFormatOptionsCust] = js.native
  val FormattedDateParts: FC[DateTimeFormatOptionsCustChildren] = js.native
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  val FormattedNumber: FC[UnifiedNumberFormatOption] = js.native
  val FormattedNumberParts: FC[FormatNumberOptions with AnonChildren] = js.native
  val FormattedTime: FC[DateTimeFormatOptionsCust] = js.native
  val FormattedTimeParts: FC[DateTimeFormatOptionsCustChildren] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with (AnonWrappedComponent[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with (AnonWrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with (AnonWrappedComponent[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with (AnonWrappedComponentComponentType[P, IntlPropName]) = js.native
  def useIntl(): IntlShape = js.native
  /* static members */
  @js.native
  object FormattedHTMLMessage extends js.Object {
    var defaultProps: AnonTagName = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    var defaultProps: AnonValues = js.native
    var displayName: String = js.native
  }
  
  @js.native
  object FormattedPlural extends js.Object {
    @JSName("$$typeof")
    val DollarDollartypeof: js.Symbol = js.native
    var WrappedComponent: ComponentType[typings.reactIntl.pluralMod.Props] = js.native
    var defaultProps: js.UndefOr[PartialPickPropschildreno] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapPickProp] = js.native
    /**
      * **NOTE**: Exotic components are not callable.
      */
    def apply(props: PickPropschildrenotherzer): ReactElement | Null = js.native
  }
  
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    var defaultProps: PickPropsunitvalue = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    var defaultProps: PickIntlConfigformatsmess = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typings.reactIntl.providerMod.State): PartialState | Null = js.native
  }
  
}

