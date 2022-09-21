package typings.prosemirrorDropcursor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Class extends StObject {
    
    var `class`: js.UndefOr[String | Null] = js.undefined
    
    var color: js.UndefOr[String | Null] = js.undefined
    
    var width: js.UndefOr[Double | Null] = js.undefined
  }
  object Class {
    
    inline def apply(): Class = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassNull: Self = StObject.set(x, "class", null)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
