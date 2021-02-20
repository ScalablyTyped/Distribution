package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidMod {
  
  @js.native
  trait AndroidDependencyConfig extends StObject {
    
    var folder: String = js.native
    
    var manifestPath: String = js.native
    
    var packageImportPath: String = js.native
    
    var packageInstance: String = js.native
    
    var packageName: String = js.native
    
    var sourceDir: String = js.native
  }
  object AndroidDependencyConfig {
    
    @scala.inline
    def apply(
      folder: String,
      manifestPath: String,
      packageImportPath: String,
      packageInstance: String,
      packageName: String,
      sourceDir: String
    ): AndroidDependencyConfig = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], manifestPath = manifestPath.asInstanceOf[js.Any], packageImportPath = packageImportPath.asInstanceOf[js.Any], packageInstance = packageInstance.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidDependencyConfig]
    }
    
    @scala.inline
    implicit class AndroidDependencyConfigMutableBuilder[Self <: AndroidDependencyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageImportPath(value: String): Self = StObject.set(x, "packageImportPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageInstance(value: String): Self = StObject.set(x, "packageInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidDependencyConfig> */
  @js.native
  trait AndroidDependencyParams extends StObject {
    
    var folder: js.UndefOr[String] = js.native
    
    var manifestPath: js.UndefOr[String] = js.native
    
    var packageImportPath: js.UndefOr[String] = js.native
    
    var packageInstance: js.UndefOr[String] = js.native
    
    var packageName: js.UndefOr[String] = js.native
    
    var sourceDir: js.UndefOr[String] = js.native
  }
  object AndroidDependencyParams {
    
    @scala.inline
    def apply(): AndroidDependencyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidDependencyParams]
    }
    
    @scala.inline
    implicit class AndroidDependencyParamsMutableBuilder[Self <: AndroidDependencyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestPathUndefined: Self = StObject.set(x, "manifestPath", js.undefined)
      
      @scala.inline
      def setPackageImportPath(value: String): Self = StObject.set(x, "packageImportPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageImportPathUndefined: Self = StObject.set(x, "packageImportPath", js.undefined)
      
      @scala.inline
      def setPackageInstance(value: String): Self = StObject.set(x, "packageInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageInstanceUndefined: Self = StObject.set(x, "packageInstance", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  @js.native
  trait AndroidProjectConfig extends StObject {
    
    var appName: String = js.native
    
    var assetsPath: String = js.native
    
    var buildGradlePath: String = js.native
    
    var folder: String = js.native
    
    var isFlat: Boolean = js.native
    
    var mainFilePath: String = js.native
    
    var manifestPath: String = js.native
    
    var packageFolder: String = js.native
    
    var packageName: String = js.native
    
    var settingsGradlePath: String = js.native
    
    var sourceDir: String = js.native
    
    var stringsPath: String = js.native
  }
  object AndroidProjectConfig {
    
    @scala.inline
    def apply(
      appName: String,
      assetsPath: String,
      buildGradlePath: String,
      folder: String,
      isFlat: Boolean,
      mainFilePath: String,
      manifestPath: String,
      packageFolder: String,
      packageName: String,
      settingsGradlePath: String,
      sourceDir: String,
      stringsPath: String
    ): AndroidProjectConfig = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], assetsPath = assetsPath.asInstanceOf[js.Any], buildGradlePath = buildGradlePath.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], isFlat = isFlat.asInstanceOf[js.Any], mainFilePath = mainFilePath.asInstanceOf[js.Any], manifestPath = manifestPath.asInstanceOf[js.Any], packageFolder = packageFolder.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], settingsGradlePath = settingsGradlePath.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any], stringsPath = stringsPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidProjectConfig]
    }
    
    @scala.inline
    implicit class AndroidProjectConfigMutableBuilder[Self <: AndroidProjectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildGradlePath(value: String): Self = StObject.set(x, "buildGradlePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFlat(value: Boolean): Self = StObject.set(x, "isFlat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFilePath(value: String): Self = StObject.set(x, "mainFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageFolder(value: String): Self = StObject.set(x, "packageFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsGradlePath(value: String): Self = StObject.set(x, "settingsGradlePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsPath(value: String): Self = StObject.set(x, "stringsPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectConfig> */
  @js.native
  trait AndroidProjectParams extends StObject {
    
    var appName: js.UndefOr[String] = js.native
    
    var assetsPath: js.UndefOr[String] = js.native
    
    var buildGradlePath: js.UndefOr[String] = js.native
    
    var folder: js.UndefOr[String] = js.native
    
    var isFlat: js.UndefOr[Boolean] = js.native
    
    var mainFilePath: js.UndefOr[String] = js.native
    
    var manifestPath: js.UndefOr[String] = js.native
    
    var packageFolder: js.UndefOr[String] = js.native
    
    var packageName: js.UndefOr[String] = js.native
    
    var settingsGradlePath: js.UndefOr[String] = js.native
    
    var sourceDir: js.UndefOr[String] = js.native
    
    var stringsPath: js.UndefOr[String] = js.native
  }
  object AndroidProjectParams {
    
    @scala.inline
    def apply(): AndroidProjectParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidProjectParams]
    }
    
    @scala.inline
    implicit class AndroidProjectParamsMutableBuilder[Self <: AndroidProjectParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      @scala.inline
      def setBuildGradlePath(value: String): Self = StObject.set(x, "buildGradlePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildGradlePathUndefined: Self = StObject.set(x, "buildGradlePath", js.undefined)
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setIsFlat(value: Boolean): Self = StObject.set(x, "isFlat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFlatUndefined: Self = StObject.set(x, "isFlat", js.undefined)
      
      @scala.inline
      def setMainFilePath(value: String): Self = StObject.set(x, "mainFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFilePathUndefined: Self = StObject.set(x, "mainFilePath", js.undefined)
      
      @scala.inline
      def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestPathUndefined: Self = StObject.set(x, "manifestPath", js.undefined)
      
      @scala.inline
      def setPackageFolder(value: String): Self = StObject.set(x, "packageFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageFolderUndefined: Self = StObject.set(x, "packageFolder", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      @scala.inline
      def setSettingsGradlePath(value: String): Self = StObject.set(x, "settingsGradlePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsGradlePathUndefined: Self = StObject.set(x, "settingsGradlePath", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
      
      @scala.inline
      def setStringsPath(value: String): Self = StObject.set(x, "stringsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsPathUndefined: Self = StObject.set(x, "stringsPath", js.undefined)
    }
  }
}
