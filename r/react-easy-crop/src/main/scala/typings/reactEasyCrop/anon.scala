package typings.reactEasyCrop

import typings.react.mod.CSSProperties
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContainerClassName extends StObject {
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var cropAreaClassName: js.UndefOr[String] = js.undefined
    
    var mediaClassName: js.UndefOr[String] = js.undefined
  }
  object ContainerClassName {
    
    inline def apply(): ContainerClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerClassName]
    }
    
    extension [Self <: ContainerClassName](x: Self) {
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setCropAreaClassName(value: String): Self = StObject.set(x, "cropAreaClassName", value.asInstanceOf[js.Any])
      
      inline def setCropAreaClassNameUndefined: Self = StObject.set(x, "cropAreaClassName", js.undefined)
      
      inline def setMediaClassName(value: String): Self = StObject.set(x, "mediaClassName", value.asInstanceOf[js.Any])
      
      inline def setMediaClassNameUndefined: Self = StObject.set(x, "mediaClassName", js.undefined)
    }
  }
  
  trait ContainerStyle extends StObject {
    
    var containerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var cropAreaStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var mediaStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ContainerStyle {
    
    inline def apply(): ContainerStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerStyle]
    }
    
    extension [Self <: ContainerStyle](x: Self) {
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setCropAreaStyle(value: CSSProperties): Self = StObject.set(x, "cropAreaStyle", value.asInstanceOf[js.Any])
      
      inline def setCropAreaStyleUndefined: Self = StObject.set(x, "cropAreaStyle", js.undefined)
      
      inline def setMediaStyle(value: CSSProperties): Self = StObject.set(x, "mediaStyle", value.asInstanceOf[js.Any])
      
      inline def setMediaStyleUndefined: Self = StObject.set(x, "mediaStyle", js.undefined)
    }
  }
  
  trait Crop extends StObject {
    
    var crop: X
    
    var zoom: Double
  }
  object Crop {
    
    inline def apply(crop: X, zoom: Double): Crop = {
      val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crop]
    }
    
    extension [Self <: Crop](x: Self) {
      
      inline def setCrop(value: X): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  trait CroppedAreaPercentages extends StObject {
    
    var croppedAreaPercentages: Area
    
    var croppedAreaPixels: Area
  }
  object CroppedAreaPercentages {
    
    inline def apply(croppedAreaPercentages: Area, croppedAreaPixels: Area): CroppedAreaPercentages = {
      val __obj = js.Dynamic.literal(croppedAreaPercentages = croppedAreaPercentages.asInstanceOf[js.Any], croppedAreaPixels = croppedAreaPixels.asInstanceOf[js.Any])
      __obj.asInstanceOf[CroppedAreaPercentages]
    }
    
    extension [Self <: CroppedAreaPercentages](x: Self) {
      
      inline def setCroppedAreaPercentages(value: Area): Self = StObject.set(x, "croppedAreaPercentages", value.asInstanceOf[js.Any])
      
      inline def setCroppedAreaPixels(value: Area): Self = StObject.set(x, "croppedAreaPixels", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShouldUpdatePosition extends StObject {
    
    var shouldUpdatePosition: js.UndefOr[Boolean] = js.undefined
  }
  object ShouldUpdatePosition {
    
    inline def apply(): ShouldUpdatePosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShouldUpdatePosition]
    }
    
    extension [Self <: ShouldUpdatePosition](x: Self) {
      
      inline def setShouldUpdatePosition(value: Boolean): Self = StObject.set(x, "shouldUpdatePosition", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdatePositionUndefined: Self = StObject.set(x, "shouldUpdatePosition", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Zoom extends StObject {
    
    var crop: Point
    
    var zoom: Double
  }
  object Zoom {
    
    inline def apply(crop: Point, zoom: Double): Zoom = {
      val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Zoom]
    }
    
    extension [Self <: Zoom](x: Self) {
      
      inline def setCrop(value: Point): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
}
