package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.layoutNavDrawerMod.NavDrawerProps
import typings.reactToolbox.layoutPanelMod.PanelProps
import typings.reactToolbox.layoutSidebarMod.SidebarProps
import typings.reactToolbox.libLayoutLayoutMod.LayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/layout", JSImport.Namespace)
@js.native
object libLayoutMod extends js.Object {
  @js.native
  class Layout ()
    extends Component[LayoutProps, js.Object, js.Any]
  
  @js.native
  class NavDrawer ()
    extends Component[NavDrawerProps, js.Object, js.Any]
  
  @js.native
  class Panel ()
    extends Component[PanelProps, js.Object, js.Any]
  
  @js.native
  class Sidebar ()
    extends Component[SidebarProps, js.Object, js.Any]
  
}

