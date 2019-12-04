package typings.reactDashDnd.libDecoratorsCreateTargetFactoryMod

import typings.react.reactMod.RefObject
import typings.reactDashDnd.libDecoratorsInterfacesMod.DropTargetSpec
import typings.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createTargetFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ RefObject[_], Target] = js.native
}

