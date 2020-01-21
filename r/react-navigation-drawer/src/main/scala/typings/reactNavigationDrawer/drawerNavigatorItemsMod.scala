package typings.reactNavigationDrawer

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.typesMod.DrawerNavigatorItemsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerNavigatorItems", JSImport.Namespace)
@js.native
object drawerNavigatorItemsMod extends js.Object {
  @js.native
  trait DrawerNavigatorItems
    extends Component[DrawerNavigatorItemsProps, js.Object, js.Any] {
    @JSName("context")
    var context_DrawerNavigatorItems: ContextType[Context[SupportedThemes]] = js.native
    var getActiveBackgroundColor: js.Any = js.native
    var getActiveTintColor: js.Any = js.native
    var getInactiveBackgroundColor: js.Any = js.native
    var getInactiveTintColor: js.Any = js.native
  }
  
  @js.native
  class default () extends DrawerNavigatorItems
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonActiveBackgroundColor = js.native
  }
  
}

