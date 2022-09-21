package typings.puppeteerCore

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerInjectedUtilMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/injected/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkVisibility(): Node | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")().asInstanceOf[Node | Boolean]
  inline def checkVisibility(node: Null, visible: Boolean): Node | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")(node.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[Node | Boolean]
  inline def checkVisibility(node: Node): Node | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")(node.asInstanceOf[js.Any]).asInstanceOf[Node | Boolean]
  inline def checkVisibility(node: Node, visible: Boolean): Node | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")(node.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[Node | Boolean]
  
  inline def createFunction(functionValue: String): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFunction")(functionValue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
}
