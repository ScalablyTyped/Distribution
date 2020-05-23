package typings.rmcTabs.tabPaneMod

import typings.react.mod.Component
import typings.rmcTabs.anon.FixX
import typings.rmcTabs.anon.PropsTypechildrenReactNod
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
  def componentWillReceiveProps_MTabPane(nextProps: PropsTypechildrenReactNod): Unit = js.native
  def setLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/TabPane", "TabPane")
@js.native
object TabPane extends js.Object {
  var defaultProps: FixX = js.native
}

