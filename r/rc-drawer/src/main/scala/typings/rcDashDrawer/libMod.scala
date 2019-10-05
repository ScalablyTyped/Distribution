package typings.rcDashDrawer

import typings.rcDashDrawer.libDrawerWrapperMod.DrawerWrapper
import typings.rcDashDrawer.libIDrawerPropTypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class default protected () extends DrawerWrapper {
    def this(props: IDrawerProps) = this()
  }
  
  val default: TypeofClassDrawerWrapperDefaultProps with Anon_ContextType = js.native
}

