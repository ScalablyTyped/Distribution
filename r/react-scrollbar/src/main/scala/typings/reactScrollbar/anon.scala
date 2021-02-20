package typings.reactScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ContainerHeight extends StObject {
    
    var containerHeight: Double = js.native
    
    var containerWidth: Double = js.native
    
    var leftPosition: Double = js.native
    
    var realHeight: Double = js.native
    
    var realWidth: Double = js.native
    
    var topPosition: Double = js.native
  }
  object ContainerHeight {
    
    @scala.inline
    def apply(
      containerHeight: Double,
      containerWidth: Double,
      leftPosition: Double,
      realHeight: Double,
      realWidth: Double,
      topPosition: Double
    ): ContainerHeight = {
      val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], leftPosition = leftPosition.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerHeight]
    }
    
    @scala.inline
    implicit class ContainerHeightMutableBuilder[Self <: ContainerHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftPosition(value: Double): Self = StObject.set(x, "leftPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealHeight(value: Double): Self = StObject.set(x, "realHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealWidth(value: Double): Self = StObject.set(x, "realWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
    }
  }
}
