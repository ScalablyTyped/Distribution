package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidMod {
  
  trait AndroidDependencyConfig extends StObject {
    
    var androidMkPath: js.UndefOr[String | Null] = js.undefined
    
    var buildTypes: js.Array[String]
    
    var cmakeListsPath: js.UndefOr[String | Null] = js.undefined
    
    var componentDescriptors: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var dependencyConfiguration: js.UndefOr[String] = js.undefined
    
    var libraryName: js.UndefOr[String | Null] = js.undefined
    
    var packageImportPath: String
    
    var packageInstance: String
    
    var sourceDir: String
  }
  object AndroidDependencyConfig {
    
    inline def apply(
      buildTypes: js.Array[String],
      packageImportPath: String,
      packageInstance: String,
      sourceDir: String
    ): AndroidDependencyConfig = {
      val __obj = js.Dynamic.literal(buildTypes = buildTypes.asInstanceOf[js.Any], packageImportPath = packageImportPath.asInstanceOf[js.Any], packageInstance = packageInstance.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidDependencyConfig]
    }
    
    extension [Self <: AndroidDependencyConfig](x: Self) {
      
      inline def setAndroidMkPath(value: String): Self = StObject.set(x, "androidMkPath", value.asInstanceOf[js.Any])
      
      inline def setAndroidMkPathNull: Self = StObject.set(x, "androidMkPath", null)
      
      inline def setAndroidMkPathUndefined: Self = StObject.set(x, "androidMkPath", js.undefined)
      
      inline def setBuildTypes(value: js.Array[String]): Self = StObject.set(x, "buildTypes", value.asInstanceOf[js.Any])
      
      inline def setBuildTypesVarargs(value: String*): Self = StObject.set(x, "buildTypes", js.Array(value*))
      
      inline def setCmakeListsPath(value: String): Self = StObject.set(x, "cmakeListsPath", value.asInstanceOf[js.Any])
      
      inline def setCmakeListsPathNull: Self = StObject.set(x, "cmakeListsPath", null)
      
      inline def setCmakeListsPathUndefined: Self = StObject.set(x, "cmakeListsPath", js.undefined)
      
      inline def setComponentDescriptors(value: js.Array[String]): Self = StObject.set(x, "componentDescriptors", value.asInstanceOf[js.Any])
      
      inline def setComponentDescriptorsNull: Self = StObject.set(x, "componentDescriptors", null)
      
      inline def setComponentDescriptorsUndefined: Self = StObject.set(x, "componentDescriptors", js.undefined)
      
      inline def setComponentDescriptorsVarargs(value: String*): Self = StObject.set(x, "componentDescriptors", js.Array(value*))
      
      inline def setDependencyConfiguration(value: String): Self = StObject.set(x, "dependencyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setDependencyConfigurationUndefined: Self = StObject.set(x, "dependencyConfiguration", js.undefined)
      
      inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
      
      inline def setLibraryNameNull: Self = StObject.set(x, "libraryName", null)
      
      inline def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
      
      inline def setPackageImportPath(value: String): Self = StObject.set(x, "packageImportPath", value.asInstanceOf[js.Any])
      
      inline def setPackageInstance(value: String): Self = StObject.set(x, "packageInstance", value.asInstanceOf[js.Any])
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait AndroidDependencyParams extends StObject {
    
    var androidMkPath: js.UndefOr[String | Null] = js.undefined
    
    var buildTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var cmakeListsPath: js.UndefOr[String | Null] = js.undefined
    
    var componentDescriptors: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var dependencyConfiguration: js.UndefOr[String] = js.undefined
    
    var libraryName: js.UndefOr[String | Null] = js.undefined
    
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
      
      inline def setAndroidMkPath(value: String): Self = StObject.set(x, "androidMkPath", value.asInstanceOf[js.Any])
      
      inline def setAndroidMkPathNull: Self = StObject.set(x, "androidMkPath", null)
      
      inline def setAndroidMkPathUndefined: Self = StObject.set(x, "androidMkPath", js.undefined)
      
      inline def setBuildTypes(value: js.Array[String]): Self = StObject.set(x, "buildTypes", value.asInstanceOf[js.Any])
      
      inline def setBuildTypesUndefined: Self = StObject.set(x, "buildTypes", js.undefined)
      
      inline def setBuildTypesVarargs(value: String*): Self = StObject.set(x, "buildTypes", js.Array(value*))
      
      inline def setCmakeListsPath(value: String): Self = StObject.set(x, "cmakeListsPath", value.asInstanceOf[js.Any])
      
      inline def setCmakeListsPathNull: Self = StObject.set(x, "cmakeListsPath", null)
      
      inline def setCmakeListsPathUndefined: Self = StObject.set(x, "cmakeListsPath", js.undefined)
      
      inline def setComponentDescriptors(value: js.Array[String]): Self = StObject.set(x, "componentDescriptors", value.asInstanceOf[js.Any])
      
      inline def setComponentDescriptorsNull: Self = StObject.set(x, "componentDescriptors", null)
      
      inline def setComponentDescriptorsUndefined: Self = StObject.set(x, "componentDescriptors", js.undefined)
      
      inline def setComponentDescriptorsVarargs(value: String*): Self = StObject.set(x, "componentDescriptors", js.Array(value*))
      
      inline def setDependencyConfiguration(value: String): Self = StObject.set(x, "dependencyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setDependencyConfigurationUndefined: Self = StObject.set(x, "dependencyConfiguration", js.undefined)
      
      inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
      
      inline def setLibraryNameNull: Self = StObject.set(x, "libraryName", null)
      
      inline def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
      
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
    
    var dependencyConfiguration: js.UndefOr[String] = js.undefined
    
    var packageName: String
    
    var sourceDir: String
  }
  object AndroidProjectConfig {
    
    inline def apply(appName: String, packageName: String, sourceDir: String): AndroidProjectConfig = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidProjectConfig]
    }
    
    extension [Self <: AndroidProjectConfig](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setDependencyConfiguration(value: String): Self = StObject.set(x, "dependencyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setDependencyConfigurationUndefined: Self = StObject.set(x, "dependencyConfiguration", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait AndroidProjectParams extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var dependencyConfiguration: js.UndefOr[String] = js.undefined
    
    var manifestPath: js.UndefOr[String] = js.undefined
    
    var packageName: js.UndefOr[String] = js.undefined
    
    var sourceDir: js.UndefOr[String] = js.undefined
  }
  object AndroidProjectParams {
    
    inline def apply(): AndroidProjectParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidProjectParams]
    }
    
    extension [Self <: AndroidProjectParams](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setDependencyConfiguration(value: String): Self = StObject.set(x, "dependencyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setDependencyConfigurationUndefined: Self = StObject.set(x, "dependencyConfiguration", js.undefined)
      
      inline def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
      
      inline def setManifestPathUndefined: Self = StObject.set(x, "manifestPath", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
}
