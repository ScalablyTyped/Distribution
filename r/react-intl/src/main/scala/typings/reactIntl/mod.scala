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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-intl", "FormattedDate")
  @js.native
  val FormattedDate: FC[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl", "FormattedDateParts")
  @js.native
  val FormattedDateParts: FC[FormatDateOptions & Children] = js.native
  
  @JSImport("react-intl", "FormattedDateTimeRange")
  @js.native
  val FormattedDateTimeRange: FC[Props] = js.native
  
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  
  @JSImport("react-intl", "FormattedList")
  @js.native
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  
  @JSImport("react-intl", "FormattedMessage")
  @js.native
  class FormattedMessage[V /* <: Record[String, js.Any] */] () extends default[V]
  object FormattedMessage {
    
    @JSImport("react-intl", "FormattedMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-intl", "FormattedMessage.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl", "FormattedNumber")
  @js.native
  val FormattedNumber: FC[NumberFormatOptionsCustom] = js.native
  
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[FormatNumberOptions & Value] = js.native
  
  /* Inlined react.react.FC<react-intl.react-intl/src/components/injectIntl.WithIntlProps<react-intl.react-intl/src/components/plural.Props>> & {  WrappedComponent :react.react.ComponentType<react-intl.react-intl/src/components/plural.Props>} */
  object FormattedPlural {
    
    inline def apply(props: PropsWithChildren[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(
      props: PropsWithChildren[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]],
      context: js.Any
    ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("react-intl", "FormattedPlural")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "FormattedPlural.WrappedComponent")
    @js.native
    def WrappedComponent: ComponentType[typings.reactIntl.componentsPluralMod.Props] = js.native
    inline def WrappedComponent_=(x: ComponentType[typings.reactIntl.componentsPluralMod.Props]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]] = js.native
    inline def defaultProps_=(x: js.UndefOr[Partial[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMap[WithIntlProps[typings.reactIntl.componentsPluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl", "FormattedRelativeTime")
  @js.native
  class FormattedRelativeTime protected ()
    extends typings.reactIntl.componentsRelativeMod.default {
    def this(props: typings.reactIntl.componentsRelativeMod.Props) = this()
  }
  /* static members */
  object FormattedRelativeTime {
    
    @JSImport("react-intl", "FormattedRelativeTime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "FormattedRelativeTime.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    inline def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedRelativeTime.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: typings.reactIntl.componentsRelativeMod.Props, state: State): PartialStateCurrentValueInSeconds | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialStateCurrentValueInSeconds | Null]
  }
  
  @JSImport("react-intl", "FormattedTime")
  @js.native
  val FormattedTime: FC[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl", "FormattedTimeParts")
  @js.native
  val FormattedTimeParts: FC[FormatDateOptions & Children] = js.native
  
  @JSImport("react-intl", "IntlContext")
  @js.native
  val IntlContext: Context[IntlShape] = js.native
  
  @JSImport("react-intl", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends typings.reactIntl.componentsProviderMod.default
  /* static members */
  object IntlProvider {
    
    @JSImport("react-intl", "IntlProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "IntlProvider.defaultProps")
    @js.native
    def defaultProps: PickIntlConfigtimeZonefor = js.native
    inline def defaultProps_=(x: PickIntlConfigtimeZonefor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "IntlProvider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typings.reactIntl.componentsProviderMod.State): PartialState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevConfigCache.asInstanceOf[js.Any])).asInstanceOf[PartialState | Null]
  }
  
  @JSImport("react-intl", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typings.formatjsIntl.mod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typings.formatjsIntl.mod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
  }
  
  @JSImport("react-intl", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typings.formatjsIntl.mod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typings.formatjsIntl.mod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("react-intl", "RawIntlProvider")
  @js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  
  @JSImport("react-intl", "ReactIntlError")
  @js.native
  class ReactIntlError[T /* <: IntlErrorCode */] protected () extends IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.mod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactNode, OptionalIntlConfig, IntlShape] = js.native
  
  inline def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  inline def defineMessage[T](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessages")(msgs.asInstanceOf[js.Any]).asInstanceOf[U]
  
  inline def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName])]
  
  inline def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName])]
  
  inline def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName])]
  
  inline def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName])]
  
  inline def useIntl(): IntlShape = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntl")().asInstanceOf[IntlShape]
}
