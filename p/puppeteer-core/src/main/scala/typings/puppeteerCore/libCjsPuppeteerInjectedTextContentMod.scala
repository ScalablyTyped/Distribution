package typings.puppeteerCore

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerInjectedTextContentMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/injected/TextContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTextContent(root: Node): TextContent = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextContent")(root.asInstanceOf[js.Any]).asInstanceOf[TextContent]
  
  inline def isSuitableNodeForTextMatching(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuitableNodeForTextMatching")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait TextContent extends StObject {
    
    var full: String
    
    var immediate: js.Array[String]
  }
  object TextContent {
    
    inline def apply(full: String, immediate: js.Array[String]): TextContent = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextContent] (val x: Self) extends AnyVal {
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setImmediate(value: js.Array[String]): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateVarargs(value: String*): Self = StObject.set(x, "immediate", js.Array(value*))
    }
  }
}
