package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcAdaptersUniqueIdProviderMod.UniqueIdProvider
import typings.reactNativeNavigation.libDistSrcCommandsLayoutTreeCrawlerMod.LayoutNode
import typings.reactNativeNavigation.libDistSrcInterfacesLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcCommandsLayoutTreeParserMod {
  
  @JSImport("react-native-navigation/lib/dist/src/commands/LayoutTreeParser", "LayoutTreeParser")
  @js.native
  open class LayoutTreeParser protected () extends StObject {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    
    /* private */ var bottomTabs: Any = js.native
    
    /* private */ var component: Any = js.native
    
    /* private */ var externalComponent: Any = js.native
    
    def parse(api: Layout[js.Object]): LayoutNode = js.native
    
    /* private */ var sideMenu: Any = js.native
    
    /* private */ var sideMenuChildren: Any = js.native
    
    /* private */ var splitView: Any = js.native
    
    /* private */ var stack: Any = js.native
    
    /* private */ var topTabs: Any = js.native
    
    /* private */ var uniqueIdProvider: Any = js.native
  }
}
