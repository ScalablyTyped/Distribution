package typings.reactIntl

import typings.formatjsIntl.mod.IntlError
import typings.formatjsIntl.srcCreateIntlMod.CreateIntlFn
import typings.formatjsIntl.srcErrorMod.IntlErrorCode
import typings.formatjsIntl.srcTypesMod.FormatListOptions
import typings.formatjsIntl.srcTypesMod.FormatNumberOptions
import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.react.mod.RefAttributes
import typings.reactIntl.anon.Children
import typings.reactIntl.anon.DateTimeFormatOptionsCust
import typings.reactIntl.anon.DisplayNamesOptionsvalues
import typings.reactIntl.anon.FormatDateOptionsvaluePar
import typings.reactIntl.anon.IntlListFormatOptionsvalu
import typings.reactIntl.anon.OmitNumberFormatOptionslo
import typings.reactIntl.anon.PartialState
import typings.reactIntl.anon.PickResolvedIntlConfigonE
import typings.reactIntl.anon.ReadonlyIntlConfig
import typings.reactIntl.anon.Value
import typings.reactIntl.anon.WrappedComponent
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.srcComponentsDateTimeRangeMod.Props
import typings.reactIntl.srcComponentsInjectIntlMod.Opts
import typings.reactIntl.srcComponentsInjectIntlMod.WithIntlProps
import typings.reactIntl.srcComponentsInjectIntlMod.WrappedComponentProps
import typings.reactIntl.srcComponentsProviderMod.State
import typings.reactIntl.srcComponentsProviderMod.default
import typings.reactIntl.srcTypesMod.IntlConfig
import typings.reactIntl.srcTypesMod.IntlShape
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
  val FormattedDateParts: FC[FormatDateOptionsvaluePar] = js.native
  
  @JSImport("react-intl", "FormattedDateTimeRange")
  @js.native
  val FormattedDateTimeRange: FC[Props] = js.native
  
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  
  @JSImport("react-intl", "FormattedList")
  @js.native
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  
  @JSImport("react-intl", "FormattedListParts")
  @js.native
  val FormattedListParts: FC[FormatListOptions & Children] = js.native
  
  @JSImport("react-intl", "FormattedMessage")
  @js.native
  val FormattedMessage: NamedExoticComponent[
    typings.reactIntl.srcComponentsMessageMod.Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | ReactElement | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[ReactNode, ReactNode]) | Null
        ]
      ]
    ]
  ] = js.native
  
  @JSImport("react-intl", "FormattedNumber")
  @js.native
  val FormattedNumber: FC[OmitNumberFormatOptionslo] = js.native
  
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[FormatNumberOptions & Value] = js.native
  
  @JSImport("react-intl", "FormattedPlural")
  @js.native
  val FormattedPlural: FC[typings.reactIntl.srcComponentsPluralMod.Props] = js.native
  
  @JSImport("react-intl", "FormattedRelativeTime")
  @js.native
  val FormattedRelativeTime: FC[typings.reactIntl.srcComponentsRelativeMod.Props] = js.native
  
  @JSImport("react-intl", "FormattedTime")
  @js.native
  val FormattedTime: FC[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl", "FormattedTimeParts")
  @js.native
  val FormattedTimeParts: FC[FormatDateOptionsvaluePar] = js.native
  
  @JSImport("react-intl", "IntlContext")
  @js.native
  val IntlContext: Context[IntlShape] = js.native
  
  @JSImport("react-intl", "IntlProvider")
  @js.native
  open class IntlProvider () extends default
  /* static members */
  object IntlProvider {
    
    @JSImport("react-intl", "IntlProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "IntlProvider.defaultProps")
    @js.native
    def defaultProps: PickResolvedIntlConfigonE = js.native
    inline def defaultProps_=(x: PickResolvedIntlConfigonE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "IntlProvider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ReadonlyIntlConfig, hasPrevConfigCache: State): PartialState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevConfigCache.asInstanceOf[js.Any])).asInstanceOf[PartialState | Null]
  }
  
  @JSImport("react-intl", "InvalidConfigError")
  @js.native
  open class InvalidConfigError protected ()
    extends typings.formatjsIntl.mod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("react-intl", "MessageFormatError")
  @js.native
  open class MessageFormatError protected ()
    extends typings.formatjsIntl.mod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: Any) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Any) = this()
  }
  
  @JSImport("react-intl", "MissingDataError")
  @js.native
  open class MissingDataError protected ()
    extends typings.formatjsIntl.mod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("react-intl", "MissingTranslationError")
  @js.native
  open class MissingTranslationError protected ()
    extends typings.formatjsIntl.mod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("react-intl", "RawIntlProvider")
  @js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  
  @JSImport("react-intl", "ReactIntlError")
  @js.native
  open class ReactIntlError[T /* <: IntlErrorCode */] protected () extends IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
    def this(code: T, message: String, exception: Any) = this()
  }
  
  @JSImport("react-intl", "ReactIntlErrorCode")
  @js.native
  object ReactIntlErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IntlErrorCode & String] = js.native
    
    /* "FORMAT_ERROR" */ val FORMAT_ERROR: typings.formatjsIntl.srcErrorMod.IntlErrorCode.FORMAT_ERROR & String = js.native
    
    /* "INVALID_CONFIG" */ val INVALID_CONFIG: typings.formatjsIntl.srcErrorMod.IntlErrorCode.INVALID_CONFIG & String = js.native
    
    /* "MISSING_DATA" */ val MISSING_DATA: typings.formatjsIntl.srcErrorMod.IntlErrorCode.MISSING_DATA & String = js.native
    
    /* "MISSING_TRANSLATION" */ val MISSING_TRANSLATION: typings.formatjsIntl.srcErrorMod.IntlErrorCode.MISSING_TRANSLATION & String = js.native
    
    /* "UNSUPPORTED_FORMATTER" */ val UNSUPPORTED_FORMATTER: typings.formatjsIntl.srcErrorMod.IntlErrorCode.UNSUPPORTED_FORMATTER & String = js.native
  }
  
  @JSImport("react-intl", "UnsupportedFormatterError")
  @js.native
  open class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.mod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("react-intl", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactNode, IntlConfig, IntlShape] = js.native
  
  inline def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  inline def defineMessage[T /* <: MessageDescriptor */](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessages")(msgs.asInstanceOf[js.Any]).asInstanceOf[U]
  
  inline def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName])]
  
  inline def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName])]
  
  inline def useIntl(): IntlShape = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntl")().asInstanceOf[IntlShape]
}
