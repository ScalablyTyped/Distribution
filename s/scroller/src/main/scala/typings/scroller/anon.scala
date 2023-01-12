package typings.scroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
    
    var zoom: Double
  }
  object Left {
    
    inline def apply(left: Double, top: Double, zoom: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageX extends StObject {
    
    var pageX: Double
    
    var pageY: Double
  }
  object PageX {
    
    inline def apply(pageX: Double, pageY: Double): PageX = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageX] (val x: Self) extends AnyVal {
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Top extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Top {
    
    inline def apply(left: Double, top: Double): Top = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Top]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
