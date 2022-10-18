package typings.reactNativeNavigation

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcCommandsDeprecationsMod {
  
  @JSImport("react-native-navigation/lib/dist/src/commands/Deprecations", "Deprecations")
  @js.native
  open class Deprecations () extends StObject {
    
    def checkForDeprecatedOptions(options: Record[String, Any]): Unit = js.native
    
    /* private */ var deprecateBottomTabsVisibility: Any = js.native
    
    /* private */ var deprecateInterpolationOptions: Any = js.native
    
    /* private */ var deprecateSearchBarOptions: Any = js.native
    
    /* private */ var deprecatedOptions: Any = js.native
    
    def onProcessDefaultOptions(_key: String, _parentOptions: Record[String, Any]): Unit = js.native
    
    def onProcessOptions(key: String, parentOptions: Record[String, Any], commandName: String): Unit = js.native
  }
}
