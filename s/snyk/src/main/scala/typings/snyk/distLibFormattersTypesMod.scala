package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distLibSnykTestLegacyMod.LegalInstruction
import typings.snyk.distLibSnykTestLegacyMod.SEVERITY
import typings.snyk.snykBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersTypesMod {
  
  trait BasicVulnInfo extends StObject {
    
    var fixedIn: js.Array[String]
    
    var isNew: Boolean
    
    var legalInstructions: js.UndefOr[js.Array[LegalInstruction]] = js.undefined
    
    var name: String
    
    var note: String | `false`
    
    var originalSeverity: js.UndefOr[SEVERITY] = js.undefined
    
    var paths: js.Array[js.Array[String]]
    
    var severity: SEVERITY
    
    var title: String
    
    var `type`: String
    
    var version: String
  }
  object BasicVulnInfo {
    
    inline def apply(
      fixedIn: js.Array[String],
      isNew: Boolean,
      name: String,
      note: String | `false`,
      paths: js.Array[js.Array[String]],
      severity: SEVERITY,
      title: String,
      `type`: String,
      version: String
    ): BasicVulnInfo = {
      val __obj = js.Dynamic.literal(fixedIn = fixedIn.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicVulnInfo]
    }
    
    extension [Self <: BasicVulnInfo](x: Self) {
      
      inline def setFixedIn(value: js.Array[String]): Self = StObject.set(x, "fixedIn", value.asInstanceOf[js.Any])
      
      inline def setFixedInVarargs(value: String*): Self = StObject.set(x, "fixedIn", js.Array(value*))
      
      inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
      
      inline def setLegalInstructions(value: js.Array[LegalInstruction]): Self = StObject.set(x, "legalInstructions", value.asInstanceOf[js.Any])
      
      inline def setLegalInstructionsUndefined: Self = StObject.set(x, "legalInstructions", js.undefined)
      
      inline def setLegalInstructionsVarargs(value: LegalInstruction*): Self = StObject.set(x, "legalInstructions", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNote(value: String | `false`): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setOriginalSeverity(value: SEVERITY): Self = StObject.set(x, "originalSeverity", value.asInstanceOf[js.Any])
      
      inline def setOriginalSeverityUndefined: Self = StObject.set(x, "originalSeverity", js.undefined)
      
      inline def setPaths(value: js.Array[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: js.Array[String]*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setSeverity(value: SEVERITY): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopLevelPackageUpgrade extends StObject {
    
    var name: String
    
    var version: String
  }
  object TopLevelPackageUpgrade {
    
    inline def apply(name: String, version: String): TopLevelPackageUpgrade = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelPackageUpgrade]
    }
    
    extension [Self <: TopLevelPackageUpgrade](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type UpgradesByAffectedPackage = StringDictionary[js.Array[TopLevelPackageUpgrade]]
}
