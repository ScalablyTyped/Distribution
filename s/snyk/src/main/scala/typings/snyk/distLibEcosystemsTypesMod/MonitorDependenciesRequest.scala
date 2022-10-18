package typings.snyk.distLibEcosystemsTypesMod

import typings.snyk.distLibTypesMod.ProjectAttributes
import typings.snyk.distLibTypesMod.Tag
import typings.snyk.snykStrings.cli
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorDependenciesRequest extends StObject {
  
  var attributes: js.UndefOr[ProjectAttributes] = js.undefined
  
  var method: js.UndefOr[cli] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  /**
    * If provided, overrides the default project name (usually equivalent to the root package).
    * @deprecated Must not be set by new code! Prefer to set the "scanResult.name" within your plugin!
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  var scanResult: ScanResult
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object MonitorDependenciesRequest {
  
  inline def apply(scanResult: ScanResult): MonitorDependenciesRequest = {
    val __obj = js.Dynamic.literal(scanResult = scanResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorDependenciesRequest]
  }
  
  extension [Self <: MonitorDependenciesRequest](x: Self) {
    
    inline def setAttributes(value: ProjectAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setMethod(value: cli): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setScanResult(value: ScanResult): Self = StObject.set(x, "scanResult", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
