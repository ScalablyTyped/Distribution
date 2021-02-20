package typings.sindresorhusIs

import typings.sindresorhusIs.sindresorhusIsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NodeName extends StObject {
    
    var nodeName: String = js.native
    
    var nodeType: `1` = js.native
  }
  object NodeName {
    
    @scala.inline
    def apply(nodeName: String, nodeType: `1`): NodeName = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeName]
    }
    
    @scala.inline
    implicit class NodeNameMutableBuilder[Self <: NodeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: `1`): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pipe extends StObject {
    
    var pipe: js.Function = js.native
  }
  object Pipe {
    
    @scala.inline
    def apply(pipe: js.Function): Pipe = {
      val __obj = js.Dynamic.literal(pipe = pipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pipe]
    }
    
    @scala.inline
    implicit class PipeMutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPipe(value: js.Function): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    }
  }
}
