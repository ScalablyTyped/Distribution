package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProvided extends js.Object {
  var currentRefinement: String = js.native
  var isFromSearch: Boolean = js.native
  var items: js.Array[Count] = js.native
  def createURL(args: js.Any*): js.Any = js.native
  def refine(args: js.Any*): js.Any = js.native
  def searchForItems(args: js.Any*): js.Any = js.native
}

object MenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    isFromSearch: Boolean,
    items: js.Array[Count],
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[MenuProvided]
  }
  @scala.inline
  implicit class MenuProvidedOps[Self <: MenuProvided] (val x: Self) extends AnyVal {
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
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = this.set("createURL", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentRefinement(value: String): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFromSearch(value: Boolean): Self = this.set("isFromSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Count*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Count]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = this.set("refine", js.Any.fromFunction1(value))
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => js.Any): Self = this.set("searchForItems", js.Any.fromFunction1(value))
  }
  
}

