package typings.reactDock

import typings.propTypes.mod.Requireable
import typings.reactDock.reactDockStrings.bottom
import typings.reactDock.reactDockStrings.left
import typings.reactDock.reactDockStrings.right
import typings.reactDock.reactDockStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultSize extends StObject {
    
    var defaultSize: Requireable[Double]
    
    var dimMode: Requireable[String]
    
    var dimStyle: Requireable[js.Object]
    
    var dockStyle: Requireable[js.Object]
    
    var duration: Requireable[Double]
    
    var fluid: Requireable[Boolean]
    
    var isVisible: Requireable[Boolean]
    
    var onSizeChange: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onVisibleChange: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var position: Requireable[String]
    
    var size: Requireable[Double]
    
    var zIndex: Requireable[Double]
  }
  object DefaultSize {
    
    inline def apply(
      defaultSize: Requireable[Double],
      dimMode: Requireable[String],
      dimStyle: Requireable[js.Object],
      dockStyle: Requireable[js.Object],
      duration: Requireable[Double],
      fluid: Requireable[Boolean],
      isVisible: Requireable[Boolean],
      onSizeChange: Requireable[js.Function1[/* repeated */ Any, Any]],
      onVisibleChange: Requireable[js.Function1[/* repeated */ Any, Any]],
      position: Requireable[String],
      size: Requireable[Double],
      zIndex: Requireable[Double]
    ): DefaultSize = {
      val __obj = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any], dimMode = dimMode.asInstanceOf[js.Any], dimStyle = dimStyle.asInstanceOf[js.Any], dockStyle = dockStyle.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onSizeChange = onSizeChange.asInstanceOf[js.Any], onVisibleChange = onVisibleChange.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSize]
    }
    
    extension [Self <: DefaultSize](x: Self) {
      
      inline def setDefaultSize(value: Requireable[Double]): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDimMode(value: Requireable[String]): Self = StObject.set(x, "dimMode", value.asInstanceOf[js.Any])
      
      inline def setDimStyle(value: Requireable[js.Object]): Self = StObject.set(x, "dimStyle", value.asInstanceOf[js.Any])
      
      inline def setDockStyle(value: Requireable[js.Object]): Self = StObject.set(x, "dockStyle", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Requireable[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFluid(value: Requireable[Boolean]): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Requireable[Boolean]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setOnSizeChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSizeChange", value.asInstanceOf[js.Any])
      
      inline def setOnVisibleChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onVisibleChange", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Requireable[String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Requireable[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Requireable[Double]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait DimMode extends StObject {
    
    var defaultSize: Double
    
    var dimMode: String
    
    var duration: Double
    
    var fluid: Boolean
    
    var position: String
    
    var zIndex: Double
  }
  object DimMode {
    
    inline def apply(
      defaultSize: Double,
      dimMode: String,
      duration: Double,
      fluid: Boolean,
      position: String,
      zIndex: Double
    ): DimMode = {
      val __obj = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any], dimMode = dimMode.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DimMode]
    }
    
    extension [Self <: DimMode](x: Self) {
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDimMode(value: String): Self = StObject.set(x, "dimMode", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsResizing extends StObject {
    
    var isResizing: js.UndefOr[Boolean] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var position: left | right | top | bottom
    
    var size: Double
  }
  object IsResizing {
    
    inline def apply(position: left | right | top | bottom, size: Double): IsResizing = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsResizing]
    }
    
    extension [Self <: IsResizing](x: Self) {
      
      inline def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      inline def setIsResizingUndefined: Self = StObject.set(x, "isResizing", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
