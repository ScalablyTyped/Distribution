package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typings.reactNativeNavigation.libDistSrcInterfacesLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcCommandsOptionsCrawlerMod {
  
  @JSImport("react-native-navigation/lib/dist/src/commands/OptionsCrawler", "OptionsCrawler")
  @js.native
  open class OptionsCrawler protected () extends StObject {
    def this(
      store: Store,
      uniqueIdProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniqueIdProvider */ Any
    ) = this()
    
    /* private */ var applyComponentId: Any = js.native
    
    /* private */ var applyStaticOptions: Any = js.native
    
    /* private */ var bottomTabs: Any = js.native
    
    /* private */ var component: Any = js.native
    
    def crawl(): Unit = js.native
    def crawl(api: Layout[js.Object]): Unit = js.native
    
    /* private */ var isComponentWithOptions: Any = js.native
    
    /* private */ var sideMenu: Any = js.native
    
    /* private */ var splitView: Any = js.native
    
    /* private */ var stack: Any = js.native
    
    /* private */ var staticOptionsIfPossible: Any = js.native
    
    val store: Store = js.native
    
    /* private */ var topTabs: Any = js.native
    
    val uniqueIdProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniqueIdProvider */ Any = js.native
  }
}
