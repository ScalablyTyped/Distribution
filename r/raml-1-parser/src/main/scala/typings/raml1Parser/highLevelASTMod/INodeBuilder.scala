package typings.raml1Parser.highLevelASTMod

import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeBuilder extends StObject {
  
  def process(node: IHighLevelNode, childrenToAdopt: js.Array[ILowLevelASTNode]): js.Array[IParseResult]
}
object INodeBuilder {
  
  inline def apply(process: (IHighLevelNode, js.Array[ILowLevelASTNode]) => js.Array[IParseResult]): INodeBuilder = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[INodeBuilder]
  }
  
  extension [Self <: INodeBuilder](x: Self) {
    
    inline def setProcess(value: (IHighLevelNode, js.Array[ILowLevelASTNode]) => js.Array[IParseResult]): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
  }
}
