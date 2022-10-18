package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibSnykTestLegacyMod.SEVERITY
import typings.snyk.snykStrings.help
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<snyk.snyk/dist/lib/types.Options & snyk.snyk/dist/lib/types.TestOptions & snyk.snyk/dist/lib/types.PolicyOptions, 'org' | 'insecure' | 'debug' | 'experimental' | 'detectionDepth' | 'severityThreshold' | 'json' | 'sarif' | 'report' | 'target-reference' | 'var-file' | 'ignore-policy' | 'policy-path' | 'tags' | 'remote-repo-url' | 'target-name'> & {  json-file-output :string | undefined,   sarif-file-output :string | undefined,   v :boolean | undefined,   version :boolean | undefined,   h :boolean | undefined,   help :'help' | undefined,   q :boolean | undefined,   quiet :boolean | undefined,   path :string | undefined,   rules :string | undefined,   cloud-context :string | undefined,   project-tags :string | undefined,   project-environment :string | undefined,   project-lifecycle :string | undefined,   project-business-criticality :string | undefined} & snyk.snyk/dist/cli/commands/test/iac/local-execution/types.TerraformPlanFlags */
trait IaCTestFlags extends StObject {
  
  var `cloud-context`: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var detectionDepth: js.UndefOr[Double] = js.undefined
  
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  var h: js.UndefOr[Boolean] = js.undefined
  
  var help: js.UndefOr[typings.snyk.snykStrings.help] = js.undefined
  
  var `ignore-policy`: js.UndefOr[Boolean] = js.undefined
  
  var insecure: js.UndefOr[Boolean] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var `json-file-output`: js.UndefOr[String] = js.undefined
  
  @JSName("org")
  var org_ : js.UndefOr[String | Null] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var `policy-path`: js.UndefOr[String] = js.undefined
  
  var `project-business-criticality`: js.UndefOr[String] = js.undefined
  
  var `project-environment`: js.UndefOr[String] = js.undefined
  
  var `project-lifecycle`: js.UndefOr[String] = js.undefined
  
  var `project-tags`: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[Boolean] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var `remote-repo-url`: js.UndefOr[String] = js.undefined
  
  var report: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[String] = js.undefined
  
  var sarif: js.UndefOr[Boolean] = js.undefined
  
  var `sarif-file-output`: js.UndefOr[String] = js.undefined
  
  var scan: js.UndefOr[TerraformPlanScanMode] = js.undefined
  
  var severityThreshold: js.UndefOr[SEVERITY] = js.undefined
  
  var tags: js.UndefOr[String] = js.undefined
  
  var `target-name`: js.UndefOr[String] = js.undefined
  
  var `target-reference`: js.UndefOr[String] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
  
  var `var-file`: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
}
object IaCTestFlags {
  
  inline def apply(): IaCTestFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IaCTestFlags]
  }
  
  extension [Self <: IaCTestFlags](x: Self) {
    
    inline def `setCloud-context`(value: String): Self = StObject.set(x, "cloud-context", value.asInstanceOf[js.Any])
    
    inline def `setCloud-contextUndefined`: Self = StObject.set(x, "cloud-context", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDetectionDepth(value: Double): Self = StObject.set(x, "detectionDepth", value.asInstanceOf[js.Any])
    
    inline def setDetectionDepthUndefined: Self = StObject.set(x, "detectionDepth", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHelp(value: help): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def `setIgnore-policy`(value: Boolean): Self = StObject.set(x, "ignore-policy", value.asInstanceOf[js.Any])
    
    inline def `setIgnore-policyUndefined`: Self = StObject.set(x, "ignore-policy", js.undefined)
    
    inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
    
    inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def `setJson-file-output`(value: String): Self = StObject.set(x, "json-file-output", value.asInstanceOf[js.Any])
    
    inline def `setJson-file-outputUndefined`: Self = StObject.set(x, "json-file-output", js.undefined)
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Null: Self = StObject.set(x, "org", null)
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def `setPolicy-path`(value: String): Self = StObject.set(x, "policy-path", value.asInstanceOf[js.Any])
    
    inline def `setPolicy-pathUndefined`: Self = StObject.set(x, "policy-path", js.undefined)
    
    inline def `setProject-business-criticality`(value: String): Self = StObject.set(x, "project-business-criticality", value.asInstanceOf[js.Any])
    
    inline def `setProject-business-criticalityUndefined`: Self = StObject.set(x, "project-business-criticality", js.undefined)
    
    inline def `setProject-environment`(value: String): Self = StObject.set(x, "project-environment", value.asInstanceOf[js.Any])
    
    inline def `setProject-environmentUndefined`: Self = StObject.set(x, "project-environment", js.undefined)
    
    inline def `setProject-lifecycle`(value: String): Self = StObject.set(x, "project-lifecycle", value.asInstanceOf[js.Any])
    
    inline def `setProject-lifecycleUndefined`: Self = StObject.set(x, "project-lifecycle", js.undefined)
    
    inline def `setProject-tags`(value: String): Self = StObject.set(x, "project-tags", value.asInstanceOf[js.Any])
    
    inline def `setProject-tagsUndefined`: Self = StObject.set(x, "project-tags", js.undefined)
    
    inline def setQ(value: Boolean): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def `setRemote-repo-url`(value: String): Self = StObject.set(x, "remote-repo-url", value.asInstanceOf[js.Any])
    
    inline def `setRemote-repo-urlUndefined`: Self = StObject.set(x, "remote-repo-url", js.undefined)
    
    inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setSarif(value: Boolean): Self = StObject.set(x, "sarif", value.asInstanceOf[js.Any])
    
    inline def `setSarif-file-output`(value: String): Self = StObject.set(x, "sarif-file-output", value.asInstanceOf[js.Any])
    
    inline def `setSarif-file-outputUndefined`: Self = StObject.set(x, "sarif-file-output", js.undefined)
    
    inline def setSarifUndefined: Self = StObject.set(x, "sarif", js.undefined)
    
    inline def setScan(value: TerraformPlanScanMode): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
    
    inline def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
    
    inline def setSeverityThreshold(value: SEVERITY): Self = StObject.set(x, "severityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSeverityThresholdUndefined: Self = StObject.set(x, "severityThreshold", js.undefined)
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def `setTarget-name`(value: String): Self = StObject.set(x, "target-name", value.asInstanceOf[js.Any])
    
    inline def `setTarget-nameUndefined`: Self = StObject.set(x, "target-name", js.undefined)
    
    inline def `setTarget-reference`(value: String): Self = StObject.set(x, "target-reference", value.asInstanceOf[js.Any])
    
    inline def `setTarget-referenceUndefined`: Self = StObject.set(x, "target-reference", js.undefined)
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    inline def `setVar-file`(value: String): Self = StObject.set(x, "var-file", value.asInstanceOf[js.Any])
    
    inline def `setVar-fileUndefined`: Self = StObject.set(x, "var-file", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
