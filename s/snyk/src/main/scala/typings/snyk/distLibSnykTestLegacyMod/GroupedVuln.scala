package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.snykBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedVuln extends StObject {
  
  var fixedIn: js.Array[String]
  
  var isFixable: Boolean
  
  var isIgnored: Boolean
  
  var isNew: Boolean
  
  var legalInstructionsArray: js.UndefOr[js.Array[LegalInstruction]] = js.undefined
  
  var list: js.Array[AnnotatedIssue]
  
  var metadata: VulnMetaData
  
  var name: String
  
  var note: String | `false`
  
  var originalSeverity: js.UndefOr[SEVERITY] = js.undefined
  
  var severity: SEVERITY
  
  var title: String
  
  var version: String
}
object GroupedVuln {
  
  inline def apply(
    fixedIn: js.Array[String],
    isFixable: Boolean,
    isIgnored: Boolean,
    isNew: Boolean,
    list: js.Array[AnnotatedIssue],
    metadata: VulnMetaData,
    name: String,
    note: String | `false`,
    severity: SEVERITY,
    title: String,
    version: String
  ): GroupedVuln = {
    val __obj = js.Dynamic.literal(fixedIn = fixedIn.asInstanceOf[js.Any], isFixable = isFixable.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedVuln]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupedVuln] (val x: Self) extends AnyVal {
    
    inline def setFixedIn(value: js.Array[String]): Self = StObject.set(x, "fixedIn", value.asInstanceOf[js.Any])
    
    inline def setFixedInVarargs(value: String*): Self = StObject.set(x, "fixedIn", js.Array(value*))
    
    inline def setIsFixable(value: Boolean): Self = StObject.set(x, "isFixable", value.asInstanceOf[js.Any])
    
    inline def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
    
    inline def setLegalInstructionsArray(value: js.Array[LegalInstruction]): Self = StObject.set(x, "legalInstructionsArray", value.asInstanceOf[js.Any])
    
    inline def setLegalInstructionsArrayUndefined: Self = StObject.set(x, "legalInstructionsArray", js.undefined)
    
    inline def setLegalInstructionsArrayVarargs(value: LegalInstruction*): Self = StObject.set(x, "legalInstructionsArray", js.Array(value*))
    
    inline def setList(value: js.Array[AnnotatedIssue]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: AnnotatedIssue*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setMetadata(value: VulnMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String | `false`): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setOriginalSeverity(value: SEVERITY): Self = StObject.set(x, "originalSeverity", value.asInstanceOf[js.Any])
    
    inline def setOriginalSeverityUndefined: Self = StObject.set(x, "originalSeverity", js.undefined)
    
    inline def setSeverity(value: SEVERITY): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
