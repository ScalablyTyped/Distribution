package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSrtpSdesParameters extends StObject {
  
  var cryptoSuite: js.UndefOr[java.lang.String] = js.undefined
  
  var keyParams: js.UndefOr[js.Array[RTCSrtpKeyParam]] = js.undefined
  
  var sessionParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var tag: js.UndefOr[Double] = js.undefined
}
object RTCSrtpSdesParameters {
  
  inline def apply(): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
  
  extension [Self <: RTCSrtpSdesParameters](x: Self) {
    
    inline def setCryptoSuite(value: java.lang.String): Self = StObject.set(x, "cryptoSuite", value.asInstanceOf[js.Any])
    
    inline def setCryptoSuiteUndefined: Self = StObject.set(x, "cryptoSuite", js.undefined)
    
    inline def setKeyParams(value: js.Array[RTCSrtpKeyParam]): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
    
    inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
    
    inline def setKeyParamsVarargs(value: RTCSrtpKeyParam*): Self = StObject.set(x, "keyParams", js.Array(value :_*))
    
    inline def setSessionParams(value: js.Array[java.lang.String]): Self = StObject.set(x, "sessionParams", value.asInstanceOf[js.Any])
    
    inline def setSessionParamsUndefined: Self = StObject.set(x, "sessionParams", js.undefined)
    
    inline def setSessionParamsVarargs(value: java.lang.String*): Self = StObject.set(x, "sessionParams", js.Array(value :_*))
    
    inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
