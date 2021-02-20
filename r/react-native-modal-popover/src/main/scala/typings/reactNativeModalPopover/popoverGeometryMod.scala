package typings.reactNativeModalPopover

import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.left
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.right
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverGeometryMod {
  
  @JSImport("react-native-modal-popover/lib/PopoverGeometry", "computeGeometry")
  @js.native
  def computeGeometry_auto(contentSize: Size, placement: auto, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = js.native
  @JSImport("react-native-modal-popover/lib/PopoverGeometry", "computeGeometry")
  @js.native
  def computeGeometry_bottom(contentSize: Size, placement: bottom, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = js.native
  @JSImport("react-native-modal-popover/lib/PopoverGeometry", "computeGeometry")
  @js.native
  def computeGeometry_left(contentSize: Size, placement: left, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = js.native
  @JSImport("react-native-modal-popover/lib/PopoverGeometry", "computeGeometry")
  @js.native
  def computeGeometry_right(contentSize: Size, placement: right, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = js.native
  @JSImport("react-native-modal-popover/lib/PopoverGeometry", "computeGeometry")
  @js.native
  def computeGeometry_top(contentSize: Size, placement: top, fromRect: Rect, displayArea: Rect, arrowSize: Size): Geometry = js.native
  
  @js.native
  trait Geometry extends StObject {
    
    var anchor: Point = js.native
    
    var origin: Point = js.native
    
    var placement: Placement = js.native
  }
  object Geometry {
    
    @scala.inline
    def apply(anchor: Point, origin: Point, placement: Placement): Geometry = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometry]
    }
    
    @scala.inline
    implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.right
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom
    - typings.reactNativeModalPopover.reactNativeModalPopoverStrings.left
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottom: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom = "bottom".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.bottom]
    
    @scala.inline
    def left: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.left = "left".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.left]
    
    @scala.inline
    def right: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.right = "right".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.right]
    
    @scala.inline
    def top: typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top = "top".asInstanceOf[typings.reactNativeModalPopover.reactNativeModalPopoverStrings.top]
  }
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rect extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Rect {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Size {
    
    @scala.inline
    def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
