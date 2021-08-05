package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSizeAndOffset extends StObject {
  
  var containerSize: Double
  
  var offset: Double
}
object ContainerSizeAndOffset {
  
  inline def apply(containerSize: Double, offset: Double): ContainerSizeAndOffset = {
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSizeAndOffset]
  }
  
  extension [Self <: ContainerSizeAndOffset](x: Self) {
    
    inline def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
