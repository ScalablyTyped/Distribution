package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImage extends StObject {
  
  var baseImage: js.UndefOr[Any] = js.undefined
  
  var baseImageRemediation: js.UndefOr[typings.snyk.distLibSnykTestLegacyMod.BaseImageRemediation] = js.undefined
  
  var binariesVulns: js.UndefOr[Any] = js.undefined
}
object BaseImage {
  
  inline def apply(): BaseImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseImage] (val x: Self) extends AnyVal {
    
    inline def setBaseImage(value: Any): Self = StObject.set(x, "baseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageRemediation(value: typings.snyk.distLibSnykTestLegacyMod.BaseImageRemediation): Self = StObject.set(x, "baseImageRemediation", value.asInstanceOf[js.Any])
    
    inline def setBaseImageRemediationUndefined: Self = StObject.set(x, "baseImageRemediation", js.undefined)
    
    inline def setBaseImageUndefined: Self = StObject.set(x, "baseImage", js.undefined)
    
    inline def setBinariesVulns(value: Any): Self = StObject.set(x, "binariesVulns", value.asInstanceOf[js.Any])
    
    inline def setBinariesVulnsUndefined: Self = StObject.set(x, "binariesVulns", js.undefined)
  }
}
