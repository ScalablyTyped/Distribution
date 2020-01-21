package typings.storybookAddonLinks.linkMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkTo
  extends Component[Props, State, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MLinkTo(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MLinkTo(prevProps: Props): Unit = js.native
  def handleClick(): Unit = js.native
  def updateHref(): js.Promise[Unit] = js.native
}

