package typings.rcDrawer

import org.scalablytyped.runtime.Instantiable1
import typings.rcDrawer.drawerWrapperMod.DrawerWrapper
import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected () extends DrawerWrapper {
    def this(props: IDrawerProps) = this()
  }
  
  @js.native
  object default extends Instantiable1[/* props */ IDrawerProps, DrawerWrapper] {
    var contextType: js.UndefOr[Context[_]] = js.native
    var defaultProps: AnonAfterVisibleChange = js.native
    var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any = js.native
    def getDerivedStateFromProps(props: IDrawerProps, hasPrevProps: AnonPrevPropsIDrawerProps): AnonOpen = js.native
  }
  
}

