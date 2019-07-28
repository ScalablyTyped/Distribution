package typings.reactDashDnd.libDecoratorsInterfacesMod

import typings.dndDashCore.libInterfacesMod.Identifier
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndComponent[Props]
  extends Component[Props, js.Object, js.Any] {
  def getDecoratedComponentInstance(): (Component[Props, js.Object, _]) | Null = js.native
  def getHandlerId(): Identifier = js.native
}

