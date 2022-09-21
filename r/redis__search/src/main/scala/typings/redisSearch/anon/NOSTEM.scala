package typings.redisSearch.anon

import typings.redisSearch.commandsMod.SchemaTextFieldPhonetics
import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOSTEM extends StObject {
  
  var NOSTEM: js.UndefOr[`true`] = js.undefined
  
  var PHONETIC: js.UndefOr[SchemaTextFieldPhonetics] = js.undefined
  
  var WEIGHT: js.UndefOr[Double] = js.undefined
  
  var WITHSUFFIXTRIE: js.UndefOr[Boolean] = js.undefined
}
object NOSTEM {
  
  inline def apply(): NOSTEM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NOSTEM]
  }
  
  extension [Self <: NOSTEM](x: Self) {
    
    inline def setNOSTEM(value: `true`): Self = StObject.set(x, "NOSTEM", value.asInstanceOf[js.Any])
    
    inline def setNOSTEMUndefined: Self = StObject.set(x, "NOSTEM", js.undefined)
    
    inline def setPHONETIC(value: SchemaTextFieldPhonetics): Self = StObject.set(x, "PHONETIC", value.asInstanceOf[js.Any])
    
    inline def setPHONETICUndefined: Self = StObject.set(x, "PHONETIC", js.undefined)
    
    inline def setWEIGHT(value: Double): Self = StObject.set(x, "WEIGHT", value.asInstanceOf[js.Any])
    
    inline def setWEIGHTUndefined: Self = StObject.set(x, "WEIGHT", js.undefined)
    
    inline def setWITHSUFFIXTRIE(value: Boolean): Self = StObject.set(x, "WITHSUFFIXTRIE", value.asInstanceOf[js.Any])
    
    inline def setWITHSUFFIXTRIEUndefined: Self = StObject.set(x, "WITHSUFFIXTRIE", js.undefined)
  }
}
