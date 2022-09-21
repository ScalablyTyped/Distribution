package typings.puppeteerCore

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectedXpathqueryselectorMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/injected/XPathQuerySelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xpathQuerySelector(root: Node, selector: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("xpathQuerySelector")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def xpathQuerySelectorAll(root: Node, selector: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("xpathQuerySelectorAll")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
}
