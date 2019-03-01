package typings
package sortablejsLib.sortablejsMod.SortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  /**
    * group name
    */
  var name: java.lang.String
  /**
    * ability to move from the list. clone — copy the item, rather than move.
    */
  var pull: js.UndefOr[
    scala.Boolean | sortablejsLib.sortablejsLibStrings.clone | (js.Function2[
      /* to */ sortablejsLib.sortablejsMod.Sortable, 
      /* from */ sortablejsLib.sortablejsMod.Sortable, 
      scala.Boolean | java.lang.String
    ])
  ] = js.undefined
  /**
    * whether elements can be added from other lists, or an array of group names from which elements can be taken.
    */
  var put: js.UndefOr[
    scala.Boolean | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* to */ sortablejsLib.sortablejsMod.Sortable, scala.Boolean])
  ] = js.undefined
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[scala.Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    pull: scala.Boolean | sortablejsLib.sortablejsLibStrings.clone | (js.Function2[
      /* to */ sortablejsLib.sortablejsMod.Sortable, 
      /* from */ sortablejsLib.sortablejsMod.Sortable, 
      scala.Boolean | java.lang.String
    ]) = null,
    put: scala.Boolean | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* to */ sortablejsLib.sortablejsMod.Sortable, scala.Boolean]) = null,
    revertClone: js.UndefOr[scala.Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (!js.isUndefined(revertClone)) __obj.updateDynamic("revertClone")(revertClone)
    __obj.asInstanceOf[GroupOptions]
  }
}

