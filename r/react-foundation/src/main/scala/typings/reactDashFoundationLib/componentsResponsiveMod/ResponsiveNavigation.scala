package typings
package reactDashFoundationLib.componentsResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-foundation/components/responsive", "ResponsiveNavigation")
@js.native
class ResponsiveNavigation ()
  extends reactLib.reactMod.Component[ResponsiveNavigationProps, ResponsiveNavigationState, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MResponsiveNavigation(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MResponsiveNavigation(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResponsiveNavigation(): scala.Unit = js.native
  /**
    * Called when the menu icon is clicked.
    */
  def toggle(): scala.Unit = js.native
  /**
    * Updates the state of this component.
    * While this might seem like a sub-optimal solution, it is actually the only solution.
    * Using 'hide' and 'show' -classes won't work because they set display with `!important`.
    */
  def update(): scala.Unit = js.native
}

@JSImport("react-foundation/components/responsive", "ResponsiveNavigation")
@js.native
object ResponsiveNavigation extends js.Object {
  var defaultProps: reactDashFoundationLib.Anon_Breakpoint = js.native
  var propTypes: reactDashFoundationLib.Anon_AlignX = js.native
}

