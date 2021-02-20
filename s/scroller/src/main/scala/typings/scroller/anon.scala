package typings.scroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Left extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var zoom: Double = js.native
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, top: Double, zoom: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageX extends StObject {
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
  }
  object PageX {
    
    @scala.inline
    def apply(pageX: Double, pageY: Double): PageX = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageX]
    }
    
    @scala.inline
    implicit class PageXMutableBuilder[Self <: PageX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Top extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Top {
    
    @scala.inline
    def apply(left: Double, top: Double): Top = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Top]
    }
    
    @scala.inline
    implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
