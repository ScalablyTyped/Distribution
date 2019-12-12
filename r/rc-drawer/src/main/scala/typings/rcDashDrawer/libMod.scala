package typings.rcDashDrawer

import org.scalablytyped.runtime.TopLevel
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
  
  @js.native
  object default extends TopLevel[TypeofClassDrawerWrapper with Anon_ContextTypeDefaultProps]
  
}

