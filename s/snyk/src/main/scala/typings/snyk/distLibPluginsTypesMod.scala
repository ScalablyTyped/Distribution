package typings.snyk

import typings.snyk.anon.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsTypesMod {
  
  trait InspectResult extends StObject {
    
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    var plugin: Runtime
    
    var scannedProjects: js.UndefOr[Any] = js.undefined
  }
  object InspectResult {
    
    inline def apply(plugin: Runtime): InspectResult = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[InspectResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InspectResult] (val x: Self) extends AnyVal {
      
      inline def setPlugin(value: Runtime): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setScannedProjects(value: Any): Self = StObject.set(x, "scannedProjects", value.asInstanceOf[js.Any])
      
      inline def setScannedProjectsUndefined: Self = StObject.set(x, "scannedProjects", js.undefined)
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var allSubProjects: js.UndefOr[Boolean] = js.undefined
    
    var composerIsFine: js.UndefOr[Boolean] = js.undefined
    
    var composerPharIsFine: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var docker: js.UndefOr[Boolean] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var packageManager: js.UndefOr[String] = js.undefined
    
    var scanAllUnmanaged: js.UndefOr[Boolean] = js.undefined
    
    var strictOutOfSync: js.UndefOr[Boolean] = js.undefined
    
    var systemVersions: js.UndefOr[js.Object] = js.undefined
    
    var traverseNodeModules: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllSubProjects(value: Boolean): Self = StObject.set(x, "allSubProjects", value.asInstanceOf[js.Any])
      
      inline def setAllSubProjectsUndefined: Self = StObject.set(x, "allSubProjects", js.undefined)
      
      inline def setComposerIsFine(value: Boolean): Self = StObject.set(x, "composerIsFine", value.asInstanceOf[js.Any])
      
      inline def setComposerIsFineUndefined: Self = StObject.set(x, "composerIsFine", js.undefined)
      
      inline def setComposerPharIsFine(value: Boolean): Self = StObject.set(x, "composerPharIsFine", value.asInstanceOf[js.Any])
      
      inline def setComposerPharIsFineUndefined: Self = StObject.set(x, "composerPharIsFine", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
      
      inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setPackageManager(value: String): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
      
      inline def setScanAllUnmanaged(value: Boolean): Self = StObject.set(x, "scanAllUnmanaged", value.asInstanceOf[js.Any])
      
      inline def setScanAllUnmanagedUndefined: Self = StObject.set(x, "scanAllUnmanaged", js.undefined)
      
      inline def setStrictOutOfSync(value: Boolean): Self = StObject.set(x, "strictOutOfSync", value.asInstanceOf[js.Any])
      
      inline def setStrictOutOfSyncUndefined: Self = StObject.set(x, "strictOutOfSync", js.undefined)
      
      inline def setSystemVersions(value: js.Object): Self = StObject.set(x, "systemVersions", value.asInstanceOf[js.Any])
      
      inline def setSystemVersionsUndefined: Self = StObject.set(x, "systemVersions", js.undefined)
      
      inline def setTraverseNodeModules(value: Boolean): Self = StObject.set(x, "traverseNodeModules", value.asInstanceOf[js.Any])
      
      inline def setTraverseNodeModulesUndefined: Self = StObject.set(x, "traverseNodeModules", js.undefined)
    }
  }
  
  @js.native
  trait Plugin extends StObject {
    
    def inspect(root: String, targetFile: String): js.Promise[InspectResult] = js.native
    def inspect(root: String, targetFile: String, options: Options): js.Promise[InspectResult] = js.native
  }
}
