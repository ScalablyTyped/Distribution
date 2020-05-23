package typings.rcDrawer.drawerChildMod

import typings.rcDrawer.anon.PrevProps
import typings.rcDrawer.anon.PrevPropsIDrawerChildProps
import typings.rcDrawer.anon.SwitchScrollingEffect
import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
@js.native
class default protected () extends DrawerChild {
  def this(props: IDrawerChildProps) = this()
}

/* static members */
@JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: SwitchScrollingEffect = js.native
  def getDerivedStateFromProps(props: IDrawerChildProps, hasPrevProps_self: PrevProps): PrevPropsIDrawerChildProps = js.native
}

