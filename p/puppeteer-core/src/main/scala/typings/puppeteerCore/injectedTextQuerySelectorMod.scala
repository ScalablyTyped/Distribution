package typings.puppeteerCore

import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectedTextQuerySelectorMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/injected/TextQuerySelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def textQuerySelector(root: Node, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("textQuerySelector")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def textQuerySelectorAll(root: Node, selector: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("textQuerySelectorAll")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
