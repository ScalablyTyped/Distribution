package typings.reactNativeNavigation

import typings.reactNativeNavigation.layoutMod.Layout
import typings.reactNativeNavigation.layoutTreeCrawlerMod.LayoutNode
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutTreeParserMod {
  
  @JSImport("react-native-navigation/lib/dist/commands/LayoutTreeParser", "LayoutTreeParser")
  @js.native
  class LayoutTreeParser protected () extends StObject {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    
    /* private */ var bottomTabs: js.Any = js.native
    
    /* private */ var component: js.Any = js.native
    
    /* private */ var externalComponent: js.Any = js.native
    
    def parse(api: Layout[js.Object]): LayoutNode = js.native
    
    /* private */ var sideMenu: js.Any = js.native
    
    /* private */ var sideMenuChildren: js.Any = js.native
    
    /* private */ var splitView: js.Any = js.native
    
    /* private */ var stack: js.Any = js.native
    
    /* private */ var topTabs: js.Any = js.native
    
    /* private */ var uniqueIdProvider: js.Any = js.native
  }
}
