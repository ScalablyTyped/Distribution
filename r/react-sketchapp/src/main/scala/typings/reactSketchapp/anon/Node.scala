package typings.reactSketchapp.anon

import typings.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: YogaNode
  
  var stop: js.UndefOr[Boolean] = js.undefined
}
object Node {
  
  inline def apply(node: YogaNode): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setNode(value: YogaNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Boolean): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
