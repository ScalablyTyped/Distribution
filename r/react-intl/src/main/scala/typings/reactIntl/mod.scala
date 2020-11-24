package typings.reactIntl

import typings.formatjsIntl.mod.IntlError
import typings.formatjsIntl.srcCreateIntlMod.CreateIntlFn
import typings.formatjsIntl.srcErrorMod.IntlErrorCode
import typings.formatjsIntl.srcTypesMod.FormatDateOptions
import typings.formatjsIntl.srcTypesMod.FormatNumberOptions
import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.reactIntl.anon.Children
import typings.reactIntl.anon.DateTimeFormatOptionsCust
import typings.reactIntl.anon.DisplayNamesOptionsvalues
import typings.reactIntl.anon.IntlListFormatOptionsvalu
import typings.reactIntl.anon.NumberFormatOptionsCustom
import typings.reactIntl.anon.PartialState
import typings.reactIntl.anon.PartialStateCurrentValueInSeconds
import typings.reactIntl.anon.PickIntlConfigtimeZonefor
import typings.reactIntl.anon.PickPropsunitvalue
import typings.reactIntl.anon.Value
import typings.reactIntl.anon.WrappedComponent
import typings.reactIntl.componentsDateTimeRangeMod.Props
import typings.reactIntl.componentsInjectIntlMod.Opts
import typings.reactIntl.componentsInjectIntlMod.WithIntlProps
import typings.reactIntl.componentsInjectIntlMod.WrappedComponentProps
import typings.reactIntl.componentsMessageMod.default
import typings.reactIntl.componentsProviderMod.OptionalIntlConfig
import typings.reactIntl.componentsRelativeMod.State
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.srcTypesMod.IntlShape
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val FormattedDate: FC[DateTimeFormatOptionsCust] = js.native
  
  val FormattedDateParts: FC[FormatDateOptions with Children] = js.native
  
  val FormattedDateTimeRange: FC[Props] = js.native
  
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  
  val FormattedNumber: FC[NumberFormatOptionsCustom] = js.native
  
  val FormattedNumberParts: FC[FormatNumberOptions with Value] = js.native
  
  val FormattedTime: FC[DateTimeFormatOptionsCust] = js.native
  
  val FormattedTimeParts: FC[FormatDateOptions with Children] = js.native
  
  val IntlContext: Context[IntlShape] = js.native
  
  val RawIntlProvider: Provider[IntlShape] = js.native
  
  val createIntl: CreateIntlFn[ReactNode, OptionalIntlConfig, IntlShape] = js.native
  
  def createIntlCache(): IntlCache = js.native
  
  def defineMessage[T](msg: T): T = js.native
  
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponent[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponent[P, IntlPropName]) = js.native
  
  def useIntl(): IntlShape = js.native
  
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] () extends default[V]
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    
    var displayName: String = js.native
  }
  
  @js.native
  object FormattedPlural extends js.Object {
    
    def apply(props: PropsWithChildren[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]): ReactElement | Null = js.native
    def apply(
      props: PropsWithChildren[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]],
      context: js.Any
    ): ReactElement | Null = js.native
    
    var WrappedComponent: ComponentType[typings.reactIntl.componentsPluralMod.Props] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var defaultProps: js.UndefOr[Partial[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]] = js.native
  }
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typings.reactIntl.componentsRelativeMod.default {
    def this(props: typings.reactIntl.componentsRelativeMod.Props) = this()
  }
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    
    var defaultProps: PickPropsunitvalue = js.native
    
    var displayName: String = js.native
    
    def getDerivedStateFromProps(props: typings.reactIntl.componentsRelativeMod.Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  @js.native
  class IntlProvider ()
    extends typings.reactIntl.componentsProviderMod.default
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    
    var defaultProps: PickIntlConfigtimeZonefor = js.native
    
    var displayName: String = js.native
    
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typings.reactIntl.componentsProviderMod.State): PartialState | Null = js.native
  }
  
  @js.native
  class InvalidConfigError protected ()
    extends typings.formatjsIntl.mod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @js.native
  class MessageFormatError protected ()
    extends typings.formatjsIntl.mod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
  }
  
  @js.native
  class MissingDataError protected ()
    extends typings.formatjsIntl.mod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @js.native
  class MissingTranslationError protected ()
    extends typings.formatjsIntl.mod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @js.native
  class ReactIntlError[T /* <: IntlErrorCode */] protected () extends IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: Error) = this()
  }
  
  @js.native
  class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.mod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
}
