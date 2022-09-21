package typings.reactIntl

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.Formatters
import typings.formatjsIntl.srcTypesMod.IntlFormatters
import typings.formatjsIntl.srcTypesMod.Locale
import typings.formatjsIntl.srcTypesMod.MessageIds
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.formatjsIntl.srcTypesMod.OnWarnFn
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  /* Inlined std.Omit<react-intl.react-intl/src/types.ResolvedIntlConfig, keyof std.Pick<react-intl.react-intl/src/types.ResolvedIntlConfig, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> & std.Partial<std.Pick<react-intl.react-intl/src/types.ResolvedIntlConfig, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
  trait IntlConfig extends StObject {
    
    var defaultFormats: js.UndefOr[CustomFormats] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var defaultRichTextElements: js.UndefOr[
        Record[
          String, 
          FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
        ]
      ] = js.undefined
    
    var fallbackOnEmptyString: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[CustomFormats] = js.undefined
    
    var locale: Locale
    
    var messages: js.UndefOr[Record[MessageIds, js.Array[MessageFormatElement] | String]] = js.undefined
    
    var onError: js.UndefOr[OnErrorFn] = js.undefined
    
    var onWarn: js.UndefOr[OnWarnFn] = js.undefined
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ Any
      ] = js.undefined
    
    var timeZone: js.UndefOr[String] = js.undefined
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.undefined
  }
  object IntlConfig {
    
    inline def apply(locale: Locale): IntlConfig = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlConfig]
    }
    
    extension [Self <: IntlConfig](x: Self) {
      
      inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
      
      inline def setDefaultFormatsUndefined: Self = StObject.set(x, "defaultFormats", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDefaultRichTextElements(
        value: Record[
              String, 
              FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
            ]
      ): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
      
      inline def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
      
      inline def setFallbackOnEmptyString(value: Boolean): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
      
      inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
      
      inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: Record[MessageIds, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnWarn(value: /* warning */ String => Unit): Self = StObject.set(x, "onWarn", js.Any.fromFunction1(value))
      
      inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
      
      inline def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setWrapRichTextChunksInFragment(value: Boolean): Self = StObject.set(x, "wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
      
      inline def setWrapRichTextChunksInFragmentUndefined: Self = StObject.set(x, "wrapRichTextChunksInFragment", js.undefined)
    }
  }
  
  @js.native
  trait IntlShape
    extends StObject
       with ResolvedIntlConfig
       with IntlFormatters[ReactNode, ReactNode] {
    
    var formatters: Formatters = js.native
  }
  
  trait ResolvedIntlConfig
    extends StObject
       with typings.formatjsIntl.srcTypesMod.ResolvedIntlConfig[ReactNode] {
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ Any
      ] = js.undefined
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.undefined
  }
  object ResolvedIntlConfig {
    
    inline def apply(
      defaultFormats: CustomFormats,
      defaultLocale: String,
      formats: CustomFormats,
      locale: Locale,
      messages: Record[MessageIds, js.Array[MessageFormatElement] | String],
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): ResolvedIntlConfig = {
      val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[ResolvedIntlConfig]
    }
    
    extension [Self <: ResolvedIntlConfig](x: Self) {
      
      inline def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      inline def setWrapRichTextChunksInFragment(value: Boolean): Self = StObject.set(x, "wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
      
      inline def setWrapRichTextChunksInFragmentUndefined: Self = StObject.set(x, "wrapRichTextChunksInFragment", js.undefined)
    }
  }
}
