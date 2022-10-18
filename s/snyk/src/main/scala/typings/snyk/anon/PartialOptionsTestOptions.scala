package typings.snyk.anon

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibSnykTestCommonMod.FailOn
import typings.snyk.distLibSnykTestLegacyMod.SEVERITY
import typings.snyk.distLibTypesMod.ShowVulnPaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<snyk.snyk/dist/lib/types.Options & snyk.snyk/dist/lib/types.TestOptions> */
trait PartialOptionsTestOptions extends StObject {
  
  var advertiseSubprojectsCount: js.UndefOr[Double] = js.undefined
  
  var allProjects: js.UndefOr[Boolean] = js.undefined
  
  var allSubProjects: js.UndefOr[Boolean] = js.undefined
  
  var `app-vulns`: js.UndefOr[Boolean] = js.undefined
  
  var code: js.UndefOr[Boolean] = js.undefined
  
  var command: js.UndefOr[String] = js.undefined
  
  var criticality: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var detectionDepth: js.UndefOr[Double] = js.undefined
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var docker: js.UndefOr[Boolean] = js.undefined
  
  var `dry-run`: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[String] = js.undefined
  
  var `exclude-base-image-vulns`: js.UndefOr[Boolean] = js.undefined
  
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  var `fail-fast`: js.UndefOr[Boolean] = js.undefined
  
  var failOn: js.UndefOr[FailOn] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var gradleSubProject: js.UndefOr[Boolean] = js.undefined
  
  var `group-issues`: js.UndefOr[Boolean] = js.undefined
  
  var iac: js.UndefOr[Boolean] = js.undefined
  
  var initScript: js.UndefOr[String] = js.undefined
  
  var insecure: js.UndefOr[Boolean] = js.undefined
  
  var isDockerUser: js.UndefOr[Boolean] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var mavenAggregateProject: js.UndefOr[Boolean] = js.undefined
  
  var `max-depth`: js.UndefOr[Double] = js.undefined
  
  var `no-markdown`: js.UndefOr[Boolean] = js.undefined
  
  @JSName("org")
  var org_ : js.UndefOr[String | Null] = js.undefined
  
  var packageManager: js.UndefOr[SupportedPackageManagers] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  var `print-dep-paths`: js.UndefOr[Boolean] = js.undefined
  
  var `print-deps`: js.UndefOr[Boolean] = js.undefined
  
  var `project-name`: js.UndefOr[String] = js.undefined
  
  var projectName: js.UndefOr[String] = js.undefined
  
  var projectNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var pruneRepeatedSubdependencies: js.UndefOr[Boolean] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var `remote-repo-url`: js.UndefOr[String] = js.undefined
  
  var report: js.UndefOr[Boolean] = js.undefined
  
  var sarif: js.UndefOr[Boolean] = js.undefined
  
  var scanAllUnmanaged: js.UndefOr[Boolean] = js.undefined
  
  var severityThreshold: js.UndefOr[SEVERITY] = js.undefined
  
  var `show-vulnerable-paths`: js.UndefOr[String] = js.undefined
  
  var showVulnPaths: js.UndefOr[ShowVulnPaths] = js.undefined
  
  var strictOutOfSync: js.UndefOr[Boolean] = js.undefined
  
  var tags: js.UndefOr[String] = js.undefined
  
  var `target-name`: js.UndefOr[String] = js.undefined
  
  var `target-reference`: js.UndefOr[String] = js.undefined
  
  var testDepGraphDockerEndpoint: js.UndefOr[String | Null] = js.undefined
  
  var traverseNodeModules: js.UndefOr[Boolean] = js.undefined
  
  var unmanaged: js.UndefOr[Boolean] = js.undefined
  
  var `var-file`: js.UndefOr[String] = js.undefined
  
  var vulnEndpoint: js.UndefOr[String] = js.undefined
  
  var yarnWorkspaces: js.UndefOr[Boolean] = js.undefined
}
object PartialOptionsTestOptions {
  
  inline def apply(): PartialOptionsTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsTestOptions]
  }
  
  extension [Self <: PartialOptionsTestOptions](x: Self) {
    
    inline def setAdvertiseSubprojectsCount(value: Double): Self = StObject.set(x, "advertiseSubprojectsCount", value.asInstanceOf[js.Any])
    
    inline def setAdvertiseSubprojectsCountUndefined: Self = StObject.set(x, "advertiseSubprojectsCount", js.undefined)
    
    inline def setAllProjects(value: Boolean): Self = StObject.set(x, "allProjects", value.asInstanceOf[js.Any])
    
    inline def setAllProjectsUndefined: Self = StObject.set(x, "allProjects", js.undefined)
    
    inline def setAllSubProjects(value: Boolean): Self = StObject.set(x, "allSubProjects", value.asInstanceOf[js.Any])
    
    inline def setAllSubProjectsUndefined: Self = StObject.set(x, "allSubProjects", js.undefined)
    
    inline def `setApp-vulns`(value: Boolean): Self = StObject.set(x, "app-vulns", value.asInstanceOf[js.Any])
    
    inline def `setApp-vulnsUndefined`: Self = StObject.set(x, "app-vulns", js.undefined)
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCriticality(value: String): Self = StObject.set(x, "criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "criticality", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDetectionDepth(value: Double): Self = StObject.set(x, "detectionDepth", value.asInstanceOf[js.Any])
    
    inline def setDetectionDepthUndefined: Self = StObject.set(x, "detectionDepth", js.undefined)
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    
    inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
    
    inline def `setDry-run`(value: Boolean): Self = StObject.set(x, "dry-run", value.asInstanceOf[js.Any])
    
    inline def `setDry-runUndefined`: Self = StObject.set(x, "dry-run", js.undefined)
    
    inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def `setExclude-base-image-vulns`(value: Boolean): Self = StObject.set(x, "exclude-base-image-vulns", value.asInstanceOf[js.Any])
    
    inline def `setExclude-base-image-vulnsUndefined`: Self = StObject.set(x, "exclude-base-image-vulns", js.undefined)
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def `setFail-fast`(value: Boolean): Self = StObject.set(x, "fail-fast", value.asInstanceOf[js.Any])
    
    inline def `setFail-fastUndefined`: Self = StObject.set(x, "fail-fast", js.undefined)
    
    inline def setFailOn(value: FailOn): Self = StObject.set(x, "failOn", value.asInstanceOf[js.Any])
    
    inline def setFailOnUndefined: Self = StObject.set(x, "failOn", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setGradleSubProject(value: Boolean): Self = StObject.set(x, "gradleSubProject", value.asInstanceOf[js.Any])
    
    inline def setGradleSubProjectUndefined: Self = StObject.set(x, "gradleSubProject", js.undefined)
    
    inline def `setGroup-issues`(value: Boolean): Self = StObject.set(x, "group-issues", value.asInstanceOf[js.Any])
    
    inline def `setGroup-issuesUndefined`: Self = StObject.set(x, "group-issues", js.undefined)
    
    inline def setIac(value: Boolean): Self = StObject.set(x, "iac", value.asInstanceOf[js.Any])
    
    inline def setIacUndefined: Self = StObject.set(x, "iac", js.undefined)
    
    inline def setInitScript(value: String): Self = StObject.set(x, "initScript", value.asInstanceOf[js.Any])
    
    inline def setInitScriptUndefined: Self = StObject.set(x, "initScript", js.undefined)
    
    inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
    
    inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
    
    inline def setIsDockerUser(value: Boolean): Self = StObject.set(x, "isDockerUser", value.asInstanceOf[js.Any])
    
    inline def setIsDockerUserUndefined: Self = StObject.set(x, "isDockerUser", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setMavenAggregateProject(value: Boolean): Self = StObject.set(x, "mavenAggregateProject", value.asInstanceOf[js.Any])
    
    inline def setMavenAggregateProjectUndefined: Self = StObject.set(x, "mavenAggregateProject", js.undefined)
    
    inline def `setMax-depth`(value: Double): Self = StObject.set(x, "max-depth", value.asInstanceOf[js.Any])
    
    inline def `setMax-depthUndefined`: Self = StObject.set(x, "max-depth", js.undefined)
    
    inline def `setNo-markdown`(value: Boolean): Self = StObject.set(x, "no-markdown", value.asInstanceOf[js.Any])
    
    inline def `setNo-markdownUndefined`: Self = StObject.set(x, "no-markdown", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Null: Self = StObject.set(x, "org", null)
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPackageManager(value: SupportedPackageManagers): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def `setPrint-dep-paths`(value: Boolean): Self = StObject.set(x, "print-dep-paths", value.asInstanceOf[js.Any])
    
    inline def `setPrint-dep-pathsUndefined`: Self = StObject.set(x, "print-dep-paths", js.undefined)
    
    inline def `setPrint-deps`(value: Boolean): Self = StObject.set(x, "print-deps", value.asInstanceOf[js.Any])
    
    inline def `setPrint-depsUndefined`: Self = StObject.set(x, "print-deps", js.undefined)
    
    inline def `setProject-name`(value: String): Self = StObject.set(x, "project-name", value.asInstanceOf[js.Any])
    
    inline def `setProject-nameUndefined`: Self = StObject.set(x, "project-name", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setProjectNames(value: js.Array[String]): Self = StObject.set(x, "projectNames", value.asInstanceOf[js.Any])
    
    inline def setProjectNamesUndefined: Self = StObject.set(x, "projectNames", js.undefined)
    
    inline def setProjectNamesVarargs(value: String*): Self = StObject.set(x, "projectNames", js.Array(value*))
    
    inline def setPruneRepeatedSubdependencies(value: Boolean): Self = StObject.set(x, "pruneRepeatedSubdependencies", value.asInstanceOf[js.Any])
    
    inline def setPruneRepeatedSubdependenciesUndefined: Self = StObject.set(x, "pruneRepeatedSubdependencies", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def `setRemote-repo-url`(value: String): Self = StObject.set(x, "remote-repo-url", value.asInstanceOf[js.Any])
    
    inline def `setRemote-repo-urlUndefined`: Self = StObject.set(x, "remote-repo-url", js.undefined)
    
    inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setSarif(value: Boolean): Self = StObject.set(x, "sarif", value.asInstanceOf[js.Any])
    
    inline def setSarifUndefined: Self = StObject.set(x, "sarif", js.undefined)
    
    inline def setScanAllUnmanaged(value: Boolean): Self = StObject.set(x, "scanAllUnmanaged", value.asInstanceOf[js.Any])
    
    inline def setScanAllUnmanagedUndefined: Self = StObject.set(x, "scanAllUnmanaged", js.undefined)
    
    inline def setSeverityThreshold(value: SEVERITY): Self = StObject.set(x, "severityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSeverityThresholdUndefined: Self = StObject.set(x, "severityThreshold", js.undefined)
    
    inline def `setShow-vulnerable-paths`(value: String): Self = StObject.set(x, "show-vulnerable-paths", value.asInstanceOf[js.Any])
    
    inline def `setShow-vulnerable-pathsUndefined`: Self = StObject.set(x, "show-vulnerable-paths", js.undefined)
    
    inline def setShowVulnPaths(value: ShowVulnPaths): Self = StObject.set(x, "showVulnPaths", value.asInstanceOf[js.Any])
    
    inline def setShowVulnPathsUndefined: Self = StObject.set(x, "showVulnPaths", js.undefined)
    
    inline def setStrictOutOfSync(value: Boolean): Self = StObject.set(x, "strictOutOfSync", value.asInstanceOf[js.Any])
    
    inline def setStrictOutOfSyncUndefined: Self = StObject.set(x, "strictOutOfSync", js.undefined)
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def `setTarget-name`(value: String): Self = StObject.set(x, "target-name", value.asInstanceOf[js.Any])
    
    inline def `setTarget-nameUndefined`: Self = StObject.set(x, "target-name", js.undefined)
    
    inline def `setTarget-reference`(value: String): Self = StObject.set(x, "target-reference", value.asInstanceOf[js.Any])
    
    inline def `setTarget-referenceUndefined`: Self = StObject.set(x, "target-reference", js.undefined)
    
    inline def setTestDepGraphDockerEndpoint(value: String): Self = StObject.set(x, "testDepGraphDockerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setTestDepGraphDockerEndpointNull: Self = StObject.set(x, "testDepGraphDockerEndpoint", null)
    
    inline def setTestDepGraphDockerEndpointUndefined: Self = StObject.set(x, "testDepGraphDockerEndpoint", js.undefined)
    
    inline def setTraverseNodeModules(value: Boolean): Self = StObject.set(x, "traverseNodeModules", value.asInstanceOf[js.Any])
    
    inline def setTraverseNodeModulesUndefined: Self = StObject.set(x, "traverseNodeModules", js.undefined)
    
    inline def setUnmanaged(value: Boolean): Self = StObject.set(x, "unmanaged", value.asInstanceOf[js.Any])
    
    inline def setUnmanagedUndefined: Self = StObject.set(x, "unmanaged", js.undefined)
    
    inline def `setVar-file`(value: String): Self = StObject.set(x, "var-file", value.asInstanceOf[js.Any])
    
    inline def `setVar-fileUndefined`: Self = StObject.set(x, "var-file", js.undefined)
    
    inline def setVulnEndpoint(value: String): Self = StObject.set(x, "vulnEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVulnEndpointUndefined: Self = StObject.set(x, "vulnEndpoint", js.undefined)
    
    inline def setYarnWorkspaces(value: Boolean): Self = StObject.set(x, "yarnWorkspaces", value.asInstanceOf[js.Any])
    
    inline def setYarnWorkspacesUndefined: Self = StObject.set(x, "yarnWorkspaces", js.undefined)
  }
}
