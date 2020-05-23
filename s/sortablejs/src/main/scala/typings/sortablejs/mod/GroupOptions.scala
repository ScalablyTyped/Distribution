package typings.sortablejs.mod

import typings.sortablejs.sortablejsStrings.clone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  /**
    * a canonical version of pull, created by Sortable
    */
  var checkPull: js.UndefOr[
    js.Function4[
      /* sortable */ Sortable, 
      /* activeSortable */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      Boolean | String | js.Array[String]
    ]
  ] = js.undefined
  /**
    * a canonical version of put, created by Sortable
    */
  var checkPut: js.UndefOr[
    js.Function4[
      /* sortable */ Sortable, 
      /* activeSortable */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      Boolean | String | clone | js.Array[String]
    ]
  ] = js.undefined
  /**
    * group name
    */
  var name: String
  /**
    * ability to move from the list. clone — copy the item, rather than move.
    */
  var pull: js.UndefOr[
    PullResult | (js.Function4[
      /* to */ Sortable, 
      /* from */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      PullResult
    ])
  ] = js.undefined
  /**
    * whether elements can be added from other lists, or an array of group names from which elements can be taken.
    */
  var put: js.UndefOr[
    PutResult | (js.Function4[
      /* to */ Sortable, 
      /* from */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      PutResult
    ])
  ] = js.undefined
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    name: String,
    checkPull: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | js.Array[String] = null,
    checkPut: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | clone | js.Array[String] = null,
    pull: PullResult | (js.Function4[
      /* to */ Sortable, 
      /* from */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      PullResult
    ]) = null,
    put: PutResult | (js.Function4[
      /* to */ Sortable, 
      /* from */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      PutResult
    ]) = null,
    revertClone: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (checkPull != null) __obj.updateDynamic("checkPull")(js.Any.fromFunction4(checkPull))
    if (checkPut != null) __obj.updateDynamic("checkPut")(js.Any.fromFunction4(checkPut))
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (!js.isUndefined(revertClone)) __obj.updateDynamic("revertClone")(revertClone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

