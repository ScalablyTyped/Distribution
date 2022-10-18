package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.GroupedVuln
import typings.snyk.distLibSnykTestLegacyMod.LegalInstruction
import typings.snyk.distLibSnykTestLegacyMod.RemediationChanges
import typings.snyk.distLibSnykTestLegacyMod.SEVERITY
import typings.snyk.distLibTypesMod.TestOptions
import typings.snyk.snykBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersRemediationBasedFormatIssuesMod {
  
  @JSImport("snyk/dist/lib/formatters/remediation-based-format-issues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatIssue(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIssue(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: String,
    originalSeverity: Unit,
    legalInstructions: js.Array[LegalInstruction]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any], originalSeverity.asInstanceOf[js.Any], legalInstructions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIssue(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: String,
    originalSeverity: SEVERITY
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any], originalSeverity.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIssue(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: String,
    originalSeverity: SEVERITY,
    legalInstructions: js.Array[LegalInstruction]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any], originalSeverity.asInstanceOf[js.Any], legalInstructions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatIssue_false(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: `false`
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIssue_false(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: `false`,
    originalSeverity: Unit,
    legalInstructions: js.Array[LegalInstruction]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any], originalSeverity.asInstanceOf[js.Any], legalInstructions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIssue_false(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: `false`,
    originalSeverity: SEVERITY
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any], originalSeverity.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIssue_false(
    id: String,
    title: String,
    severity: SEVERITY,
    isNew: Boolean,
    vulnerableModule: String,
    paths: js.Array[js.Array[String]],
    testOptions: TestOptions,
    note: `false`,
    originalSeverity: SEVERITY,
    legalInstructions: js.Array[LegalInstruction]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(id.asInstanceOf[js.Any], title.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], isNew.asInstanceOf[js.Any], vulnerableModule.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], testOptions.asInstanceOf[js.Any], note.asInstanceOf[js.Any], originalSeverity.asInstanceOf[js.Any], legalInstructions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatIssuesWithRemediation(vulns: js.Array[GroupedVuln], remediationInfo: RemediationChanges, options: TestOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssuesWithRemediation")(vulns.asInstanceOf[js.Any], remediationInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def printPath(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def printPath(path: js.Array[String], slice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printPath")(path.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[String]
}
