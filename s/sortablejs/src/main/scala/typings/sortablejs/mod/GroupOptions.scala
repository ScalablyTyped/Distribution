package typings.sortablejs.mod

import typings.sortablejs.sortablejsStrings.clone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * group name
    */
  var name: String = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[Boolean] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(name: String): GroupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckPull(
      value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | js.Array[String]
    ): Self = this.set("checkPull", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCheckPull: Self = this.set("checkPull", js.undefined)
    @scala.inline
    def setCheckPut(
      value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | clone | js.Array[String]
    ): Self = this.set("checkPut", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCheckPut: Self = this.set("checkPut", js.undefined)
    @scala.inline
    def setPullVarargs(value: String*): Self = this.set("pull", js.Array(value :_*))
    @scala.inline
    def setPullFunction4(
      value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PullResult
    ): Self = this.set("pull", js.Any.fromFunction4(value))
    @scala.inline
    def setPull(
      value: PullResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PullResult
        ])
    ): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    @scala.inline
    def setPutVarargs(value: String*): Self = this.set("put", js.Array(value :_*))
    @scala.inline
    def setPutFunction4(
      value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PutResult
    ): Self = this.set("put", js.Any.fromFunction4(value))
    @scala.inline
    def setPut(
      value: PutResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PutResult
        ])
    ): Self = this.set("put", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
    @scala.inline
    def setRevertClone(value: Boolean): Self = this.set("revertClone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevertClone: Self = this.set("revertClone", js.undefined)
  }
  
}

