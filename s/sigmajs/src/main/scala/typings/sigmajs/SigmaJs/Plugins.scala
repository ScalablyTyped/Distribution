package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugins extends StObject {
  
  def dragNodes(sigma: Sigma, renderer: Renderer): DragNodes
  @JSName("dragNodes")
  var dragNodes_Original: DragNodes
}
object Plugins {
  
  inline def apply(dragNodes: DragNodes): Plugins = {
    val __obj = js.Dynamic.literal(dragNodes = dragNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  
  extension [Self <: Plugins](x: Self) {
    
    inline def setDragNodes(value: DragNodes): Self = StObject.set(x, "dragNodes", value.asInstanceOf[js.Any])
  }
}
