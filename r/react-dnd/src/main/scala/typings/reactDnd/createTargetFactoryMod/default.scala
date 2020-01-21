package typings.reactDnd.createTargetFactoryMod

import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DropTargetSpec
import typings.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createTargetFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ RefObject[_], Target] = js.native
}

