package typings.reactDashScroll

import typings.react.reactMod.Component
import typings.react.reactMod.HTMLProps
import typings.reactDashScroll.modulesComponentsLinkMod.ReactScrollLinkProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll/modules/components/Button", JSImport.Namespace)
@js.native
object modulesComponentsButtonMod extends js.Object {
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  type Button = Component[ButtonProps, js.Object, js.Any]
  type ButtonProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}

