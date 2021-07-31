package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSrtpKeyParam extends StObject {
  
  var keyMethod: js.UndefOr[java.lang.String] = js.undefined
  
  var keySalt: js.UndefOr[java.lang.String] = js.undefined
  
  var lifetime: js.UndefOr[java.lang.String] = js.undefined
  
  var mkiLength: js.UndefOr[Double] = js.undefined
  
  var mkiValue: js.UndefOr[Double] = js.undefined
}
object RTCSrtpKeyParam {
  
  @scala.inline
  def apply(): RTCSrtpKeyParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpKeyParam]
  }
  
  @scala.inline
  implicit class RTCSrtpKeyParamMutableBuilder[Self <: RTCSrtpKeyParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyMethod(value: java.lang.String): Self = StObject.set(x, "keyMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMethodUndefined: Self = StObject.set(x, "keyMethod", js.undefined)
    
    @scala.inline
    def setKeySalt(value: java.lang.String): Self = StObject.set(x, "keySalt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySaltUndefined: Self = StObject.set(x, "keySalt", js.undefined)
    
    @scala.inline
    def setLifetime(value: java.lang.String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    @scala.inline
    def setMkiLength(value: Double): Self = StObject.set(x, "mkiLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMkiLengthUndefined: Self = StObject.set(x, "mkiLength", js.undefined)
    
    @scala.inline
    def setMkiValue(value: Double): Self = StObject.set(x, "mkiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMkiValueUndefined: Self = StObject.set(x, "mkiValue", js.undefined)
  }
}
