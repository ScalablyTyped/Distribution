package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSizeAndOffset extends StObject {
  
  var containerSize: Double = js.native
  
  var offset: Double = js.native
}
object ContainerSizeAndOffset {
  
  @scala.inline
  def apply(containerSize: Double, offset: Double): ContainerSizeAndOffset = {
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSizeAndOffset]
  }
  
  @scala.inline
  implicit class ContainerSizeAndOffsetMutableBuilder[Self <: ContainerSizeAndOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
