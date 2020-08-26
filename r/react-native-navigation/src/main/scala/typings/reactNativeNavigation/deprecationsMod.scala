package typings.reactNativeNavigation

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/Deprecations", JSImport.Namespace)
@js.native
object deprecationsMod extends js.Object {
  @js.native
  class Deprecations () extends js.Object {
    var deprecateBottomTabsVisibility: js.Any = js.native
    def onProcessDefaultOptions(_key: String, _parentOptions: Record[String, _]): Unit = js.native
    def onProcessOptions(key: String, parentOptions: Record[String, _], commandName: String): Unit = js.native
  }
  
}

