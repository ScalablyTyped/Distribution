package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSize extends StObject {
  
  var containerHeight: Double = js.native
  
  var containerWidth: Double = js.native
}
object ContainerSize {
  
  @scala.inline
  def apply(containerHeight: Double, containerWidth: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSize]
  }
  
  @scala.inline
  implicit class ContainerSizeMutableBuilder[Self <: ContainerSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
  }
}
