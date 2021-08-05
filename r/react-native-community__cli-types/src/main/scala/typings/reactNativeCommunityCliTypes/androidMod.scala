package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidMod {
  
  trait AndroidDependencyConfig extends StObject {
    
    var folder: String
    
    var manifestPath: String
    
    var packageImportPath: String
    
    var packageInstance: String
    
    var packageName: String
    
    var sourceDir: String
  }
  object AndroidDependencyConfig {
    
    inline def apply(
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
    
    extension [Self <: AndroidDependencyConfig](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      inline def setPackageImportPath(value: String): Self = StObject.set(x, "packageImportPath", value.asInstanceOf[js.Any])
      
      inline def setPackageInstance(value: String): Self = StObject.set(x, "packageInstance", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidDependencyConfig> */
  trait AndroidDependencyParams extends StObject {
    
    var folder: js.UndefOr[String] = js.undefined
    
    var manifestPath: js.UndefOr[String] = js.undefined
    
    var packageImportPath: js.UndefOr[String] = js.undefined
    
    var packageInstance: js.UndefOr[String] = js.undefined
    
    var packageName: js.UndefOr[String] = js.undefined
    
    var sourceDir: js.UndefOr[String] = js.undefined
  }
  object AndroidDependencyParams {
    
    inline def apply(): AndroidDependencyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidDependencyParams]
    }
    
    extension [Self <: AndroidDependencyParams](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      inline def setManifestPathUndefined: Self = StObject.set(x, "manifestPath", js.undefined)
      
      inline def setPackageImportPath(value: String): Self = StObject.set(x, "packageImportPath", value.asInstanceOf[js.Any])
      
      inline def setPackageImportPathUndefined: Self = StObject.set(x, "packageImportPath", js.undefined)
      
      inline def setPackageInstance(value: String): Self = StObject.set(x, "packageInstance", value.asInstanceOf[js.Any])
      
      inline def setPackageInstanceUndefined: Self = StObject.set(x, "packageInstance", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  trait AndroidProjectConfig extends StObject {
    
    var appName: String
    
    var assetsPath: String
    
    var buildGradlePath: String
    
    var folder: String
    
    var isFlat: Boolean
    
    var mainFilePath: String
    
    var manifestPath: String
    
    var packageFolder: String
    
    var packageName: String
    
    var settingsGradlePath: String
    
    var sourceDir: String
    
    var stringsPath: String
  }
  object AndroidProjectConfig {
    
    inline def apply(
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
    
    extension [Self <: AndroidProjectConfig](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      inline def setBuildGradlePath(value: String): Self = StObject.set(x, "buildGradlePath", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setIsFlat(value: Boolean): Self = StObject.set(x, "isFlat", value.asInstanceOf[js.Any])
      
      inline def setMainFilePath(value: String): Self = StObject.set(x, "mainFilePath", value.asInstanceOf[js.Any])
      
      inline def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      inline def setPackageFolder(value: String): Self = StObject.set(x, "packageFolder", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setSettingsGradlePath(value: String): Self = StObject.set(x, "settingsGradlePath", value.asInstanceOf[js.Any])
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setStringsPath(value: String): Self = StObject.set(x, "stringsPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectConfig> */
  trait AndroidProjectParams extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var assetsPath: js.UndefOr[String] = js.undefined
    
    var buildGradlePath: js.UndefOr[String] = js.undefined
    
    var folder: js.UndefOr[String] = js.undefined
    
    var isFlat: js.UndefOr[Boolean] = js.undefined
    
    var mainFilePath: js.UndefOr[String] = js.undefined
    
    var manifestPath: js.UndefOr[String] = js.undefined
    
    var packageFolder: js.UndefOr[String] = js.undefined
    
    var packageName: js.UndefOr[String] = js.undefined
    
    var settingsGradlePath: js.UndefOr[String] = js.undefined
    
    var sourceDir: js.UndefOr[String] = js.undefined
    
    var stringsPath: js.UndefOr[String] = js.undefined
  }
  object AndroidProjectParams {
    
    inline def apply(): AndroidProjectParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidProjectParams]
    }
    
    extension [Self <: AndroidProjectParams](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAssetsPath(value: String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      inline def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      inline def setBuildGradlePath(value: String): Self = StObject.set(x, "buildGradlePath", value.asInstanceOf[js.Any])
      
      inline def setBuildGradlePathUndefined: Self = StObject.set(x, "buildGradlePath", js.undefined)
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setIsFlat(value: Boolean): Self = StObject.set(x, "isFlat", value.asInstanceOf[js.Any])
      
      inline def setIsFlatUndefined: Self = StObject.set(x, "isFlat", js.undefined)
      
      inline def setMainFilePath(value: String): Self = StObject.set(x, "mainFilePath", value.asInstanceOf[js.Any])
      
      inline def setMainFilePathUndefined: Self = StObject.set(x, "mainFilePath", js.undefined)
      
      inline def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      inline def setManifestPathUndefined: Self = StObject.set(x, "manifestPath", js.undefined)
      
      inline def setPackageFolder(value: String): Self = StObject.set(x, "packageFolder", value.asInstanceOf[js.Any])
      
      inline def setPackageFolderUndefined: Self = StObject.set(x, "packageFolder", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      inline def setSettingsGradlePath(value: String): Self = StObject.set(x, "settingsGradlePath", value.asInstanceOf[js.Any])
      
      inline def setSettingsGradlePathUndefined: Self = StObject.set(x, "settingsGradlePath", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
      
      inline def setStringsPath(value: String): Self = StObject.set(x, "stringsPath", value.asInstanceOf[js.Any])
      
      inline def setStringsPathUndefined: Self = StObject.set(x, "stringsPath", js.undefined)
    }
  }
}
