package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSize extends StObject {
  
  var align: String
  
  var containerSize: Double
  
  var currentOffset: Double
  
  var targetIndex: Double
}
object ContainerSize {
  
  inline def apply(align: String, containerSize: Double, currentOffset: Double, targetIndex: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], currentOffset = currentOffset.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSize]
  }
  
  extension [Self <: ContainerSize](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setCurrentOffset(value: Double): Self = StObject.set(x, "currentOffset", value.asInstanceOf[js.Any])
    
    inline def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
  }
}
