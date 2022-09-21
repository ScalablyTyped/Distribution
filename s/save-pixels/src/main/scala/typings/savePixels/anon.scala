package typings.savePixels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quality extends StObject {
    
    var quality: js.UndefOr[Double] = js.undefined
  }
  object Quality {
    
    inline def apply(): Quality = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quality]
    }
    
    extension [Self <: Quality](x: Self) {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
