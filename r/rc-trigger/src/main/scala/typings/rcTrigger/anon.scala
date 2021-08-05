package typings.rcTrigger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdjustX extends StObject {
    
    var adjustX: js.UndefOr[Boolean | Double] = js.undefined
    
    var adjustY: js.UndefOr[Boolean | Double] = js.undefined
  }
  object AdjustX {
    
    inline def apply(): AdjustX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustX]
    }
    
    extension [Self <: AdjustX](x: Self) {
      
      inline def setAdjustX(value: Boolean | Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      inline def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      inline def setAdjustY(value: Boolean | Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      inline def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
    }
  }
}
