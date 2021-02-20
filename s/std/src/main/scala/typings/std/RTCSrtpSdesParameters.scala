package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSrtpSdesParameters extends StObject {
  
  var cryptoSuite: js.UndefOr[java.lang.String] = js.native
  
  var keyParams: js.UndefOr[js.Array[RTCSrtpKeyParam]] = js.native
  
  var sessionParams: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var tag: js.UndefOr[Double] = js.native
}
object RTCSrtpSdesParameters {
  
  @scala.inline
  def apply(): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
  
  @scala.inline
  implicit class RTCSrtpSdesParametersMutableBuilder[Self <: RTCSrtpSdesParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoSuite(value: java.lang.String): Self = StObject.set(x, "cryptoSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoSuiteUndefined: Self = StObject.set(x, "cryptoSuite", js.undefined)
    
    @scala.inline
    def setKeyParams(value: js.Array[RTCSrtpKeyParam]): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
    
    @scala.inline
    def setKeyParamsVarargs(value: RTCSrtpKeyParam*): Self = StObject.set(x, "keyParams", js.Array(value :_*))
    
    @scala.inline
    def setSessionParams(value: js.Array[java.lang.String]): Self = StObject.set(x, "sessionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionParamsUndefined: Self = StObject.set(x, "sessionParams", js.undefined)
    
    @scala.inline
    def setSessionParamsVarargs(value: java.lang.String*): Self = StObject.set(x, "sessionParams", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
