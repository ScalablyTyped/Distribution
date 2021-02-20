package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandNameMod.CommandName
import typings.reactNativeNavigation.layoutMod.Layout
import typings.reactNativeNavigation.layoutProcessorsStoreMod.LayoutProcessorsStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutProcessorMod {
  
  @JSImport("react-native-navigation/lib/dist/processors/LayoutProcessor", "LayoutProcessor")
  @js.native
  class LayoutProcessor protected () extends StObject {
    def this(layoutProcessorsStore: LayoutProcessorsStore) = this()
    
    var layoutProcessorsStore: js.Any = js.native
    
    def process(layout: Layout[js.Object], commandName: CommandName): Layout[js.Object] = js.native
  }
}
