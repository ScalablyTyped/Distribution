package typings.snyk.distLibTypesMod

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.snykStrings.cli
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorMeta extends StObject {
  
  var isDocker: Boolean
  
  var method: cli
  
  var packageManager: SupportedPackageManagers
  
  var `policy-path`: String
  
  var `project-name`: String
  
  var prune: Boolean
  
  var `remote-repo-url`: js.UndefOr[String] = js.undefined
  
  var targetReference: js.UndefOr[String] = js.undefined
}
object MonitorMeta {
  
  inline def apply(
    isDocker: Boolean,
    packageManager: SupportedPackageManagers,
    `policy-path`: String,
    `project-name`: String,
    prune: Boolean
  ): MonitorMeta = {
    val __obj = js.Dynamic.literal(isDocker = isDocker.asInstanceOf[js.Any], method = "cli", packageManager = packageManager.asInstanceOf[js.Any], prune = prune.asInstanceOf[js.Any])
    __obj.updateDynamic("policy-path")(`policy-path`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-name")(`project-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorMeta]
  }
  
  extension [Self <: MonitorMeta](x: Self) {
    
    inline def setIsDocker(value: Boolean): Self = StObject.set(x, "isDocker", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: cli): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPackageManager(value: SupportedPackageManagers): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def `setPolicy-path`(value: String): Self = StObject.set(x, "policy-path", value.asInstanceOf[js.Any])
    
    inline def `setProject-name`(value: String): Self = StObject.set(x, "project-name", value.asInstanceOf[js.Any])
    
    inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    inline def `setRemote-repo-url`(value: String): Self = StObject.set(x, "remote-repo-url", value.asInstanceOf[js.Any])
    
    inline def `setRemote-repo-urlUndefined`: Self = StObject.set(x, "remote-repo-url", js.undefined)
    
    inline def setTargetReference(value: String): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
  }
}
