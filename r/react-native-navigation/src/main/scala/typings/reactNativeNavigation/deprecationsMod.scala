package typings.reactNativeNavigation

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationsMod {
  
  @JSImport("react-native-navigation/lib/dist/commands/Deprecations", "Deprecations")
  @js.native
  class Deprecations () extends StObject {
    
    def checkForDeprecatedOptions(options: Record[String, _]): Unit = js.native
    
    var deprecateBottomTabsVisibility: js.Any = js.native
    
    var deprecateInterpolationOptions: js.Any = js.native
    
    var deprecateSearchBarOptions: js.Any = js.native
    
    var deprecatedOptions: js.Any = js.native
    
    def onProcessDefaultOptions(_key: String, _parentOptions: Record[String, _]): Unit = js.native
    
    def onProcessOptions(key: String, parentOptions: Record[String, _], commandName: String): Unit = js.native
  }
}
