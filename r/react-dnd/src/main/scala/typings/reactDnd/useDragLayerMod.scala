package typings.reactDnd

import typings.reactDnd.monitorsMod.DragLayerMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDragLayer", JSImport.Namespace)
@js.native
object useDragLayerMod extends js.Object {
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
}

