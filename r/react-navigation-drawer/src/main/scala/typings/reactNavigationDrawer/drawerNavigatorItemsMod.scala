package typings.reactNavigationDrawer

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.anon.ActiveBackgroundColor
import typings.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerNavigatorItemsMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerNavigatorItems", JSImport.Default)
  @js.native
  class default () extends DrawerNavigatorItems
  /* static members */
  object default {
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerNavigatorItems", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerNavigatorItems", "default.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerNavigatorItems", "default.defaultProps")
    @js.native
    def defaultProps: ActiveBackgroundColor = js.native
    inline def defaultProps_=(x: ActiveBackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DrawerNavigatorItems
    extends Component[DrawerNavigatorItemsProps, js.Object, js.Any] {
    
    @JSName("context")
    var context_DrawerNavigatorItems: ContextType[Context[SupportedThemes]] = js.native
    
    /* private */ var getActiveBackgroundColor: js.Any = js.native
    
    /* private */ var getActiveTintColor: js.Any = js.native
    
    /* private */ var getInactiveBackgroundColor: js.Any = js.native
    
    /* private */ var getInactiveTintColor: js.Any = js.native
  }
}
