package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxPage extends StObject {
  
  var qHeight: js.UndefOr[Double] = js.undefined
  
  var qLeft: js.UndefOr[Double] = js.undefined
  
  var qTop: js.UndefOr[Double] = js.undefined
  
  var qWidth: js.UndefOr[Double] = js.undefined
}
object NxPage {
  
  inline def apply(): NxPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NxPage]
  }
  
  extension [Self <: NxPage](x: Self) {
    
    inline def setQHeight(value: Double): Self = StObject.set(x, "qHeight", value.asInstanceOf[js.Any])
    
    inline def setQHeightUndefined: Self = StObject.set(x, "qHeight", js.undefined)
    
    inline def setQLeft(value: Double): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    inline def setQLeftUndefined: Self = StObject.set(x, "qLeft", js.undefined)
    
    inline def setQTop(value: Double): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    inline def setQTopUndefined: Self = StObject.set(x, "qTop", js.undefined)
    
    inline def setQWidth(value: Double): Self = StObject.set(x, "qWidth", value.asInstanceOf[js.Any])
    
    inline def setQWidthUndefined: Self = StObject.set(x, "qWidth", js.undefined)
  }
}
