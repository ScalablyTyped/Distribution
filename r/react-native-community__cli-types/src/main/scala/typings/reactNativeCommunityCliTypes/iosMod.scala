package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.anon.Dependencyfile
import typings.reactNativeCommunityCliTypes.anon.Ios
import typings.reactNativeCommunityCliTypes.anon.Path
import typings.reactNativeCommunityCliTypes.anon.Platforms
import typings.reactNativeCommunityCliTypes.anon.Script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosMod {
  
  type IOSDependencyConfig = IOSProjectConfig
  
  type IOSDependencyParams = IOSProjectParams
  
  @js.native
  trait IOSNativeModulesConfig extends StObject {
    
    var dependencies: StringDictionary[Platforms] = js.native
    
    var project: Ios = js.native
    
    var reactNativePath: String = js.native
  }
  object IOSNativeModulesConfig {
    
    @scala.inline
    def apply(dependencies: StringDictionary[Platforms], project: Ios, reactNativePath: String): IOSNativeModulesConfig = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSNativeModulesConfig]
    }
    
    @scala.inline
    implicit class IOSNativeModulesConfigMutableBuilder[Self <: IOSNativeModulesConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: StringDictionary[Platforms]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: Ios): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactNativePath(value: String): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOSProjectConfig extends StObject {
    
    var folder: String = js.native
    
    var libraryFolder: String = js.native
    
    var pbxprojPath: String = js.native
    
    var plist: js.Array[_] = js.native
    
    var podfile: String = js.native
    
    var podspecPath: String = js.native
    
    var projectName: String = js.native
    
    var projectPath: String = js.native
    
    var sharedLibraries: js.Array[_] = js.native
    
    var sourceDir: String = js.native
  }
  object IOSProjectConfig {
    
    @scala.inline
    def apply(
      folder: String,
      libraryFolder: String,
      pbxprojPath: String,
      plist: js.Array[_],
      podfile: String,
      podspecPath: String,
      projectName: String,
      projectPath: String,
      sharedLibraries: js.Array[_],
      sourceDir: String
    ): IOSProjectConfig = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], libraryFolder = libraryFolder.asInstanceOf[js.Any], pbxprojPath = pbxprojPath.asInstanceOf[js.Any], plist = plist.asInstanceOf[js.Any], podfile = podfile.asInstanceOf[js.Any], podspecPath = podspecPath.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], sharedLibraries = sharedLibraries.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSProjectConfig]
    }
    
    @scala.inline
    implicit class IOSProjectConfigMutableBuilder[Self <: IOSProjectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibraryFolder(value: String): Self = StObject.set(x, "libraryFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbxprojPath(value: String): Self = StObject.set(x, "pbxprojPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlist(value: js.Array[_]): Self = StObject.set(x, "plist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlistVarargs(value: js.Any*): Self = StObject.set(x, "plist", js.Array(value :_*))
      
      @scala.inline
      def setPodfile(value: String): Self = StObject.set(x, "podfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectPath(value: String): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedLibraries(value: js.Array[_]): Self = StObject.set(x, "sharedLibraries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedLibrariesVarargs(value: js.Any*): Self = StObject.set(x, "sharedLibraries", js.Array(value :_*))
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOSProjectParams extends StObject {
    
    var libraryFolder: js.UndefOr[String] = js.native
    
    var plist: js.Array[_] = js.native
    
    /**
      * @deprecated A podspec should always be at the root of a package and
      *             have the name of the package. This property will be
      *             removed in a future major version.
      *
      * @todo Log a warning when this is used.
      */
    var podspecPath: js.UndefOr[String] = js.native
    
    var project: js.UndefOr[String] = js.native
    
    var scriptPhases: js.UndefOr[js.Array[_]] = js.native
    
    var sharedLibraries: js.UndefOr[js.Array[String]] = js.native
  }
  object IOSProjectParams {
    
    @scala.inline
    def apply(plist: js.Array[_]): IOSProjectParams = {
      val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSProjectParams]
    }
    
    @scala.inline
    implicit class IOSProjectParamsMutableBuilder[Self <: IOSProjectParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLibraryFolder(value: String): Self = StObject.set(x, "libraryFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibraryFolderUndefined: Self = StObject.set(x, "libraryFolder", js.undefined)
      
      @scala.inline
      def setPlist(value: js.Array[_]): Self = StObject.set(x, "plist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlistVarargs(value: js.Any*): Self = StObject.set(x, "plist", js.Array(value :_*))
      
      @scala.inline
      def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodspecPathUndefined: Self = StObject.set(x, "podspecPath", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setScriptPhases(value: js.Array[_]): Self = StObject.set(x, "scriptPhases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPhasesUndefined: Self = StObject.set(x, "scriptPhases", js.undefined)
      
      @scala.inline
      def setScriptPhasesVarargs(value: js.Any*): Self = StObject.set(x, "scriptPhases", js.Array(value :_*))
      
      @scala.inline
      def setSharedLibraries(value: js.Array[String]): Self = StObject.set(x, "sharedLibraries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedLibrariesUndefined: Self = StObject.set(x, "sharedLibraries", js.undefined)
      
      @scala.inline
      def setSharedLibrariesVarargs(value: String*): Self = StObject.set(x, "sharedLibraries", js.Array(value :_*))
    }
  }
  
  type IOSScriptPhase = (Script | Path) with Dependencyfile
}
