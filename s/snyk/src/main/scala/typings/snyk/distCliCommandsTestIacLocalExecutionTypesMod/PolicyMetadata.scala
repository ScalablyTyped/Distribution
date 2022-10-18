package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.anon.PartialRecordterraformclo
import typings.snyk.distLibSnykTestCommonMod.SEVERITY
import typings.snyk.snykStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyMetadata extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var docId: js.UndefOr[Double] = js.undefined
  
  var documentation: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var impact: String
  
  var isGeneratedByCustomRule: js.UndefOr[Boolean] = js.undefined
  
  var issue: String
  
  var msg: String
  
  var publicId: String
  
  var references: js.Array[String]
  
  var remediation: js.UndefOr[PartialRecordterraformclo] = js.undefined
  
  var resolve: String
  
  var severity: SEVERITY | none
  
  var subType: String
  
  var title: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PolicyMetadata {
  
  inline def apply(
    impact: String,
    issue: String,
    msg: String,
    publicId: String,
    references: js.Array[String],
    resolve: String,
    severity: SEVERITY | none,
    subType: String,
    title: String
  ): PolicyMetadata = {
    val __obj = js.Dynamic.literal(impact = impact.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyMetadata]
  }
  
  extension [Self <: PolicyMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocId(value: Double): Self = StObject.set(x, "docId", value.asInstanceOf[js.Any])
    
    inline def setDocIdUndefined: Self = StObject.set(x, "docId", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImpact(value: String): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setIsGeneratedByCustomRule(value: Boolean): Self = StObject.set(x, "isGeneratedByCustomRule", value.asInstanceOf[js.Any])
    
    inline def setIsGeneratedByCustomRuleUndefined: Self = StObject.set(x, "isGeneratedByCustomRule", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setRemediation(value: PartialRecordterraformclo): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: SEVERITY | none): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
