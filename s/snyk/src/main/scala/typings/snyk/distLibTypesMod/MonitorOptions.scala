package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorOptions extends StObject {
  
  var allProjects: js.UndefOr[Boolean] = js.undefined
  
  var allSubProjects: js.UndefOr[Boolean] = js.undefined
  
  var `app-vulns`: js.UndefOr[Boolean] = js.undefined
  
  var docker: js.UndefOr[Boolean] = js.undefined
  
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var initScript: js.UndefOr[String] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var `max-depth`: js.UndefOr[Double] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  var `print-dep-paths`: js.UndefOr[Boolean] = js.undefined
  
  var `print-deps`: js.UndefOr[Boolean] = js.undefined
  
  var `project-name`: js.UndefOr[String] = js.undefined
  
  var pruneRepeatedSubdependencies: js.UndefOr[Boolean] = js.undefined
  
  var scanAllUnmanaged: js.UndefOr[Boolean] = js.undefined
  
  var yarnWorkspaces: js.UndefOr[Boolean] = js.undefined
}
object MonitorOptions {
  
  inline def apply(): MonitorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorOptions] (val x: Self) extends AnyVal {
    
    inline def setAllProjects(value: Boolean): Self = StObject.set(x, "allProjects", value.asInstanceOf[js.Any])
    
    inline def setAllProjectsUndefined: Self = StObject.set(x, "allProjects", js.undefined)
    
    inline def setAllSubProjects(value: Boolean): Self = StObject.set(x, "allSubProjects", value.asInstanceOf[js.Any])
    
    inline def setAllSubProjectsUndefined: Self = StObject.set(x, "allSubProjects", js.undefined)
    
    inline def `setApp-vulns`(value: Boolean): Self = StObject.set(x, "app-vulns", value.asInstanceOf[js.Any])
    
    inline def `setApp-vulnsUndefined`: Self = StObject.set(x, "app-vulns", js.undefined)
    
    inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    
    inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitScript(value: String): Self = StObject.set(x, "initScript", value.asInstanceOf[js.Any])
    
    inline def setInitScriptUndefined: Self = StObject.set(x, "initScript", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def `setMax-depth`(value: Double): Self = StObject.set(x, "max-depth", value.asInstanceOf[js.Any])
    
    inline def `setMax-depthUndefined`: Self = StObject.set(x, "max-depth", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def `setPrint-dep-paths`(value: Boolean): Self = StObject.set(x, "print-dep-paths", value.asInstanceOf[js.Any])
    
    inline def `setPrint-dep-pathsUndefined`: Self = StObject.set(x, "print-dep-paths", js.undefined)
    
    inline def `setPrint-deps`(value: Boolean): Self = StObject.set(x, "print-deps", value.asInstanceOf[js.Any])
    
    inline def `setPrint-depsUndefined`: Self = StObject.set(x, "print-deps", js.undefined)
    
    inline def `setProject-name`(value: String): Self = StObject.set(x, "project-name", value.asInstanceOf[js.Any])
    
    inline def `setProject-nameUndefined`: Self = StObject.set(x, "project-name", js.undefined)
    
    inline def setPruneRepeatedSubdependencies(value: Boolean): Self = StObject.set(x, "pruneRepeatedSubdependencies", value.asInstanceOf[js.Any])
    
    inline def setPruneRepeatedSubdependenciesUndefined: Self = StObject.set(x, "pruneRepeatedSubdependencies", js.undefined)
    
    inline def setScanAllUnmanaged(value: Boolean): Self = StObject.set(x, "scanAllUnmanaged", value.asInstanceOf[js.Any])
    
    inline def setScanAllUnmanagedUndefined: Self = StObject.set(x, "scanAllUnmanaged", js.undefined)
    
    inline def setYarnWorkspaces(value: Boolean): Self = StObject.set(x, "yarnWorkspaces", value.asInstanceOf[js.Any])
    
    inline def setYarnWorkspacesUndefined: Self = StObject.set(x, "yarnWorkspaces", js.undefined)
  }
}
