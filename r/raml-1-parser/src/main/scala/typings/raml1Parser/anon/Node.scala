package typings.raml1Parser.anon

import typings.raml1Parser.distParserAstDotcoreLowLevelASTProxyMod.ValueTransformer
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: ILowLevelASTNode
  
  var transformer: ValueTransformer
}
object Node {
  
  inline def apply(node: ILowLevelASTNode, transformer: ValueTransformer): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setNode(value: ILowLevelASTNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setTransformer(value: ValueTransformer): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
  }
}
