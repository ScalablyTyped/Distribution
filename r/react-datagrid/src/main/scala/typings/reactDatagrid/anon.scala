package typings.reactDatagrid

import typings.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisabledStyle extends StObject {
    
    var disabledStyle: SVGAttributes[js.Object]
    
    var overStyle: SVGAttributes[js.Object]
    
    var style: SVGAttributes[js.Object]
  }
  object DisabledStyle {
    
    inline def apply(
      disabledStyle: SVGAttributes[js.Object],
      overStyle: SVGAttributes[js.Object],
      style: SVGAttributes[js.Object]
    ): DisabledStyle = {
      val __obj = js.Dynamic.literal(disabledStyle = disabledStyle.asInstanceOf[js.Any], overStyle = overStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisabledStyle]
    }
    
    extension [Self <: DisabledStyle](x: Self) {
      
      inline def setDisabledStyle(value: SVGAttributes[js.Object]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setOverStyle(value: SVGAttributes[js.Object]): Self = StObject.set(x, "overStyle", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: SVGAttributes[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageSize extends StObject {
    
    var pageSize: Double
    
    var skip: Double
  }
  object PageSize {
    
    inline def apply(pageSize: Double, skip: Double): PageSize = {
      val __obj = js.Dynamic.literal(pageSize = pageSize.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageSize]
    }
    
    extension [Self <: PageSize](x: Self) {
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
