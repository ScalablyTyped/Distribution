package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var analysisUTCTimestamp: String
  
  var captchaResult: String
  
  var id: String
  
  var kind: String
  
  var lighthouseResult: LighthouseResult
  
  var loadingExperience: Experience
  
  var originLoadingExperience: Experience
  
  var version: Version
}
object Result {
  
  inline def apply(
    analysisUTCTimestamp: String,
    captchaResult: String,
    id: String,
    kind: String,
    lighthouseResult: LighthouseResult,
    loadingExperience: Experience,
    originLoadingExperience: Experience,
    version: Version
  ): Result = {
    val __obj = js.Dynamic.literal(analysisUTCTimestamp = analysisUTCTimestamp.asInstanceOf[js.Any], captchaResult = captchaResult.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lighthouseResult = lighthouseResult.asInstanceOf[js.Any], loadingExperience = loadingExperience.asInstanceOf[js.Any], originLoadingExperience = originLoadingExperience.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setAnalysisUTCTimestamp(value: String): Self = StObject.set(x, "analysisUTCTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLighthouseResult(value: LighthouseResult): Self = StObject.set(x, "lighthouseResult", value.asInstanceOf[js.Any])
    
    inline def setLoadingExperience(value: Experience): Self = StObject.set(x, "loadingExperience", value.asInstanceOf[js.Any])
    
    inline def setOriginLoadingExperience(value: Experience): Self = StObject.set(x, "originLoadingExperience", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
