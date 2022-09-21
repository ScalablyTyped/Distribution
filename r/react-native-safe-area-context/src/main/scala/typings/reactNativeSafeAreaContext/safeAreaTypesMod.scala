package typings.reactNativeSafeAreaContext

import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ViewProps
import typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.margin
import typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.top
    - typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.right
    - typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.bottom
    - typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.left
  */
  trait Edge extends StObject
  object Edge {
    
    inline def bottom: typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.bottom = "bottom".asInstanceOf[typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.bottom]
    
    inline def left: typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.left = "left".asInstanceOf[typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.left]
    
    inline def right: typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.right = "right".asInstanceOf[typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.right]
    
    inline def top: typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.top = "top".asInstanceOf[typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.top]
  }
  
  trait EdgeInsets extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object EdgeInsets {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): EdgeInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeInsets]
    }
    
    extension [Self <: EdgeInsets](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type InsetChangeNativeCallback = js.Function1[/* event */ InsetChangedEvent, Unit]
  
  type InsetChangedEvent = NativeSyntheticEvent[Metrics]
  
  trait Metrics extends StObject {
    
    var frame: Rect
    
    var insets: EdgeInsets
  }
  object Metrics {
    
    inline def apply(frame: Rect, insets: EdgeInsets): Metrics = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    extension [Self <: Metrics](x: Self) {
      
      inline def setFrame(value: Rect): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeSafeAreaProviderProps
    extends StObject
       with ViewProps {
    
    var onInsetsChange: InsetChangeNativeCallback
  }
  object NativeSafeAreaProviderProps {
    
    inline def apply(onInsetsChange: /* event */ InsetChangedEvent => Unit): NativeSafeAreaProviderProps = {
      val __obj = js.Dynamic.literal(onInsetsChange = js.Any.fromFunction1(onInsetsChange))
      __obj.asInstanceOf[NativeSafeAreaProviderProps]
    }
    
    extension [Self <: NativeSafeAreaProviderProps](x: Self) {
      
      inline def setOnInsetsChange(value: /* event */ InsetChangedEvent => Unit): Self = StObject.set(x, "onInsetsChange", js.Any.fromFunction1(value))
    }
  }
  
  trait NativeSafeAreaViewProps
    extends StObject
       with ViewProps {
    
    var edges: js.UndefOr[js.Array[Edge]] = js.undefined
    
    var mode: js.UndefOr[padding | margin] = js.undefined
  }
  object NativeSafeAreaViewProps {
    
    inline def apply(): NativeSafeAreaViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeSafeAreaViewProps]
    }
    
    extension [Self <: NativeSafeAreaViewProps](x: Self) {
      
      inline def setEdges(value: js.Array[Edge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setMode(value: padding | margin): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
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
}
