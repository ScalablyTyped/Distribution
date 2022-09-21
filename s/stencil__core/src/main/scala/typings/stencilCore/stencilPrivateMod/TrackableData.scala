package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Config
import typings.stencilCore.stencilPublicCompilerMod.TaskCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackableData extends StObject {
  
  var arguments: js.Array[String]
  
  var build: String
  
  var component_count: js.UndefOr[Double] = js.undefined
  
  var config: Config
  
  var cpu_model: String
  
  var duration_ms: Double
  
  var has_app_pwa_config: Boolean
  
  var os_name: String
  
  var os_version: String
  
  var packages: js.Array[String]
  
  var packages_no_versions: js.UndefOr[js.Array[String]] = js.undefined
  
  var rollup: String
  
  var stencil: String
  
  var system: String
  
  var system_major: js.UndefOr[String] = js.undefined
  
  var targets: js.Array[String]
  
  var task: TaskCommand
  
  var typescript: String
  
  var yarn: Boolean
}
object TrackableData {
  
  inline def apply(
    arguments: js.Array[String],
    build: String,
    config: Config,
    cpu_model: String,
    duration_ms: Double,
    has_app_pwa_config: Boolean,
    os_name: String,
    os_version: String,
    packages: js.Array[String],
    rollup: String,
    stencil: String,
    system: String,
    targets: js.Array[String],
    task: TaskCommand,
    typescript: String,
    yarn: Boolean
  ): TrackableData = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], cpu_model = cpu_model.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], has_app_pwa_config = has_app_pwa_config.asInstanceOf[js.Any], os_name = os_name.asInstanceOf[js.Any], os_version = os_version.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], rollup = rollup.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], yarn = yarn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackableData]
  }
  
  extension [Self <: TrackableData](x: Self) {
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setComponent_count(value: Double): Self = StObject.set(x, "component_count", value.asInstanceOf[js.Any])
    
    inline def setComponent_countUndefined: Self = StObject.set(x, "component_count", js.undefined)
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCpu_model(value: String): Self = StObject.set(x, "cpu_model", value.asInstanceOf[js.Any])
    
    inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    inline def setHas_app_pwa_config(value: Boolean): Self = StObject.set(x, "has_app_pwa_config", value.asInstanceOf[js.Any])
    
    inline def setOs_name(value: String): Self = StObject.set(x, "os_name", value.asInstanceOf[js.Any])
    
    inline def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setPackages_no_versions(value: js.Array[String]): Self = StObject.set(x, "packages_no_versions", value.asInstanceOf[js.Any])
    
    inline def setPackages_no_versionsUndefined: Self = StObject.set(x, "packages_no_versions", js.undefined)
    
    inline def setPackages_no_versionsVarargs(value: String*): Self = StObject.set(x, "packages_no_versions", js.Array(value*))
    
    inline def setRollup(value: String): Self = StObject.set(x, "rollup", value.asInstanceOf[js.Any])
    
    inline def setStencil(value: String): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystem_major(value: String): Self = StObject.set(x, "system_major", value.asInstanceOf[js.Any])
    
    inline def setSystem_majorUndefined: Self = StObject.set(x, "system_major", js.undefined)
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTask(value: TaskCommand): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTypescript(value: String): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    
    inline def setYarn(value: Boolean): Self = StObject.set(x, "yarn", value.asInstanceOf[js.Any])
  }
}
