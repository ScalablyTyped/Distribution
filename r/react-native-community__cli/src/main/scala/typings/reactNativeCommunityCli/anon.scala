package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Android extends StObject {
    
    var android: DependencyConfig
    
    var ios: DependencyConfig
  }
  object Android {
    
    inline def apply(android: DependencyConfig, ios: DependencyConfig): Android = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
      __obj.asInstanceOf[Android]
    }
    
    extension [Self <: Android](x: Self) {
      
      inline def setAndroid(value: DependencyConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: DependencyConfig): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    var assets: js.Array[scala.Nothing]
    
    var commands: js.Array[scala.Nothing]
    
    var platforms: Android
    
    var project: Ios
    
    var reactNativePath: String
    
    var root: String
  }
  object Assets {
    
    inline def apply(
      assets: js.Array[scala.Nothing],
      commands: js.Array[scala.Nothing],
      platforms: Android,
      project: Ios,
      reactNativePath: String,
      root: String
    ): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    extension [Self <: Assets](x: Self) {
      
      inline def setAssets(value: js.Array[scala.Nothing]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: scala.Nothing*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setCommands(value: js.Array[scala.Nothing]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: scala.Nothing*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setPlatforms(value: Android): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setProject(value: Ios): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setReactNativePath(value: String): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyConfig extends StObject {
    
    def dependencyConfig(): Null
    
    def projectConfig(): Null
  }
  object DependencyConfig {
    
    inline def apply(dependencyConfig: () => Null, projectConfig: () => Null): DependencyConfig = {
      val __obj = js.Dynamic.literal(dependencyConfig = js.Any.fromFunction0(dependencyConfig), projectConfig = js.Any.fromFunction0(projectConfig))
      __obj.asInstanceOf[DependencyConfig]
    }
    
    extension [Self <: DependencyConfig](x: Self) {
      
      inline def setDependencyConfig(value: () => Null): Self = StObject.set(x, "dependencyConfig", js.Any.fromFunction0(value))
      
      inline def setProjectConfig(value: () => Null): Self = StObject.set(x, "projectConfig", js.Any.fromFunction0(value))
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var name: String
  }
  object Description {
    
    inline def apply(description: String, name: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Directory extends StObject {
    
    var directory: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var npm: js.UndefOr[Boolean] = js.undefined
    
    var skipInstall: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Directory {
    
    inline def apply(): Directory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directory]
    }
    
    extension [Self <: Directory](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setNpm(value: Boolean): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      inline def setNpmUndefined: Self = StObject.set(x, "npm", js.undefined)
      
      inline def setSkipInstall(value: Boolean): Self = StObject.set(x, "skipInstall", value.asInstanceOf[js.Any])
      
      inline def setSkipInstallUndefined: Self = StObject.set(x, "skipInstall", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Ios extends StObject {
    
    var android: Null
    
    var ios: Null
  }
  object Ios {
    
    inline def apply(android: Null, ios: Null): Ios = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ios]
    }
    
    extension [Self <: Ios](x: Self) {
      
      inline def setAndroid(value: Null): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: Null): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    }
  }
}
