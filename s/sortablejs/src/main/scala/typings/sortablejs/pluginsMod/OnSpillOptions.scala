package typings.sortablejs.pluginsMod

import typings.sortablejs.mod.SortableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSpillOptions extends js.Object {
  /**
    * Called when either `revertOnSpill` or `RemoveOnSpill` plugins are enabled.
    */
  var onSpill: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.undefined
  /**
    * This plugin, when enabled,
    * will cause the dragged item to be removed from the DOM if it is *spilled*
    * (ie. it is dropped outside of a valid Sortable drop target)
    */
  var removeOnSpill: js.UndefOr[Boolean] = js.undefined
  /**
    * This plugin, when enabled,
    * will cause the dragged item to be reverted to it's original position if it is *spilled*
    * (ie. it is dropped outside of a valid Sortable drop target)
    */
  var revertOnSpill: js.UndefOr[Boolean] = js.undefined
}

object OnSpillOptions {
  @scala.inline
  def apply(
    onSpill: /* evt */ SortableEvent => Unit = null,
    removeOnSpill: js.UndefOr[Boolean] = js.undefined,
    revertOnSpill: js.UndefOr[Boolean] = js.undefined
  ): OnSpillOptions = {
    val __obj = js.Dynamic.literal()
    if (onSpill != null) __obj.updateDynamic("onSpill")(js.Any.fromFunction1(onSpill))
    if (!js.isUndefined(removeOnSpill)) __obj.updateDynamic("removeOnSpill")(removeOnSpill.asInstanceOf[js.Any])
    if (!js.isUndefined(revertOnSpill)) __obj.updateDynamic("revertOnSpill")(revertOnSpill.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSpillOptions]
  }
}

