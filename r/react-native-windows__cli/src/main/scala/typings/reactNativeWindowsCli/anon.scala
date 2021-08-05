package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.dependencyConfigMod.NuGetPackageDependency
import typings.reactNativeWindowsCli.dependencyConfigMod.ProjectDependency
import typings.reactNativeWindowsCli.projectConfigMod.Project
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Latest extends StObject {
    
    var latest: js.UndefOr[Boolean] = js.undefined
    
    var requires: js.UndefOr[js.Array[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Latest {
    
    inline def apply(): Latest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Latest]
    }
    
    extension [Self <: Latest](x: Self) {
      
      inline def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@react-native-windows/cli.@react-native-windows/cli/lib-commonjs/config/dependencyConfig.WindowsDependencyConfig> */
  trait PartialWindowsDependencyC extends StObject {
    
    var folder: js.UndefOr[String] = js.undefined
    
    var nugetPackages: js.UndefOr[js.Array[NuGetPackageDependency]] = js.undefined
    
    var projects: js.UndefOr[js.Array[ProjectDependency]] = js.undefined
    
    var solutionFile: js.UndefOr[String | Null] = js.undefined
    
    var sourceDir: js.UndefOr[String] = js.undefined
  }
  object PartialWindowsDependencyC {
    
    inline def apply(): PartialWindowsDependencyC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowsDependencyC]
    }
    
    extension [Self <: PartialWindowsDependencyC](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setNugetPackages(value: js.Array[NuGetPackageDependency]): Self = StObject.set(x, "nugetPackages", value.asInstanceOf[js.Any])
      
      inline def setNugetPackagesUndefined: Self = StObject.set(x, "nugetPackages", js.undefined)
      
      inline def setNugetPackagesVarargs(value: NuGetPackageDependency*): Self = StObject.set(x, "nugetPackages", js.Array(value :_*))
      
      inline def setProjects(value: js.Array[ProjectDependency]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      inline def setProjectsVarargs(value: ProjectDependency*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      inline def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      inline def setSolutionFileNull: Self = StObject.set(x, "solutionFile", null)
      
      inline def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@react-native-windows/cli.@react-native-windows/cli/lib-commonjs/config/projectConfig.WindowsProjectConfig> */
  trait PartialWindowsProjectConf extends StObject {
    
    var folder: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[Project] = js.undefined
    
    var solutionFile: js.UndefOr[String] = js.undefined
    
    var sourceDir: js.UndefOr[String] = js.undefined
  }
  object PartialWindowsProjectConf {
    
    inline def apply(): PartialWindowsProjectConf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowsProjectConf]
    }
    
    extension [Self <: PartialWindowsProjectConf](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      inline def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  trait Requires extends StObject {
    
    var requires: js.UndefOr[js.Array[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Requires {
    
    inline def apply(): Requires = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Requires]
    }
    
    extension [Self <: Requires](x: Self) {
      
      inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Verbose extends StObject {
    
    var verbose: Boolean
  }
  object Verbose {
    
    inline def apply(verbose: Boolean): Verbose = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verbose]
    }
    
    extension [Self <: Verbose](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
