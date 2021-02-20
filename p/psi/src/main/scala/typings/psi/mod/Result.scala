package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var analysisUTCTimestamp: String = js.native
  
  var captchaResult: String = js.native
  
  var id: String = js.native
  
  var kind: String = js.native
  
  var lighthouseResult: LighthouseResult = js.native
  
  var loadingExperience: Experience = js.native
  
  var originLoadingExperience: Experience = js.native
  
  var version: Version = js.native
}
object Result {
  
  @scala.inline
  def apply(
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
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisUTCTimestamp(value: String): Self = StObject.set(x, "analysisUTCTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighthouseResult(value: LighthouseResult): Self = StObject.set(x, "lighthouseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingExperience(value: Experience): Self = StObject.set(x, "loadingExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginLoadingExperience(value: Experience): Self = StObject.set(x, "originLoadingExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
