package typings.reactIntl.anon

import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-intl.react-intl/src/types.IntlConfig, 'timeZone' | 'formats' | 'messages' | 'defaultLocale' | 'defaultFormats' | 'onError' | 'textComponent'> */
trait PickIntlConfigtimeZonefor extends StObject {
  
  var defaultFormats: CustomFormats
  
  var defaultLocale: String
  
  var formats: CustomFormats
  
  var messages: Record[String, js.Array[MessageFormatElement] | String]
  
  var onError: OnErrorFn
  
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object PickIntlConfigtimeZonefor {
  
  inline def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
  ): PickIntlConfigtimeZonefor = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfigtimeZonefor]
  }
  
  extension [Self <: PickIntlConfigtimeZonefor](x: Self) {
    
    inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
    
    inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
