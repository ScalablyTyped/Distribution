package typings.reactDatagrid

import typings.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DisabledStyle extends StObject {
    
    var disabledStyle: SVGAttributes[js.Object] = js.native
    
    var overStyle: SVGAttributes[js.Object] = js.native
    
    var style: SVGAttributes[js.Object] = js.native
  }
  object DisabledStyle {
    
    @scala.inline
    def apply(
      disabledStyle: SVGAttributes[js.Object],
      overStyle: SVGAttributes[js.Object],
      style: SVGAttributes[js.Object]
    ): DisabledStyle = {
      val __obj = js.Dynamic.literal(disabledStyle = disabledStyle.asInstanceOf[js.Any], overStyle = overStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisabledStyle]
    }
    
    @scala.inline
    implicit class DisabledStyleMutableBuilder[Self <: DisabledStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledStyle(value: SVGAttributes[js.Object]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverStyle(value: SVGAttributes[js.Object]): Self = StObject.set(x, "overStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: SVGAttributes[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageSize extends StObject {
    
    var pageSize: Double = js.native
    
    var skip: Double = js.native
  }
  object PageSize {
    
    @scala.inline
    def apply(pageSize: Double, skip: Double): PageSize = {
      val __obj = js.Dynamic.literal(pageSize = pageSize.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageSize]
    }
    
    @scala.inline
    implicit class PageSizeMutableBuilder[Self <: PageSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
