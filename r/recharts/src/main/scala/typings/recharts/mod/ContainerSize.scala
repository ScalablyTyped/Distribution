package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSize extends StObject {
  
  var containerHeight: Double
  
  var containerWidth: Double
}
object ContainerSize {
  
  inline def apply(containerHeight: Double, containerWidth: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSize]
  }
  
  extension [Self <: ContainerSize](x: Self) {
    
    inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
  }
}
