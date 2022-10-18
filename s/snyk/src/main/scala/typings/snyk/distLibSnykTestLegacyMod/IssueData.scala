package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.anon.VulnerableByDistro
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueData extends StObject {
  
  var below: String
  
  var description: String
  
  var fixedIn: js.Array[String]
  
  var from: js.UndefOr[js.Array[String]] = js.undefined
  
  var id: String
  
  var isNew: Boolean
  
  var legalInstructions: js.UndefOr[String] = js.undefined
  
  var moduleName: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var packageManager: js.UndefOr[SupportedProjectTypes] = js.undefined
  
  var packageName: String
  
  var patches: js.Array[Patch]
  
  var semver: VulnerableByDistro
  
  var severity: SEVERITY
  
  var title: String
  
  var version: String
}
object IssueData {
  
  inline def apply(
    below: String,
    description: String,
    fixedIn: js.Array[String],
    id: String,
    isNew: Boolean,
    packageName: String,
    patches: js.Array[Patch],
    semver: VulnerableByDistro,
    severity: SEVERITY,
    title: String,
    version: String
  ): IssueData = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixedIn = fixedIn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], patches = patches.asInstanceOf[js.Any], semver = semver.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueData]
  }
  
  extension [Self <: IssueData](x: Self) {
    
    inline def setBelow(value: String): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFixedIn(value: js.Array[String]): Self = StObject.set(x, "fixedIn", value.asInstanceOf[js.Any])
    
    inline def setFixedInVarargs(value: String*): Self = StObject.set(x, "fixedIn", js.Array(value*))
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
    
    inline def setLegalInstructions(value: String): Self = StObject.set(x, "legalInstructions", value.asInstanceOf[js.Any])
    
    inline def setLegalInstructionsUndefined: Self = StObject.set(x, "legalInstructions", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageManager(value: SupportedProjectTypes): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPatches(value: js.Array[Patch]): Self = StObject.set(x, "patches", value.asInstanceOf[js.Any])
    
    inline def setPatchesVarargs(value: Patch*): Self = StObject.set(x, "patches", js.Array(value*))
    
    inline def setSemver(value: VulnerableByDistro): Self = StObject.set(x, "semver", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: SEVERITY): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
