package typings.reactMdUtils.useKeyboardSearchMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchData[D, E /* <: HTMLElement */] extends js.Object {
  /**
    * The index in the `items` array that the found item appears at. This is
    * super useful when extending this hook to be used with
    * `aria-activedescendant` focus movement or manual focus behavior since the
    * `items` array should normally be the same indexes as the DOM nodes.
    */
  val index: Double = js.native
  /**
    * The item that was matched from the latest search.
    */
  val item: D = js.native
  /**
    * The current list of items that were provided to be searched.
    */
  val items: js.Array[D] = js.native
  /**
    * The search value that was used to find this item and trigger the change
    * event.
    */
  val query: String = js.native
  /**
    * The current target for the search keydown event.
    */
  val target: E = js.native
}

object SearchData {
  @scala.inline
  def apply[D, /* <: typings.std.HTMLElement */ E](index: Double, item: D, items: js.Array[D], query: String, target: E): SearchData[D, E] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchData[D, E]]
  }
  @scala.inline
  implicit class SearchDataOps[Self <: SearchData[_, _], D, /* <: typings.std.HTMLElement */ E] (val x: Self with (SearchData[D, E])) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: D): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: D*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[D]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: E): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

