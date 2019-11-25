package typings.sortablejs.sortablejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  /**
    * group name
    */
  var name: String
  /**
    * ability to move from the list. clone — copy the item, rather than move.
    */
  var pull: js.UndefOr[PullResult | (js.Function2[/* to */ Sortable, /* from */ Sortable, PullResult])] = js.undefined
  /**
    * whether elements can be added from other lists, or an array of group names from which elements can be taken.
    */
  var put: js.UndefOr[(js.Function1[/* to */ Sortable, PutResult]) | PutResult] = js.undefined
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    name: String,
    pull: PullResult | (js.Function2[/* to */ Sortable, /* from */ Sortable, PullResult]) = null,
    put: (js.Function1[/* to */ Sortable, PutResult]) | PutResult = null,
    revertClone: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (!js.isUndefined(revertClone)) __obj.updateDynamic("revertClone")(revertClone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

