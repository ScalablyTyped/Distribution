package typings.reactDashDnd.libDecoratorsCreateSourceFactoryMod

import typings.react.reactMod.RefObject
import typings.reactDashDnd.libDecoratorsInterfacesMod.DragSourceSpec
import typings.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createSourceFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ RefObject[_], Source] = js.native
}

