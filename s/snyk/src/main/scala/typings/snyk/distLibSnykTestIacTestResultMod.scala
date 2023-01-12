package typings.snyk

import typings.snyk.anon.Impact
import typings.snyk.anon.PartialRecordterraformclo
import typings.snyk.anon.ProjectType
import typings.snyk.distLibSnykTestLegacyMod.BasicResultData
import typings.snyk.distLibSnykTestLegacyMod.SEVERITY
import typings.snyk.distLibSnykTestLegacyMod.TestDepGraphMeta
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import typings.snyk.snykStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSnykTestIacTestResultMod {
  
  @JSImport("snyk/dist/lib/snyk-test/iac-test-result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapIacIssue(iacIssue: AnnotatedIacIssue): MappedAnnotatedIacIssue = ^.asInstanceOf[js.Dynamic].applyDynamic("mapIacIssue")(iacIssue.asInstanceOf[js.Any]).asInstanceOf[MappedAnnotatedIacIssue]
  
  inline def mapIacTestResult(iacTest: IacTestResponse): MappedIacTestResponse | IacTestError = ^.asInstanceOf[js.Dynamic].applyDynamic("mapIacTestResult")(iacTest.asInstanceOf[js.Any]).asInstanceOf[MappedIacTestResponse | IacTestError]
  
  trait AnnotatedIacIssue extends StObject {
    
    var cloudConfigPath: js.Array[String]
    
    var compliance: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[js.Array[String]] = js.undefined
    
    var iacDescription: Impact
    
    var id: String
    
    var impact: String
    
    var isGeneratedByCustomRule: js.UndefOr[Boolean] = js.undefined
    
    var isIgnored: Boolean
    
    var issue: String
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var msg: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[js.Array[String]] = js.undefined
    
    var policyEngineType: js.UndefOr[String] = js.undefined
    
    var publicId: String
    
    var references: js.Array[String]
    
    var remediation: js.UndefOr[PartialRecordterraformclo] = js.undefined
    
    var resolve: String
    
    var severity: SEVERITY | none
    
    var subType: String
    
    var title: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AnnotatedIacIssue {
    
    inline def apply(
      cloudConfigPath: js.Array[String],
      iacDescription: Impact,
      id: String,
      impact: String,
      isIgnored: Boolean,
      issue: String,
      msg: String,
      publicId: String,
      references: js.Array[String],
      resolve: String,
      severity: SEVERITY | none,
      subType: String,
      title: String
    ): AnnotatedIacIssue = {
      val __obj = js.Dynamic.literal(cloudConfigPath = cloudConfigPath.asInstanceOf[js.Any], iacDescription = iacDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotatedIacIssue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotatedIacIssue] (val x: Self) extends AnyVal {
      
      inline def setCloudConfigPath(value: js.Array[String]): Self = StObject.set(x, "cloudConfigPath", value.asInstanceOf[js.Any])
      
      inline def setCloudConfigPathVarargs(value: String*): Self = StObject.set(x, "cloudConfigPath", js.Array(value*))
      
      inline def setCompliance(value: js.Array[js.Array[String]]): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
      
      inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
      
      inline def setComplianceVarargs(value: js.Array[String]*): Self = StObject.set(x, "compliance", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setIacDescription(value: Impact): Self = StObject.set(x, "iacDescription", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImpact(value: String): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedByCustomRule(value: Boolean): Self = StObject.set(x, "isGeneratedByCustomRule", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedByCustomRuleUndefined: Self = StObject.set(x, "isGeneratedByCustomRule", js.undefined)
      
      inline def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPolicyEngineType(value: String): Self = StObject.set(x, "policyEngineType", value.asInstanceOf[js.Any])
      
      inline def setPolicyEngineTypeUndefined: Self = StObject.set(x, "policyEngineType", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.snyk.snykStrings.cloudConfigPath
    - typings.snyk.snykStrings.name
    - typings.snyk.snykStrings.from
  */
  trait FILTERED_OUT_FIELDS extends StObject
  object FILTERED_OUT_FIELDS {
    
    inline def cloudConfigPath: typings.snyk.snykStrings.cloudConfigPath = "cloudConfigPath".asInstanceOf[typings.snyk.snykStrings.cloudConfigPath]
    
    inline def from: typings.snyk.snykStrings.from = "from".asInstanceOf[typings.snyk.snykStrings.from]
    
    inline def name: typings.snyk.snykStrings.name = "name".asInstanceOf[typings.snyk.snykStrings.name]
  }
  
  trait IacTestError extends StObject {
    
    var error: String
    
    var ok: Boolean
    
    var path: String
  }
  object IacTestError {
    
    inline def apply(error: String, ok: Boolean, path: String): IacTestError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IacTestError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IacTestError] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait IacTestResponse
    extends StObject
       with BasicResultData {
    
    var displayTargetFile: String
    
    var foundProjectCount: Double
    
    var meta: TestDepGraphMeta
    
    var path: String
    
    var projectName: String
    
    var result: ProjectType
    
    var targetFile: String
  }
  object IacTestResponse {
    
    inline def apply(
      displayTargetFile: String,
      foundProjectCount: Double,
      isPrivate: Boolean,
      meta: TestDepGraphMeta,
      ok: Boolean,
      org_ : String,
      path: String,
      projectName: String,
      result: ProjectType,
      summary: String,
      targetFile: String
    ): IacTestResponse = {
      val __obj = js.Dynamic.literal(displayTargetFile = displayTargetFile.asInstanceOf[js.Any], foundProjectCount = foundProjectCount.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
      __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IacTestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IacTestResponse] (val x: Self) extends AnyVal {
      
      inline def setDisplayTargetFile(value: String): Self = StObject.set(x, "displayTargetFile", value.asInstanceOf[js.Any])
      
      inline def setFoundProjectCount(value: Double): Self = StObject.set(x, "foundProjectCount", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: TestDepGraphMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setResult(value: ProjectType): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<snyk.snyk/dist/lib/snyk-test/iac-test-result.AnnotatedIacIssue, snyk.snyk/dist/lib/snyk-test/iac-test-result.FILTERED_OUT_FIELDS> */
  trait MappedAnnotatedIacIssue extends StObject {
    
    var compliance: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var iacDescription: Impact
    
    var id: String
    
    var impact: String
    
    var isGeneratedByCustomRule: js.UndefOr[Boolean] = js.undefined
    
    var isIgnored: Boolean
    
    var issue: String
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var msg: String
    
    var path: js.Array[String]
    
    var policyEngineType: js.UndefOr[String] = js.undefined
    
    var publicId: String
    
    var references: js.Array[String]
    
    var remediation: js.UndefOr[PartialRecordterraformclo] = js.undefined
    
    var resolve: String
    
    var severity: SEVERITY | none
    
    var subType: String
    
    var title: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MappedAnnotatedIacIssue {
    
    inline def apply(
      iacDescription: Impact,
      id: String,
      impact: String,
      isIgnored: Boolean,
      issue: String,
      msg: String,
      path: js.Array[String],
      publicId: String,
      references: js.Array[String],
      resolve: String,
      severity: SEVERITY | none,
      subType: String,
      title: String
    ): MappedAnnotatedIacIssue = {
      val __obj = js.Dynamic.literal(iacDescription = iacDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappedAnnotatedIacIssue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappedAnnotatedIacIssue] (val x: Self) extends AnyVal {
      
      inline def setCompliance(value: js.Array[js.Array[String]]): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
      
      inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
      
      inline def setComplianceVarargs(value: js.Array[String]*): Self = StObject.set(x, "compliance", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setIacDescription(value: Impact): Self = StObject.set(x, "iacDescription", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImpact(value: String): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedByCustomRule(value: Boolean): Self = StObject.set(x, "isGeneratedByCustomRule", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedByCustomRuleUndefined: Self = StObject.set(x, "isGeneratedByCustomRule", js.undefined)
      
      inline def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPolicyEngineType(value: String): Self = StObject.set(x, "policyEngineType", value.asInstanceOf[js.Any])
      
      inline def setPolicyEngineTypeUndefined: Self = StObject.set(x, "policyEngineType", js.undefined)
      
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
  
  /* Inlined parent std.Omit<snyk.snyk/dist/lib/snyk-test/iac-test-result.IacTestResponse, 'result'> */
  @js.native
  trait MappedIacTestResponse extends StObject {
    
    var displayTargetFile: String = js.native
    
    var foundProjectCount: Double = js.native
    
    var isPrivate: Boolean = js.native
    
    var meta: TestDepGraphMeta = js.native
    
    var ok: Boolean = js.native
    
    @JSName("org")
    var org_ : String = js.native
    
    var packageManager: js.UndefOr[SupportedProjectTypes] = js.native
    
    var path: String = js.native
    
    var payloadType: js.UndefOr[String] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var projectName: String = js.native
    
    var projectType: String = js.native
    
    var severityThreshold: js.UndefOr[String] = js.native
    
    var summary: String = js.native
    
    var targetFile: String = js.native
  }
}
