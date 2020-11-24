package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/lib/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def assignUniqueKeysToParts(
    formatXMLElementFn: FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
  ): FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])] = js.native
  
  def invariantIntlContext(): /* asserts intl */ Boolean = js.native
  def invariantIntlContext(intl: js.Any): /* asserts intl */ Boolean = js.native
  
  @js.native
  object DEFAULT_INTL_CONFIG extends js.Object {
    
    var defaultFormats: CustomFormats = js.native
    
    var defaultLocale: String = js.native
    
    var formats: CustomFormats = js.native
    
    var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    
    var onError: OnErrorFn = js.native
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
      ] = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
}
