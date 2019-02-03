package typings
package reactDashFnsLib.distScrollScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
@js.native
class Scroll ()
  extends reactLib.reactMod.Component[
      ScrollConfig with reactDashFnsLib.distTypesMod.SharedRenderProps[ScrollProps], 
      ScrollProps, 
      js.Any
    ] {
  @JSName("state")
  var state_Scroll: ScrollProps = js.native
  @JSName("componentDidMount")
  def componentDidMount_MScroll(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScroll(): scala.Unit = js.native
  def handleWindowScroll(): scala.Unit = js.native
}

/* static members */
@JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
@js.native
object Scroll extends js.Object {
  var defaultProps: stdLib.Partial[reactDashFnsLib.distScrollScrollMod.ScrollConfig] = js.native
}

