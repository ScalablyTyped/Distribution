package typings.rcDrawer.drawerWrapperMod

import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import typings.react.mod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerWrapper
  extends Component[IDrawerProps, IState, js.Any] {
  
  var dom: HTMLElement | Null = js.native
  
  var onClose: js.Any = js.native
  
  var onHandleClick: js.Any = js.native
}
