package typings.reactNavigationDrawer.drawerViewMod

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerView
  extends Component[Props, State, js.Any] {
  @JSName("context")
  var context_DrawerView: ContextType[Context[SupportedThemes]] = js.native
  var drawerGestureRef: js.Any = js.native
  var getDrawerBackgroundColor: js.Any = js.native
  var getLockMode: js.Any = js.native
  var getOverlayColor: js.Any = js.native
  var handleDrawerClose: js.Any = js.native
  var handleDrawerOpen: js.Any = js.native
  var renderContent: js.Any = js.native
  var renderNavigationView: js.Any = js.native
  var setDrawerGestureRef: js.Any = js.native
  var updateWidth: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDrawerView(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDrawerView(prevProps: Props): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDrawerView(): Unit = js.native
}

