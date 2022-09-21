package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initInitMod {
  
  @JSImport("@react-native-community/cli/build/commands/init/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasProjectName: js.Array[String], options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasProjectName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Options extends StObject {
    
    var directory: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var npm: js.UndefOr[Boolean] = js.undefined
    
    var skipInstall: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
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
}
