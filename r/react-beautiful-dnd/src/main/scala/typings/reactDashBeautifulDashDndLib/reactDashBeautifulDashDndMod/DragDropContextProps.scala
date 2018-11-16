package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragDropContextProps extends js.Object {
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ HookProvided, scala.Unit]] = js.undefined
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ HookProvided, scala.Unit]] = js.undefined
  def onDragEnd(result: DropResult, provided: HookProvided): scala.Unit
}

