package typings.reactSimpleMaps

import typings.react.mod.CSSProperties
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coordinates extends StObject {
    
    var coordinates: js.Tuple2[Double, Double]
    
    var zoom: Double
  }
  object Coordinates {
    
    inline def apply(coordinates: js.Tuple2[Double, Double], zoom: Double): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    var default: js.UndefOr[CSSProperties] = js.undefined
    
    var hover: js.UndefOr[CSSProperties] = js.undefined
    
    var pressed: js.UndefOr[CSSProperties] = js.undefined
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: CSSProperties): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setHover(value: CSSProperties): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setPressed(value: CSSProperties): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    }
  }
  
  trait Dragging extends StObject {
    
    var dragging: WheelEvent
    
    var k: Double
    
    var x: Double
    
    var y: Double
  }
  object Dragging {
    
    inline def apply(dragging: WheelEvent, k: Double, x: Double, y: Double): Dragging = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dragging]
    }
    
    extension [Self <: Dragging](x: Self) {
      
      inline def setDragging(value: WheelEvent): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
