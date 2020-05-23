package typings.reactNavigationDrawer.drawerViewMod

import typings.react.mod.Context
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.anon.Lazy
import typings.reactNavigationDrawer.anon.Loaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
@js.native
class default () extends DrawerView

/* static members */
@JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
@js.native
object default extends js.Object {
  var contextType: Context[SupportedThemes] = js.native
  var defaultProps: Lazy = js.native
  def getDerivedStateFromProps(nextProps: Props, prevState: State): Loaded = js.native
}

