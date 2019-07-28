package typings.sortablejs.sortablejsMod

import typings.sortablejs.sortablejsStrings.clone
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
  var pull: js.UndefOr[
    Boolean | clone | (js.Function2[/* to */ Sortable, /* from */ Sortable, Boolean | String])
  ] = js.undefined
  /**
    * whether elements can be added from other lists, or an array of group names from which elements can be taken.
    */
  var put: js.UndefOr[Boolean | String | js.Array[String] | (js.Function1[/* to */ Sortable, Boolean])] = js.undefined
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    name: String,
    pull: Boolean | clone | (js.Function2[/* to */ Sortable, /* from */ Sortable, Boolean | String]) = null,
    put: Boolean | String | js.Array[String] | (js.Function1[/* to */ Sortable, Boolean]) = null,
    revertClone: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (!js.isUndefined(revertClone)) __obj.updateDynamic("revertClone")(revertClone)
    __obj.asInstanceOf[GroupOptions]
  }
}

