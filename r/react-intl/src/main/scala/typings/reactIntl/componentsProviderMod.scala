package typings.reactIntl

import typings.formatjsIntl.srcCreateIntlMod.CreateIntlFn
import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.react.mod.PropsWithChildren
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactIntl.anon.PartialState
import typings.reactIntl.anon.PickIntlConfigtimeZonefor
import typings.reactIntl.srcTypesMod.IntlShape
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsProviderMod {
  
  @JSImport("react-intl/src/components/provider", JSImport.Default)
  @js.native
  class default () extends IntlProvider
  /* static members */
  object default {
    
    @JSImport("react-intl/src/components/provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/provider", "default.defaultProps")
    @js.native
    def defaultProps: PickIntlConfigtimeZonefor = js.native
    @scala.inline
    def defaultProps_=(x: PickIntlConfigtimeZonefor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/provider", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): PartialState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevConfigCache.asInstanceOf[js.Any])).asInstanceOf[PartialState | Null]
  }
  
  @JSImport("react-intl/src/components/provider", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactNode, OptionalIntlConfig, IntlShape] = js.native
  
  @js.native
  trait IntlProvider
    extends PureComponent[PropsWithChildren[OptionalIntlConfig], State, js.Any] {
    
    var cache: js.Any = js.native
  }
  
  /* Inlined std.Omit<react-intl.react-intl/src/types.IntlConfig, keyof std.Pick<react-intl.react-intl/src/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> & std.Partial<std.Pick<react-intl.react-intl/src/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
  trait OptionalIntlConfig extends StObject {
    
    var defaultFormats: js.UndefOr[CustomFormats] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var defaultRichTextElements: js.UndefOr[
        Record[
          String, 
          FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
        ]
      ] = js.undefined
    
    var formats: js.UndefOr[CustomFormats] = js.undefined
    
    var locale: String
    
    var messages: js.UndefOr[Record[String, js.Array[MessageFormatElement] | String]] = js.undefined
    
    var onError: js.UndefOr[OnErrorFn] = js.undefined
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
      ] = js.undefined
    
    var timeZone: js.UndefOr[String] = js.undefined
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.undefined
  }
  object OptionalIntlConfig {
    
    @scala.inline
    def apply(locale: String): OptionalIntlConfig = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionalIntlConfig]
    }
    
    @scala.inline
    implicit class OptionalIntlConfigMutableBuilder[Self <: OptionalIntlConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFormatsUndefined: Self = StObject.set(x, "defaultFormats", js.undefined)
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setDefaultRichTextElements(
        value: Record[
              String, 
              FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
            ]
      ): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
      
      @scala.inline
      def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setWrapRichTextChunksInFragment(value: Boolean): Self = StObject.set(x, "wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapRichTextChunksInFragmentUndefined: Self = StObject.set(x, "wrapRichTextChunksInFragment", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    /**
      * Explicit intl cache to prevent memory leaks
      */
    var cache: IntlCache
    
    /**
      * Intl object we created
      */
    var intl: js.UndefOr[IntlShape] = js.undefined
    
    /**
      * list of memoized config we care about.
      * This is important since creating intl is
      * very expensive
      */
    var prevConfig: OptionalIntlConfig
  }
  object State {
    
    @scala.inline
    def apply(cache: IntlCache, prevConfig: OptionalIntlConfig): State = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: IntlCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntlUndefined: Self = StObject.set(x, "intl", js.undefined)
      
      @scala.inline
      def setPrevConfig(value: OptionalIntlConfig): Self = StObject.set(x, "prevConfig", value.asInstanceOf[js.Any])
    }
  }
}
