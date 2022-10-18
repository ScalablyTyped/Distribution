package typings.puppeteerCore

import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerInjectedPierceQuerySelectorMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/injected/PierceQuerySelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pierceQuerySelector(root: Node, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pierceQuerySelector")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def pierceQuerySelectorAll(element: Node, selector: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("pierceQuerySelectorAll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
