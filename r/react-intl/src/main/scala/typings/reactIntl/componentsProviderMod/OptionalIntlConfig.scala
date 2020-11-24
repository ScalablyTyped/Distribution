package typings.reactIntl.componentsProviderMod

import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-intl.react-intl/src/types.IntlConfig, keyof std.Pick<react-intl.react-intl/src/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> & std.Partial<std.Pick<react-intl.react-intl/src/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
@js.native
trait OptionalIntlConfig extends js.Object {
  
  var defaultFormats: js.UndefOr[CustomFormats] = js.native
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var defaultRichTextElements: js.UndefOr[
    Record[
      String, 
      FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
    ]
  ] = js.native
  
  var formats: js.UndefOr[CustomFormats] = js.native
  
  var locale: String = js.native
  
  var messages: js.UndefOr[Record[String, js.Array[MessageFormatElement] | String]] = js.native
  
  var onError: js.UndefOr[OnErrorFn] = js.native
  
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.native
}
object OptionalIntlConfig {
  
  @scala.inline
  def apply(locale: String): OptionalIntlConfig = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalIntlConfig]
  }
  
  @scala.inline
  implicit class OptionalIntlConfigOps[Self <: OptionalIntlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormats(value: CustomFormats): Self = this.set("defaultFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFormats: Self = this.set("defaultFormats", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setDefaultRichTextElements(
      value: Record[
          String, 
          FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
        ]
    ): Self = this.set("defaultRichTextElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRichTextElements: Self = this.set("defaultRichTextElements", js.undefined)
    
    @scala.inline
    def setFormats(value: CustomFormats): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = this.set("textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComponent: Self = this.set("textComponent", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setWrapRichTextChunksInFragment(value: Boolean): Self = this.set("wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapRichTextChunksInFragment: Self = this.set("wrapRichTextChunksInFragment", js.undefined)
  }
}
