package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImageRemediation extends StObject {
  
  var advice: js.Array[BaseImageRemediationAdvice]
  
  var code: String
  
  var message: js.UndefOr[String] = js.undefined
}
object BaseImageRemediation {
  
  inline def apply(advice: js.Array[BaseImageRemediationAdvice], code: String): BaseImageRemediation = {
    val __obj = js.Dynamic.literal(advice = advice.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImageRemediation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseImageRemediation] (val x: Self) extends AnyVal {
    
    inline def setAdvice(value: js.Array[BaseImageRemediationAdvice]): Self = StObject.set(x, "advice", value.asInstanceOf[js.Any])
    
    inline def setAdviceVarargs(value: BaseImageRemediationAdvice*): Self = StObject.set(x, "advice", js.Array(value*))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
