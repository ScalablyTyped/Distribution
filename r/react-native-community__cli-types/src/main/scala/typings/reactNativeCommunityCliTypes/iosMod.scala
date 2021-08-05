package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.anon.Dependencyfile
import typings.reactNativeCommunityCliTypes.anon.Ios
import typings.reactNativeCommunityCliTypes.anon.Path
import typings.reactNativeCommunityCliTypes.anon.Platforms
import typings.reactNativeCommunityCliTypes.anon.Script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosMod {
  
  type IOSDependencyConfig = IOSProjectConfig
  
  type IOSDependencyParams = IOSProjectParams
  
  trait IOSNativeModulesConfig extends StObject {
    
    var dependencies: StringDictionary[Platforms]
    
    var project: Ios
    
    var reactNativePath: String
  }
  object IOSNativeModulesConfig {
    
    inline def apply(dependencies: StringDictionary[Platforms], project: Ios, reactNativePath: String): IOSNativeModulesConfig = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSNativeModulesConfig]
    }
    
    extension [Self <: IOSNativeModulesConfig](x: Self) {
      
      inline def setDependencies(value: StringDictionary[Platforms]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setProject(value: Ios): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setReactNativePath(value: String): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOSProjectConfig extends StObject {
    
    var folder: String
    
    var libraryFolder: String
    
    var pbxprojPath: String
    
    var plist: js.Array[js.Any]
    
    var podfile: String
    
    var podspecPath: String
    
    var projectName: String
    
    var projectPath: String
    
    var sharedLibraries: js.Array[js.Any]
    
    var sourceDir: String
  }
  object IOSProjectConfig {
    
    inline def apply(
      folder: String,
      libraryFolder: String,
      pbxprojPath: String,
      plist: js.Array[js.Any],
      podfile: String,
      podspecPath: String,
      projectName: String,
      projectPath: String,
      sharedLibraries: js.Array[js.Any],
      sourceDir: String
    ): IOSProjectConfig = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], libraryFolder = libraryFolder.asInstanceOf[js.Any], pbxprojPath = pbxprojPath.asInstanceOf[js.Any], plist = plist.asInstanceOf[js.Any], podfile = podfile.asInstanceOf[js.Any], podspecPath = podspecPath.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], sharedLibraries = sharedLibraries.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSProjectConfig]
    }
    
    extension [Self <: IOSProjectConfig](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setLibraryFolder(value: String): Self = StObject.set(x, "libraryFolder", value.asInstanceOf[js.Any])
      
      inline def setPbxprojPath(value: String): Self = StObject.set(x, "pbxprojPath", value.asInstanceOf[js.Any])
      
      inline def setPlist(value: js.Array[js.Any]): Self = StObject.set(x, "plist", value.asInstanceOf[js.Any])
      
      inline def setPlistVarargs(value: js.Any*): Self = StObject.set(x, "plist", js.Array(value :_*))
      
      inline def setPodfile(value: String): Self = StObject.set(x, "podfile", value.asInstanceOf[js.Any])
      
      inline def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectPath(value: String): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
      
      inline def setSharedLibraries(value: js.Array[js.Any]): Self = StObject.set(x, "sharedLibraries", value.asInstanceOf[js.Any])
      
      inline def setSharedLibrariesVarargs(value: js.Any*): Self = StObject.set(x, "sharedLibraries", js.Array(value :_*))
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOSProjectParams extends StObject {
    
    var libraryFolder: js.UndefOr[String] = js.undefined
    
    var plist: js.Array[js.Any]
    
    /**
      * @deprecated A podspec should always be at the root of a package and
      *             have the name of the package. This property will be
      *             removed in a future major version.
      *
      * @todo Log a warning when this is used.
      */
    var podspecPath: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    var scriptPhases: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var sharedLibraries: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IOSProjectParams {
    
    inline def apply(plist: js.Array[js.Any]): IOSProjectParams = {
      val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSProjectParams]
    }
    
    extension [Self <: IOSProjectParams](x: Self) {
      
      inline def setLibraryFolder(value: String): Self = StObject.set(x, "libraryFolder", value.asInstanceOf[js.Any])
      
      inline def setLibraryFolderUndefined: Self = StObject.set(x, "libraryFolder", js.undefined)
      
      inline def setPlist(value: js.Array[js.Any]): Self = StObject.set(x, "plist", value.asInstanceOf[js.Any])
      
      inline def setPlistVarargs(value: js.Any*): Self = StObject.set(x, "plist", js.Array(value :_*))
      
      inline def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
      
      inline def setPodspecPathUndefined: Self = StObject.set(x, "podspecPath", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setScriptPhases(value: js.Array[js.Any]): Self = StObject.set(x, "scriptPhases", value.asInstanceOf[js.Any])
      
      inline def setScriptPhasesUndefined: Self = StObject.set(x, "scriptPhases", js.undefined)
      
      inline def setScriptPhasesVarargs(value: js.Any*): Self = StObject.set(x, "scriptPhases", js.Array(value :_*))
      
      inline def setSharedLibraries(value: js.Array[String]): Self = StObject.set(x, "sharedLibraries", value.asInstanceOf[js.Any])
      
      inline def setSharedLibrariesUndefined: Self = StObject.set(x, "sharedLibraries", js.undefined)
      
      inline def setSharedLibrariesVarargs(value: String*): Self = StObject.set(x, "sharedLibraries", js.Array(value :_*))
    }
  }
  
  type IOSScriptPhase = (Script | Path) & Dependencyfile
}
