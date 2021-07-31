package typings.reactIntl

import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.Formatters
import typings.formatjsIntl.srcTypesMod.IntlFormatters
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  trait IntlConfig
    extends StObject
       with typings.formatjsIntl.srcTypesMod.IntlConfig[ReactNode] {
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
      ] = js.undefined
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.undefined
  }
  object IntlConfig {
    
    @scala.inline
    def apply(
      defaultFormats: CustomFormats,
      defaultLocale: String,
      formats: CustomFormats,
      locale: String,
      messages: Record[String, js.Array[MessageFormatElement] | String],
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): IntlConfig = {
      val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[IntlConfig]
    }
    
    @scala.inline
    implicit class IntlConfigMutableBuilder[Self <: IntlConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      @scala.inline
      def setWrapRichTextChunksInFragment(value: Boolean): Self = StObject.set(x, "wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapRichTextChunksInFragmentUndefined: Self = StObject.set(x, "wrapRichTextChunksInFragment", js.undefined)
    }
  }
  
  @js.native
  trait IntlShape
    extends StObject
       with IntlConfig
       with IntlFormatters[ReactNode, ReactNode] {
    
    var formatters: Formatters = js.native
  }
}
