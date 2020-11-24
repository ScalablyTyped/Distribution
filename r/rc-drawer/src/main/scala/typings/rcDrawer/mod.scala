package typings.rcDrawer

import typings.rcDrawer.anon.AfterVisibleChange
import typings.rcDrawer.anon.Open
import typings.rcDrawer.anon.PrevPropsIDrawerProps
import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-drawer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typings.rcDrawer.drawerWrapperMod.default {
    def this(props: IDrawerProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AfterVisibleChange = js.native
    
    def getDerivedStateFromProps(props: IDrawerProps, hasPrevProps: PrevPropsIDrawerProps): Open = js.native
  }
}
