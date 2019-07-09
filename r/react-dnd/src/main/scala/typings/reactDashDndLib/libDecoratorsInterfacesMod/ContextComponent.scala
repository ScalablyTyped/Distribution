package typings
package reactDashDndLib.libDecoratorsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextComponent[Props]
  extends reactLib.reactMod.Component[Props, js.Object, js.Any] {
  def getDecoratedComponentInstance(): reactLib.reactMod.Component[Props, js.Object, _] = js.native
  def getManager(): dndDashCoreLib.libInterfacesMod.DragDropManager = js.native
}

