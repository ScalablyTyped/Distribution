package typings.rbx.navbarContainerMod

import typings.rbx.AnonTransparent
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/components/navbar/navbar-container", "NavbarContainer")
@js.native
class NavbarContainer protected ()
  extends Component[NavbarContainerProps, NavbarContainerState, js.Any] {
  def this(props: NavbarContainerProps) = this()
  var active: js.Any = js.native
  val document: js.Any = js.native
  var manageHtmlAttributes: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNavbarContainer(): Unit = js.native
}

/* static members */
@JSImport("rbx/components/navbar/navbar-container", "NavbarContainer")
@js.native
object NavbarContainer extends js.Object {
  var defaultProps: AnonTransparent = js.native
  var displayName: String = js.native
}

