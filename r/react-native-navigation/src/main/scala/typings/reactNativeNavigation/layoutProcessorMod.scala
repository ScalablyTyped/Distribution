package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.layoutMod.Layout
import typings.reactNativeNavigation.layoutProcessorsStoreMod.LayoutProcessorsStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/processors/LayoutProcessor", JSImport.Namespace)
@js.native
object layoutProcessorMod extends js.Object {
  
  @js.native
  class LayoutProcessor protected () extends js.Object {
    def this(layoutProcessorsStore: LayoutProcessorsStore) = this()
    
    var layoutProcessorsStore: js.Any = js.native
    
    def process(layout: Layout[js.Object], commandName: CommandName): Layout[js.Object] = js.native
  }
}
