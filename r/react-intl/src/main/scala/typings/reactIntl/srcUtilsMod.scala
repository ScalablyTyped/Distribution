package typings.reactIntl

import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.MessageIds
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("react-intl/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<react-intl.react-intl/src/types.ResolvedIntlConfig, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    inline def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.fallbackOnEmptyString")
    @js.native
    def fallbackOnEmptyString: js.UndefOr[Boolean] = js.native
    inline def fallbackOnEmptyString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnEmptyString")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    inline def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[MessageIds, js.Array[MessageFormatElement] | String] = js.native
    inline def messages_=(x: Record[MessageIds, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    inline def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.textComponent")
    @js.native
    def textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119, starting with typings.react.mod.ComponentType[js.Object], typings.reactIntl.reactIntlStrings.a, typings.reactIntl.reactIntlStrings.abbr */ Any
      ] = js.native
    inline def textComponent_=(
      x: js.UndefOr[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119, starting with typings.react.mod.ComponentType[js.Object], typings.reactIntl.reactIntlStrings.a, typings.reactIntl.reactIntlStrings.abbr */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/utils", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    inline def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  inline def assignUniqueKeysToParts(
    formatXMLElementFn: FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]
  ): FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignUniqueKeysToParts")(formatXMLElementFn.asInstanceOf[js.Any]).asInstanceOf[FormatXMLElementFn[ReactNode, String | ReactNode | (js.Array[String | ReactNode])]]
  
  inline def invariantIntlContext(): /* asserts intl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariantIntlContext")().asInstanceOf[/* asserts intl */ Boolean]
  inline def invariantIntlContext(intl: Any): /* asserts intl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("invariantIntlContext")(intl.asInstanceOf[js.Any]).asInstanceOf[/* asserts intl */ Boolean]
  
  inline def shallowEqual[T /* <: Record[String, Any] */](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")().asInstanceOf[Boolean]
  inline def shallowEqual[T /* <: Record[String, Any] */](objA: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shallowEqual[T /* <: Record[String, Any] */](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowEqual[T /* <: Record[String, Any] */](objA: Unit, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
