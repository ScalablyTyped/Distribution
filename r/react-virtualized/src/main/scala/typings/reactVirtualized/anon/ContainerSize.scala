package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSize extends StObject {
  
  var align: String = js.native
  
  var containerSize: Double = js.native
  
  var currentOffset: Double = js.native
  
  var targetIndex: Double = js.native
}
object ContainerSize {
  
  @scala.inline
  def apply(align: String, containerSize: Double, currentOffset: Double, targetIndex: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], currentOffset = currentOffset.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSize]
  }
  
  @scala.inline
  implicit class ContainerSizeMutableBuilder[Self <: ContainerSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentOffset(value: Double): Self = StObject.set(x, "currentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
  }
}
