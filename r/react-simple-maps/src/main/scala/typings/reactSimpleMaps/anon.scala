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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
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
    
    var x: Double
    
    var y: Double
    
    var zoom: Double
  }
  object Dragging {
    
    inline def apply(dragging: WheelEvent, x: Double, y: Double, zoom: Double): Dragging = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dragging]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dragging] (val x: Self) extends AnyVal {
      
      inline def setDragging(value: WheelEvent): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
