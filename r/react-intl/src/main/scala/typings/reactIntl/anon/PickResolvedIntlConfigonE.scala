package typings.reactIntl.anon

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.MessageIds
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-intl.react-intl/src/types.ResolvedIntlConfig, 'onError' | 'timeZone' | 'fallbackOnEmptyString' | 'formats' | 'messages' | 'defaultLocale' | 'defaultFormats' | 'textComponent'> */
trait PickResolvedIntlConfigonE extends StObject {
  
  var defaultFormats: CustomFormats
  
  var defaultLocale: String
  
  var fallbackOnEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var formats: CustomFormats
  
  var messages: Record[MessageIds, js.Array[MessageFormatElement] | String]
  
  var onError: OnErrorFn
  
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ Any
  ] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object PickResolvedIntlConfigonE {
  
  inline def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    messages: Record[MessageIds, js.Array[MessageFormatElement] | String],
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
  ): PickResolvedIntlConfigonE = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickResolvedIntlConfigonE]
  }
  
  extension [Self <: PickResolvedIntlConfigonE](x: Self) {
    
    inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackOnEmptyString(value: Boolean): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
    
    inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Record[MessageIds, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
    
    inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
