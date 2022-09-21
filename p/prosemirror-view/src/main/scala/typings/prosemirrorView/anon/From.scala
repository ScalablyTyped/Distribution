package typings.prosemirrorView.anon

import typings.prosemirrorView.mod.DOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Double
  
  var fromOffset: Double
  
  var node: DOMNode
  
  var to: Double
  
  var toOffset: Double
}
object From {
  
  inline def apply(from: Double, fromOffset: Double, node: DOMNode, to: Double, toOffset: Double): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromOffset = fromOffset.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toOffset = toOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromOffset(value: Double): Self = StObject.set(x, "fromOffset", value.asInstanceOf[js.Any])
    
    inline def setNode(value: DOMNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToOffset(value: Double): Self = StObject.set(x, "toOffset", value.asInstanceOf[js.Any])
  }
}
