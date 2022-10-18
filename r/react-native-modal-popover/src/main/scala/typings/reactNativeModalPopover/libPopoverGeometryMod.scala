package typings.reactNativeModalPopover

import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverGeometryMod {
  
  @JSImport("react-native-modal-popover/lib/PopoverGeometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeGeometry(contentSize: Size, placement: Placement, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("computeGeometry")(contentSize.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], fromRect.asInstanceOf[js.Any], displayArea.asInstanceOf[js.Any], arrowSize.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  
  inline def computeGeometry_auto(contentSize: Size, placement: auto, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("computeGeometry")(contentSize.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], fromRect.asInstanceOf[js.Any], displayArea.asInstanceOf[js.Any], arrowSize.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  
  trait Geometry extends StObject {
    
    var anchor: Point
    
    var origin: Point
    
    var placement: Placement
  }
  object Geometry {
    
    inline def apply(anchor: Point, origin: Point, placement: Placement): Geometry = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometry]
    }
    
    extension [Self <: Geometry](x: Self) {
      
      inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.end
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.start
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom = "bottom".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom]
    
    inline def end: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.end = "end".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.end]
    
    inline def start: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.start = "start".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.start]
    
    inline def top: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top = "top".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top]
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Rect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
