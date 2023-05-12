package typings.rcComponentTour

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Placeholder extends StObject {
    
    var placeholder: Boolean
  }
  object Placeholder {
    
    inline def apply(placeholder: Boolean): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
      
      inline def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointAtCenter extends StObject {
    
    var pointAtCenter: Boolean
  }
  object PointAtCenter {
    
    inline def apply(pointAtCenter: Boolean): PointAtCenter = {
      val __obj = js.Dynamic.literal(pointAtCenter = pointAtCenter.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointAtCenter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointAtCenter] (val x: Self) extends AnyVal {
      
      inline def setPointAtCenter(value: Boolean): Self = StObject.set(x, "pointAtCenter", value.asInstanceOf[js.Any])
    }
  }
}
