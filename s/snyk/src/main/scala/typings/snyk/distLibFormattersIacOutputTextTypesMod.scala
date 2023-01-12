package typings.snyk

import typings.snyk.anon.PartialRecordterraformclo
import typings.snyk.distLibIacConstantsMod.IacProjectType
import typings.snyk.distLibSnykTestLegacyMod.SEVERITY
import typings.snyk.distLibTypesMod.IacOutputMeta
import typings.snyk.snykStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextTypesMod {
  
  trait FormattedOutputResult extends StObject {
    
    var issue: Issue
    
    var projectType: IacProjectType | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify State.InputTypeEnum */ Any)
    
    var targetFile: String
  }
  object FormattedOutputResult {
    
    inline def apply(
      issue: Issue,
      projectType: IacProjectType | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify State.InputTypeEnum */ Any),
      targetFile: String
    ): FormattedOutputResult = {
      val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedOutputResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormattedOutputResult] (val x: Self) extends AnyVal {
      
      inline def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setProjectType(
        value: IacProjectType | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify State.InputTypeEnum */ Any)
      ): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
      
      inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ severity in snyk.snyk/dist/lib/snyk-test/legacy.SEVERITY ]:? std.Array<snyk.snyk/dist/lib/formatters/iac-output/text/types.FormattedOutputResult>}
    }}}
    */
  @js.native
  trait FormattedOutputResultsBySeverity extends StObject
  
  trait IaCTestFailure extends StObject {
    
    var failureReason: js.UndefOr[String] = js.undefined
    
    var filePath: String
  }
  object IaCTestFailure {
    
    inline def apply(filePath: String): IaCTestFailure = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IaCTestFailure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IaCTestFailure] (val x: Self) extends AnyVal {
      
      inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait IacTestCounts extends StObject {
    
    var contextSuppressedIssues: js.UndefOr[Double] = js.undefined
    
    var filesWithIssues: Double
    
    var filesWithoutIssues: Double
    
    var ignores: Double
    
    var issues: Double
    
    var issuesBySeverity: /* import warning: importer.ImportType#apply Failed type conversion: {[ severity in snyk.snyk/dist/lib/snyk-test/legacy.SEVERITY ]: number} */ js.Any
  }
  object IacTestCounts {
    
    inline def apply(
      filesWithIssues: Double,
      filesWithoutIssues: Double,
      ignores: Double,
      issues: Double,
      issuesBySeverity: /* import warning: importer.ImportType#apply Failed type conversion: {[ severity in snyk.snyk/dist/lib/snyk-test/legacy.SEVERITY ]: number} */ js.Any
    ): IacTestCounts = {
      val __obj = js.Dynamic.literal(filesWithIssues = filesWithIssues.asInstanceOf[js.Any], filesWithoutIssues = filesWithoutIssues.asInstanceOf[js.Any], ignores = ignores.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issuesBySeverity = issuesBySeverity.asInstanceOf[js.Any])
      __obj.asInstanceOf[IacTestCounts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IacTestCounts] (val x: Self) extends AnyVal {
      
      inline def setContextSuppressedIssues(value: Double): Self = StObject.set(x, "contextSuppressedIssues", value.asInstanceOf[js.Any])
      
      inline def setContextSuppressedIssuesUndefined: Self = StObject.set(x, "contextSuppressedIssues", js.undefined)
      
      inline def setFilesWithIssues(value: Double): Self = StObject.set(x, "filesWithIssues", value.asInstanceOf[js.Any])
      
      inline def setFilesWithoutIssues(value: Double): Self = StObject.set(x, "filesWithoutIssues", value.asInstanceOf[js.Any])
      
      inline def setIgnores(value: Double): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: Double): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesBySeverity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ severity in snyk.snyk/dist/lib/snyk-test/legacy.SEVERITY ]: number} */ js.Any
      ): Self = StObject.set(x, "issuesBySeverity", value.asInstanceOf[js.Any])
    }
  }
  
  trait IacTestData extends StObject {
    
    var counts: IacTestCounts
    
    var metadata: js.UndefOr[IacOutputMeta] = js.undefined
    
    var resultsBySeverity: FormattedOutputResultsBySeverity
  }
  object IacTestData {
    
    inline def apply(counts: IacTestCounts, resultsBySeverity: FormattedOutputResultsBySeverity): IacTestData = {
      val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], resultsBySeverity = resultsBySeverity.asInstanceOf[js.Any])
      __obj.asInstanceOf[IacTestData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IacTestData] (val x: Self) extends AnyVal {
      
      inline def setCounts(value: IacTestCounts): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IacOutputMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setResultsBySeverity(value: FormattedOutputResultsBySeverity): Self = StObject.set(x, "resultsBySeverity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<snyk.snyk/dist/lib/snyk-test/iac-test-result.AnnotatedIacIssue, 'id' | 'title' | 'severity' | 'issue' | 'impact' | 'resolve' | 'remediation' | 'lineNumber' | 'isGeneratedByCustomRule' | 'documentation' | 'cloudConfigPath'> */
  trait Issue extends StObject {
    
    var cloudConfigPath: js.Array[String]
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var impact: String
    
    var isGeneratedByCustomRule: js.UndefOr[Boolean] = js.undefined
    
    var issue: String
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var remediation: js.UndefOr[PartialRecordterraformclo] = js.undefined
    
    var resolve: String
    
    var severity: SEVERITY | none
    
    var title: String
  }
  object Issue {
    
    inline def apply(
      cloudConfigPath: js.Array[String],
      id: String,
      impact: String,
      issue: String,
      resolve: String,
      severity: SEVERITY | none,
      title: String
    ): Issue = {
      val __obj = js.Dynamic.literal(cloudConfigPath = cloudConfigPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
      
      inline def setCloudConfigPath(value: js.Array[String]): Self = StObject.set(x, "cloudConfigPath", value.asInstanceOf[js.Any])
      
      inline def setCloudConfigPathVarargs(value: String*): Self = StObject.set(x, "cloudConfigPath", js.Array(value*))
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImpact(value: String): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedByCustomRule(value: Boolean): Self = StObject.set(x, "isGeneratedByCustomRule", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedByCustomRuleUndefined: Self = StObject.set(x, "isGeneratedByCustomRule", js.undefined)
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setRemediation(value: PartialRecordterraformclo): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
      
      inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
      
      inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: SEVERITY | none): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
