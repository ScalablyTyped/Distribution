package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responders extends js.Object {
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.native
  @JSName("onDragEnd")
  var onDragEnd_Original: OnDragEndResponder = js.native
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.native
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.native
  def onDragEnd(result: DropResult, provided: ResponderProvided): scala.Unit = js.native
}

