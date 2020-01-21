package typings.rcDrawer

import org.scalablytyped.runtime.TopLevel
import typings.rcDrawer.drawerWrapperMod.DrawerWrapper
import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
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
  object default extends TopLevel[TypeofClassDrawerWrapper with AnonContextTypeDefaultProps]
  
}

