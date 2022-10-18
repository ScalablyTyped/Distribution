package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibTypesMod.MonitorOptions
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsGetMultiPluginResultMod {
  
  @JSImport("snyk/dist/lib/plugins/get-multi-plugin-result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterOutProcessedWorkspaces(root: String, scannedProjects: js.Array[ScannedProjectCustom], allTargetFiles: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOutProcessedWorkspaces")(root.asInstanceOf[js.Any], scannedProjects.asInstanceOf[js.Any], allTargetFiles.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getMultiPluginResult(root: String, options: MonitorOptions & Options, targetFiles: js.Array[String]): js.Promise[MultiProjectResultCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiPluginResult")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiProjectResultCustom]]
  inline def getMultiPluginResult(root: String, options: TestOptions & Options, targetFiles: js.Array[String]): js.Promise[MultiProjectResultCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiPluginResult")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiProjectResultCustom]]
  
  trait FailedProjectScanError extends StObject {
    
    var errMessage: String
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var targetFile: js.UndefOr[String] = js.undefined
  }
  object FailedProjectScanError {
    
    inline def apply(errMessage: String): FailedProjectScanError = {
      val __obj = js.Dynamic.literal(errMessage = errMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailedProjectScanError]
    }
    
    extension [Self <: FailedProjectScanError](x: Self) {
      
      inline def setErrMessage(value: String): Self = StObject.set(x, "errMessage", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
      
      inline def setTargetFileUndefined: Self = StObject.set(x, "targetFile", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyPlugin.MultiProjectResult * / any */ trait MultiProjectResultCustom extends StObject {
    
    var failedResults: js.UndefOr[js.Array[FailedProjectScanError]] = js.undefined
    
    var scannedProjects: js.Array[ScannedProjectCustom]
  }
  object MultiProjectResultCustom {
    
    inline def apply(scannedProjects: js.Array[ScannedProjectCustom]): MultiProjectResultCustom = {
      val __obj = js.Dynamic.literal(scannedProjects = scannedProjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiProjectResultCustom]
    }
    
    extension [Self <: MultiProjectResultCustom](x: Self) {
      
      inline def setFailedResults(value: js.Array[FailedProjectScanError]): Self = StObject.set(x, "failedResults", value.asInstanceOf[js.Any])
      
      inline def setFailedResultsUndefined: Self = StObject.set(x, "failedResults", js.undefined)
      
      inline def setFailedResultsVarargs(value: FailedProjectScanError*): Self = StObject.set(x, "failedResults", js.Array(value*))
      
      inline def setScannedProjects(value: js.Array[ScannedProjectCustom]): Self = StObject.set(x, "scannedProjects", value.asInstanceOf[js.Any])
      
      inline def setScannedProjectsVarargs(value: ScannedProjectCustom*): Self = StObject.set(x, "scannedProjects", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyCommon.ScannedProject * / any */ trait ScannedProjectCustom extends StObject {
    
    var callGraph: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallGraph */ Any
      ] = js.undefined
    
    var packageManager: SupportedPackageManagers
    
    var plugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any
  }
  object ScannedProjectCustom {
    
    inline def apply(
      packageManager: SupportedPackageManagers,
      plugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any
    ): ScannedProjectCustom = {
      val __obj = js.Dynamic.literal(packageManager = packageManager.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScannedProjectCustom]
    }
    
    extension [Self <: ScannedProjectCustom](x: Self) {
      
      inline def setCallGraph(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallGraph */ Any
      ): Self = StObject.set(x, "callGraph", value.asInstanceOf[js.Any])
      
      inline def setCallGraphUndefined: Self = StObject.set(x, "callGraph", js.undefined)
      
      inline def setPackageManager(value: SupportedPackageManagers): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setPlugin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any
      ): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
