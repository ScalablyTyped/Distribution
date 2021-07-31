package typings.reactMdUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractTextContentMod {
  
  @JSImport("@react-md/utils/types/wia-aria/extractTextContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractTextContent(stringOrElement: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def extractTextContent(stringOrElement: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
}
