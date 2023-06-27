package typings.speechRuleEngine

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.XPathNSResolver
import typings.std.XPathResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonXpathUtilMod {
  
  @JSImport("speech-rule-engine/js/common/xpath_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evalXPath(expression: String, rootNode: Node): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("evalXPath")(expression.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def evaluateBoolean(expression: String, rootNode: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateBoolean")(expression.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def evaluateString(expression: String, rootNode: Node): String = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateString")(expression.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveNameSpace(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNameSpace")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def updateEvaluator(node: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateEvaluator")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object xpath {
    
    @JSImport("speech-rule-engine/js/common/xpath_util", "xpath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createNSResolver(nodeResolver: Node): XPathNSResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("createNSResolver")(nodeResolver.asInstanceOf[js.Any]).asInstanceOf[XPathNSResolver]
    
    @JSImport("speech-rule-engine/js/common/xpath_util", "xpath.currentDocument")
    @js.native
    def currentDocument: Document = js.native
    inline def currentDocument_=(x: Document): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentDocument")(x.asInstanceOf[js.Any])
    
    inline def evaluate(x: String, node: Node, nsr: Resolver, rt: Double, result: XPathResult): XPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(x.asInstanceOf[js.Any], node.asInstanceOf[js.Any], nsr.asInstanceOf[js.Any], rt.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[XPathResult]
    
    @JSImport("speech-rule-engine/js/common/xpath_util", "xpath.result")
    @js.native
    def result: Any = js.native
    inline def result_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("result")(x.asInstanceOf[js.Any])
  }
  
  trait Resolver extends StObject {
    
    var lookupNamespaceURI: Any
  }
  object Resolver {
    
    inline def apply(lookupNamespaceURI: Any): Resolver = {
      val __obj = js.Dynamic.literal(lookupNamespaceURI = lookupNamespaceURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resolver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
      
      inline def setLookupNamespaceURI(value: Any): Self = StObject.set(x, "lookupNamespaceURI", value.asInstanceOf[js.Any])
    }
  }
}
