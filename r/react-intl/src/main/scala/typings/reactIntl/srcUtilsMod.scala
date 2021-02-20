package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  /* Inlined std.Pick<react-intl.react-intl/src/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    @scala.inline
    def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    @scala.inline
    def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    @scala.inline
    def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    @scala.inline
    def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.textComponent")
    @js.native
    def textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
      ] = js.native
    @scala.inline
    def textComponent_=(
      x: js.UndefOr[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    @scala.inline
    def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl/src/utils", "assignUniqueKeysToParts")
  @js.native
  def assignUniqueKeysToParts(
    formatXMLElementFn: FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
  ): FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])] = js.native
  
  @JSImport("react-intl/src/utils", "invariantIntlContext")
  @js.native
  def invariantIntlContext(): /* asserts intl */ Boolean = js.native
  @JSImport("react-intl/src/utils", "invariantIntlContext")
  @js.native
  def invariantIntlContext(intl: js.Any): /* asserts intl */ Boolean = js.native
}
