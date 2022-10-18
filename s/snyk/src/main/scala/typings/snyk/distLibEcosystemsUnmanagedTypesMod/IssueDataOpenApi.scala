package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import typings.snyk.anon.Vulnerable
import typings.snyk.distLibSnykTestCommonMod.SEVERITY
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueDataOpenApi extends StObject {
  
  var below: String
  
  var creation_time: js.UndefOr[String] = js.undefined
  
  var credit: js.UndefOr[js.Array[String]] = js.undefined
  
  var cvsSv3: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var fixed_in: js.Array[String]
  
  var from: js.UndefOr[js.Array[String]] = js.undefined
  
  var id: String
  
  var is_new: Boolean
  
  var legal_instructions: js.UndefOr[String] = js.undefined
  
  var module_name: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var package_manager: js.UndefOr[SupportedProjectTypes] = js.undefined
  
  var package_name: String
  
  var patches: js.Array[PatchOpenApi]
  
  var publication_time: js.UndefOr[String] = js.undefined
  
  var semver: Vulnerable
  
  var severity: SEVERITY
  
  var title: String
  
  var version: String
}
object IssueDataOpenApi {
  
  inline def apply(
    below: String,
    description: String,
    fixed_in: js.Array[String],
    id: String,
    is_new: Boolean,
    package_name: String,
    patches: js.Array[PatchOpenApi],
    semver: Vulnerable,
    severity: SEVERITY,
    title: String,
    version: String
  ): IssueDataOpenApi = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixed_in = fixed_in.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_new = is_new.asInstanceOf[js.Any], package_name = package_name.asInstanceOf[js.Any], patches = patches.asInstanceOf[js.Any], semver = semver.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueDataOpenApi]
  }
  
  extension [Self <: IssueDataOpenApi](x: Self) {
    
    inline def setBelow(value: String): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setCredit(value: js.Array[String]): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setCreditVarargs(value: String*): Self = StObject.set(x, "credit", js.Array(value*))
    
    inline def setCvsSv3(value: String): Self = StObject.set(x, "cvsSv3", value.asInstanceOf[js.Any])
    
    inline def setCvsSv3Undefined: Self = StObject.set(x, "cvsSv3", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFixed_in(value: js.Array[String]): Self = StObject.set(x, "fixed_in", value.asInstanceOf[js.Any])
    
    inline def setFixed_inVarargs(value: String*): Self = StObject.set(x, "fixed_in", js.Array(value*))
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_new(value: Boolean): Self = StObject.set(x, "is_new", value.asInstanceOf[js.Any])
    
    inline def setLegal_instructions(value: String): Self = StObject.set(x, "legal_instructions", value.asInstanceOf[js.Any])
    
    inline def setLegal_instructionsUndefined: Self = StObject.set(x, "legal_instructions", js.undefined)
    
    inline def setModule_name(value: String): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    
    inline def setModule_nameUndefined: Self = StObject.set(x, "module_name", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackage_manager(value: SupportedProjectTypes): Self = StObject.set(x, "package_manager", value.asInstanceOf[js.Any])
    
    inline def setPackage_managerUndefined: Self = StObject.set(x, "package_manager", js.undefined)
    
    inline def setPackage_name(value: String): Self = StObject.set(x, "package_name", value.asInstanceOf[js.Any])
    
    inline def setPatches(value: js.Array[PatchOpenApi]): Self = StObject.set(x, "patches", value.asInstanceOf[js.Any])
    
    inline def setPatchesVarargs(value: PatchOpenApi*): Self = StObject.set(x, "patches", js.Array(value*))
    
    inline def setPublication_time(value: String): Self = StObject.set(x, "publication_time", value.asInstanceOf[js.Any])
    
    inline def setPublication_timeUndefined: Self = StObject.set(x, "publication_time", js.undefined)
    
    inline def setSemver(value: Vulnerable): Self = StObject.set(x, "semver", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: SEVERITY): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
