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
    
    @scala.inline
    def apply(): Latest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Latest]
    }
    
    @scala.inline
    implicit class LatestMutableBuilder[Self <: Latest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      @scala.inline
      def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
    
    @scala.inline
    def apply(): PartialWindowsDependencyC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowsDependencyC]
    }
    
    @scala.inline
    implicit class PartialWindowsDependencyCMutableBuilder[Self <: PartialWindowsDependencyC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setNugetPackages(value: js.Array[NuGetPackageDependency]): Self = StObject.set(x, "nugetPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNugetPackagesUndefined: Self = StObject.set(x, "nugetPackages", js.undefined)
      
      @scala.inline
      def setNugetPackagesVarargs(value: NuGetPackageDependency*): Self = StObject.set(x, "nugetPackages", js.Array(value :_*))
      
      @scala.inline
      def setProjects(value: js.Array[ProjectDependency]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      @scala.inline
      def setProjectsVarargs(value: ProjectDependency*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      @scala.inline
      def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionFileNull: Self = StObject.set(x, "solutionFile", null)
      
      @scala.inline
      def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
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
    
    @scala.inline
    def apply(): PartialWindowsProjectConf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowsProjectConf]
    }
    
    @scala.inline
    implicit class PartialWindowsProjectConfMutableBuilder[Self <: PartialWindowsProjectConf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  trait Requires extends StObject {
    
    var requires: js.UndefOr[js.Array[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Requires {
    
    @scala.inline
    def apply(): Requires = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Requires]
    }
    
    @scala.inline
    implicit class RequiresMutableBuilder[Self <: Requires] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      @scala.inline
      def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Verbose extends StObject {
    
    var verbose: Boolean
  }
  object Verbose {
    
    @scala.inline
    def apply(verbose: Boolean): Verbose = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verbose]
    }
    
    @scala.inline
    implicit class VerboseMutableBuilder[Self <: Verbose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
