package typings.reactAlert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Margin extends StObject {
    
    var margin: String
  }
  object Margin {
    
    inline def apply(margin: String): Margin = {
      val __obj = js.Dynamic.literal(margin = margin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    }
  }
}
