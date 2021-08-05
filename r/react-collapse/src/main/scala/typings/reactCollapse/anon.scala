package typings.reactCollapse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Collapse extends StObject {
    
    var collapse: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
  }
  object Collapse {
    
    inline def apply(): Collapse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Collapse]
    }
    
    extension [Self <: Collapse](x: Self) {
      
      inline def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    }
  }
}
