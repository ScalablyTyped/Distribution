package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.anon.PartialWindowsDependencyC
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependencyConfigMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/dependencyConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dependencyConfigWindows(folder: String): WindowsDependencyConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfigWindows")(folder.asInstanceOf[js.Any]).asInstanceOf[WindowsDependencyConfig | Null]
  inline def dependencyConfigWindows(folder: String, userConfig: PartialWindowsDependencyC): WindowsDependencyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencyConfigWindows")(folder.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[WindowsDependencyConfig | Null]
  
  trait NuGetPackageDependency extends StObject {
    
    var cppHeaders: js.Array[String]
    
    var cppPackageProviders: js.Array[String]
    
    var csNamespaces: js.Array[String]
    
    var csPackageProviders: js.Array[String]
    
    var packageName: String
    
    var packageVersion: String
  }
  object NuGetPackageDependency {
    
    inline def apply(
      cppHeaders: js.Array[String],
      cppPackageProviders: js.Array[String],
      csNamespaces: js.Array[String],
      csPackageProviders: js.Array[String],
      packageName: String,
      packageVersion: String
    ): NuGetPackageDependency = {
      val __obj = js.Dynamic.literal(cppHeaders = cppHeaders.asInstanceOf[js.Any], cppPackageProviders = cppPackageProviders.asInstanceOf[js.Any], csNamespaces = csNamespaces.asInstanceOf[js.Any], csPackageProviders = csPackageProviders.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NuGetPackageDependency]
    }
    
    extension [Self <: NuGetPackageDependency](x: Self) {
      
      inline def setCppHeaders(value: js.Array[String]): Self = StObject.set(x, "cppHeaders", value.asInstanceOf[js.Any])
      
      inline def setCppHeadersVarargs(value: String*): Self = StObject.set(x, "cppHeaders", js.Array(value :_*))
      
      inline def setCppPackageProviders(value: js.Array[String]): Self = StObject.set(x, "cppPackageProviders", value.asInstanceOf[js.Any])
      
      inline def setCppPackageProvidersVarargs(value: String*): Self = StObject.set(x, "cppPackageProviders", js.Array(value :_*))
      
      inline def setCsNamespaces(value: js.Array[String]): Self = StObject.set(x, "csNamespaces", value.asInstanceOf[js.Any])
      
      inline def setCsNamespacesVarargs(value: String*): Self = StObject.set(x, "csNamespaces", js.Array(value :_*))
      
      inline def setCsPackageProviders(value: js.Array[String]): Self = StObject.set(x, "csPackageProviders", value.asInstanceOf[js.Any])
      
      inline def setCsPackageProvidersVarargs(value: String*): Self = StObject.set(x, "csPackageProviders", js.Array(value :_*))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectDependency extends StObject {
    
    var cppHeaders: js.Array[String]
    
    var cppPackageProviders: js.Array[String]
    
    var csNamespaces: js.Array[String]
    
    var csPackageProviders: js.Array[String]
    
    var directDependency: Boolean
    
    var projectFile: String
    
    var projectGuid: String | Null
    
    var projectLang: cpp | cs | Null
    
    var projectName: String
  }
  object ProjectDependency {
    
    inline def apply(
      cppHeaders: js.Array[String],
      cppPackageProviders: js.Array[String],
      csNamespaces: js.Array[String],
      csPackageProviders: js.Array[String],
      directDependency: Boolean,
      projectFile: String,
      projectName: String
    ): ProjectDependency = {
      val __obj = js.Dynamic.literal(cppHeaders = cppHeaders.asInstanceOf[js.Any], cppPackageProviders = cppPackageProviders.asInstanceOf[js.Any], csNamespaces = csNamespaces.asInstanceOf[js.Any], csPackageProviders = csPackageProviders.asInstanceOf[js.Any], directDependency = directDependency.asInstanceOf[js.Any], projectFile = projectFile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectGuid = null, projectLang = null)
      __obj.asInstanceOf[ProjectDependency]
    }
    
    extension [Self <: ProjectDependency](x: Self) {
      
      inline def setCppHeaders(value: js.Array[String]): Self = StObject.set(x, "cppHeaders", value.asInstanceOf[js.Any])
      
      inline def setCppHeadersVarargs(value: String*): Self = StObject.set(x, "cppHeaders", js.Array(value :_*))
      
      inline def setCppPackageProviders(value: js.Array[String]): Self = StObject.set(x, "cppPackageProviders", value.asInstanceOf[js.Any])
      
      inline def setCppPackageProvidersVarargs(value: String*): Self = StObject.set(x, "cppPackageProviders", js.Array(value :_*))
      
      inline def setCsNamespaces(value: js.Array[String]): Self = StObject.set(x, "csNamespaces", value.asInstanceOf[js.Any])
      
      inline def setCsNamespacesVarargs(value: String*): Self = StObject.set(x, "csNamespaces", js.Array(value :_*))
      
      inline def setCsPackageProviders(value: js.Array[String]): Self = StObject.set(x, "csPackageProviders", value.asInstanceOf[js.Any])
      
      inline def setCsPackageProvidersVarargs(value: String*): Self = StObject.set(x, "csPackageProviders", js.Array(value :_*))
      
      inline def setDirectDependency(value: Boolean): Self = StObject.set(x, "directDependency", value.asInstanceOf[js.Any])
      
      inline def setProjectFile(value: String): Self = StObject.set(x, "projectFile", value.asInstanceOf[js.Any])
      
      inline def setProjectGuid(value: String): Self = StObject.set(x, "projectGuid", value.asInstanceOf[js.Any])
      
      inline def setProjectGuidNull: Self = StObject.set(x, "projectGuid", null)
      
      inline def setProjectLang(value: cpp | cs): Self = StObject.set(x, "projectLang", value.asInstanceOf[js.Any])
      
      inline def setProjectLangNull: Self = StObject.set(x, "projectLang", null)
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowsDependencyConfig extends StObject {
    
    var folder: String
    
    var nugetPackages: js.Array[NuGetPackageDependency]
    
    var projects: js.Array[ProjectDependency]
    
    var solutionFile: js.UndefOr[String | Null] = js.undefined
    
    var sourceDir: js.UndefOr[String] = js.undefined
  }
  object WindowsDependencyConfig {
    
    inline def apply(
      folder: String,
      nugetPackages: js.Array[NuGetPackageDependency],
      projects: js.Array[ProjectDependency]
    ): WindowsDependencyConfig = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], nugetPackages = nugetPackages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsDependencyConfig]
    }
    
    extension [Self <: WindowsDependencyConfig](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setNugetPackages(value: js.Array[NuGetPackageDependency]): Self = StObject.set(x, "nugetPackages", value.asInstanceOf[js.Any])
      
      inline def setNugetPackagesVarargs(value: NuGetPackageDependency*): Self = StObject.set(x, "nugetPackages", js.Array(value :_*))
      
      inline def setProjects(value: js.Array[ProjectDependency]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: ProjectDependency*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      inline def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      inline def setSolutionFileNull: Self = StObject.set(x, "solutionFile", null)
      
      inline def setSolutionFileUndefined: Self = StObject.set(x, "solutionFile", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
}
