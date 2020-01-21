package typings.reactDnd.createSourceFactoryMod

import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DragSourceSpec
import typings.reactDnd.monitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createSourceFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ RefObject[_], Source] = js.native
}

