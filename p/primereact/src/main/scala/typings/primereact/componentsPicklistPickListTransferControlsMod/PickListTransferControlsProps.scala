package typings.primereact.componentsPicklistPickListTransferControlsMod

import typings.primereact.Anon_DirectionOriginalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListTransferControlsProps extends js.Object {
  var onTransfer: js.UndefOr[js.Function1[/* e */ Anon_DirectionOriginalEvent, Unit]] = js.undefined
  var source: js.UndefOr[js.Array[_]] = js.undefined
  var sourceSelection: js.UndefOr[js.Array[_]] = js.undefined
  var target: js.UndefOr[js.Array[_]] = js.undefined
  var targetSelection: js.UndefOr[js.Array[_]] = js.undefined
}

object PickListTransferControlsProps {
  @scala.inline
  def apply(
    onTransfer: /* e */ Anon_DirectionOriginalEvent => Unit = null,
    source: js.Array[_] = null,
    sourceSelection: js.Array[_] = null,
    target: js.Array[_] = null,
    targetSelection: js.Array[_] = null
  ): PickListTransferControlsProps = {
    val __obj = js.Dynamic.literal()
    if (onTransfer != null) __obj.updateDynamic("onTransfer")(js.Any.fromFunction1(onTransfer))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceSelection != null) __obj.updateDynamic("sourceSelection")(sourceSelection.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListTransferControlsProps]
  }
}

