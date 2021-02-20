package typings.reResizable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait As extends StObject {
    
    var as: String = js.native
    
    var enable: Bottom = js.native
    
    var grid: js.Array[Double] = js.native
    
    var lockAspectRatio: Boolean = js.native
    
    var lockAspectRatioExtraHeight: Double = js.native
    
    var lockAspectRatioExtraWidth: Double = js.native
    
    def onResize(): Unit = js.native
    
    def onResizeStart(): Unit = js.native
    
    def onResizeStop(): Unit = js.native
    
    var resizeRatio: Double = js.native
    
    var scale: Double = js.native
    
    var snapGap: Double = js.native
  }
  object As {
    
    @scala.inline
    def apply(
      as: String,
      enable: Bottom,
      grid: js.Array[Double],
      lockAspectRatio: Boolean,
      lockAspectRatioExtraHeight: Double,
      lockAspectRatioExtraWidth: Double,
      onResize: () => Unit,
      onResizeStart: () => Unit,
      onResizeStop: () => Unit,
      resizeRatio: Double,
      scale: Double,
      snapGap: Double
    ): As = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio.asInstanceOf[js.Any], lockAspectRatioExtraHeight = lockAspectRatioExtraHeight.asInstanceOf[js.Any], lockAspectRatioExtraWidth = lockAspectRatioExtraWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), resizeRatio = resizeRatio.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapGap = snapGap.asInstanceOf[js.Any])
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable(value: Bottom): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value :_*))
      
      @scala.inline
      def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatioExtraHeight(value: Double): Self = StObject.set(x, "lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAspectRatioExtraWidth(value: Double): Self = StObject.set(x, "lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResizeStart(value: () => Unit): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResizeStop(value: () => Unit): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResizeRatio(value: Double): Self = StObject.set(x, "resizeRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapGap(value: Double): Self = StObject.set(x, "snapGap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Boolean = js.native
    
    var bottomLeft: Boolean = js.native
    
    var bottomRight: Boolean = js.native
    
    var left: Boolean = js.native
    
    var right: Boolean = js.native
    
    var top: Boolean = js.native
    
    var topLeft: Boolean = js.native
    
    var topRight: Boolean = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(
      bottom: Boolean,
      bottomLeft: Boolean,
      bottomRight: Boolean,
      left: Boolean,
      right: Boolean,
      top: Boolean,
      topLeft: Boolean,
      topRight: Boolean
    ): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: Boolean): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: Boolean): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: Boolean): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: Boolean): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: String = js.native
    
    var width: String = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: String, width: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HeightWidth extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object HeightWidth {
    
    @scala.inline
    def apply(): HeightWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeightWidth]
    }
    
    @scala.inline
    implicit class HeightWidthMutableBuilder[Self <: HeightWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MaxHeight extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
  }
  object MaxHeight {
    
    @scala.inline
    def apply(): MaxHeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxHeight]
    }
    
    @scala.inline
    implicit class MaxHeightMutableBuilder[Self <: MaxHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    }
  }
  
  @js.native
  trait NewHeight extends StObject {
    
    var newHeight: Double = js.native
    
    var newWidth: Double = js.native
  }
  object NewHeight {
    
    @scala.inline
    def apply(newHeight: Double, newWidth: Double): NewHeight = {
      val __obj = js.Dynamic.literal(newHeight = newHeight.asInstanceOf[js.Any], newWidth = newWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewHeight]
    }
    
    @scala.inline
    implicit class NewHeightMutableBuilder[Self <: NewHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewHeight(value: Double): Self = StObject.set(x, "newHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Width {
    
    @scala.inline
    def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: js.UndefOr[js.Array[Double]] = js.native
    
    var y: js.UndefOr[js.Array[Double]] = js.native
  }
  object X {
    
    @scala.inline
    def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      @scala.inline
      def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Y extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Y {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
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
}
