package typings.rcDashDrawer.esDrawerWrapperMod

import typings.rcDashDrawer.esIDrawerPropTypesMod.IDrawerProps
import typings.react.reactMod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerWrapper
  extends Component[IDrawerProps, IState, js.Any] {
  var dom: HTMLElement | Null = js.native
  var onClose: js.Any = js.native
  var onHandleClick: js.Any = js.native
}

