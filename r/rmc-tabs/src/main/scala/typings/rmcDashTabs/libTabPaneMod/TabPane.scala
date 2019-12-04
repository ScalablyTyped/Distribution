package typings.rmcDashTabs.libTabPaneMod

import typings.react.reactMod.Component
import typings.rmcDashTabs.Anon_Children
import typings.rmcDashTabs.Anon_FixX
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/TabPane", "TabPane")
@js.native
class TabPane ()
  extends Component[PropsType, js.Object, js.Any] {
  var layout: HTMLDivElement = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabPane(nextProps: PropsType with Anon_Children): Unit = js.native
  def setLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/TabPane", "TabPane")
@js.native
object TabPane extends js.Object {
  var defaultProps: Anon_FixX = js.native
}

