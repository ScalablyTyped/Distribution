package typings.redisSearch.anon

import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CASESENSITIVE extends StObject {
  
  var CASESENSITIVE: js.UndefOr[`true`] = js.undefined
  
  var SEPARATOR: js.UndefOr[String] = js.undefined
  
  var WITHSUFFIXTRIE: js.UndefOr[Boolean] = js.undefined
}
object CASESENSITIVE {
  
  inline def apply(): CASESENSITIVE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CASESENSITIVE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CASESENSITIVE] (val x: Self) extends AnyVal {
    
    inline def setCASESENSITIVE(value: `true`): Self = StObject.set(x, "CASESENSITIVE", value.asInstanceOf[js.Any])
    
    inline def setCASESENSITIVEUndefined: Self = StObject.set(x, "CASESENSITIVE", js.undefined)
    
    inline def setSEPARATOR(value: String): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
    
    inline def setSEPARATORUndefined: Self = StObject.set(x, "SEPARATOR", js.undefined)
    
    inline def setWITHSUFFIXTRIE(value: Boolean): Self = StObject.set(x, "WITHSUFFIXTRIE", value.asInstanceOf[js.Any])
    
    inline def setWITHSUFFIXTRIEUndefined: Self = StObject.set(x, "WITHSUFFIXTRIE", js.undefined)
  }
}
