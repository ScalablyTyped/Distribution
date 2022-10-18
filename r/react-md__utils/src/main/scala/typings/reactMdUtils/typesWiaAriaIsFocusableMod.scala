package typings.reactMdUtils

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaIsFocusableMod {
  
  @JSImport("@react-md/utils/types/wia-aria/isFocusable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFocusable(element: Document): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Document, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.tab
    - typings.reactMdUtils.reactMdUtilsStrings.programmatic
  */
  trait ElementFocusType extends StObject
  object ElementFocusType {
    
    inline def programmatic: typings.reactMdUtils.reactMdUtilsStrings.programmatic = "programmatic".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.programmatic]
    
    inline def tab: typings.reactMdUtils.reactMdUtilsStrings.tab = "tab".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.tab]
  }
}
