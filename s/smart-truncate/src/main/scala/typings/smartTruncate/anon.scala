package typings.smartTruncate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mark extends StObject {
    
    var mark: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
  }
  object Mark {
    
    inline def apply(): Mark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
      
      inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
