package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.snykStrings.license
import typings.snyk.snykStrings.upstream
import typings.snyk.snykStrings.vuln
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnMetaData extends StObject {
  
  var description: String
  
  var id: String
  
  var info: String
  
  var isNew: Boolean
  
  var name: String
  
  var packageManager: SupportedPackageManagers | upstream
  
  var severity: SEVERITY
  
  var severityValue: Double
  
  var title: String
  
  var `type`: license | vuln
  
  var version: String
}
object VulnMetaData {
  
  inline def apply(
    description: String,
    id: String,
    info: String,
    isNew: Boolean,
    name: String,
    packageManager: SupportedPackageManagers | upstream,
    severity: SEVERITY,
    severityValue: Double,
    title: String,
    `type`: license | vuln,
    version: String
  ): VulnMetaData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], severityValue = severityValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VulnMetaData]
  }
  
  extension [Self <: VulnMetaData](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackageManager(value: SupportedPackageManagers | upstream): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: SEVERITY): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityValue(value: Double): Self = StObject.set(x, "severityValue", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: license | vuln): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
