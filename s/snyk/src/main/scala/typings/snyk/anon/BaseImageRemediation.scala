package typings.snyk.anon

import typings.snyk.distLibSnykTestLegacyMod.TestDepGraphResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImageRemediation extends StObject {
  
  var baseImage: String
  
  var baseImageRemediation: typings.snyk.distLibSnykTestLegacyMod.BaseImageRemediation
  
  var binariesVulns: TestDepGraphResult
}
object BaseImageRemediation {
  
  inline def apply(
    baseImage: String,
    baseImageRemediation: typings.snyk.distLibSnykTestLegacyMod.BaseImageRemediation,
    binariesVulns: TestDepGraphResult
  ): BaseImageRemediation = {
    val __obj = js.Dynamic.literal(baseImage = baseImage.asInstanceOf[js.Any], baseImageRemediation = baseImageRemediation.asInstanceOf[js.Any], binariesVulns = binariesVulns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImageRemediation]
  }
  
  extension [Self <: BaseImageRemediation](x: Self) {
    
    inline def setBaseImage(value: String): Self = StObject.set(x, "baseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageRemediation(value: typings.snyk.distLibSnykTestLegacyMod.BaseImageRemediation): Self = StObject.set(x, "baseImageRemediation", value.asInstanceOf[js.Any])
    
    inline def setBinariesVulns(value: TestDepGraphResult): Self = StObject.set(x, "binariesVulns", value.asInstanceOf[js.Any])
  }
}
