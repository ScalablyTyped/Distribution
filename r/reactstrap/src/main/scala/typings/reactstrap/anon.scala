package typings.reactstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hide extends StObject {
    
    var hide: Double = js.native
    
    var show: Double = js.native
  }
  object Hide {
    
    @scala.inline
    def apply(hide: Double, show: Double): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hide]
    }
    
    @scala.inline
    implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var offset: js.UndefOr[String | Double] = js.native
    
    var order: js.UndefOr[String | Double] = js.native
    
    var size: js.UndefOr[Boolean | Double | String] = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: String | Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: String | Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setSize(value: Boolean | Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
