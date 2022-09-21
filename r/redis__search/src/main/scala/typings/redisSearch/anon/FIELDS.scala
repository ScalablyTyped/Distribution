package typings.redisSearch.anon

import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FIELDS extends StObject {
  
  var FIELDS: js.UndefOr[PropertyName | js.Array[PropertyName]] = js.undefined
  
  var FRAGS: js.UndefOr[Double] = js.undefined
  
  var LEN: js.UndefOr[Double] = js.undefined
  
  var SEPARATOR: js.UndefOr[String] = js.undefined
}
object FIELDS {
  
  inline def apply(): FIELDS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FIELDS]
  }
  
  extension [Self <: FIELDS](x: Self) {
    
    inline def setFIELDS(value: PropertyName | js.Array[PropertyName]): Self = StObject.set(x, "FIELDS", value.asInstanceOf[js.Any])
    
    inline def setFIELDSUndefined: Self = StObject.set(x, "FIELDS", js.undefined)
    
    inline def setFIELDSVarargs(value: PropertyName*): Self = StObject.set(x, "FIELDS", js.Array(value*))
    
    inline def setFRAGS(value: Double): Self = StObject.set(x, "FRAGS", value.asInstanceOf[js.Any])
    
    inline def setFRAGSUndefined: Self = StObject.set(x, "FRAGS", js.undefined)
    
    inline def setLEN(value: Double): Self = StObject.set(x, "LEN", value.asInstanceOf[js.Any])
    
    inline def setLENUndefined: Self = StObject.set(x, "LEN", js.undefined)
    
    inline def setSEPARATOR(value: String): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
    
    inline def setSEPARATORUndefined: Self = StObject.set(x, "SEPARATOR", js.undefined)
  }
}
