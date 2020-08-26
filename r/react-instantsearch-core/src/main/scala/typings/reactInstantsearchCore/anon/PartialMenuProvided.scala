package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.MenuProvided> */
@js.native
trait PartialMenuProvided extends js.Object {
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var currentRefinement: js.UndefOr[String] = js.native
  var isFromSearch: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[Count]] = js.native
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var searchForItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object PartialMenuProvided {
  @scala.inline
  def apply(): PartialMenuProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMenuProvided]
  }
  @scala.inline
  implicit class PartialMenuProvidedOps[Self <: PartialMenuProvided] (val x: Self) extends AnyVal {
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
    def setCreateURL(value: /* repeated */ js.Any => _): Self = this.set("createURL", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateURL: Self = this.set("createURL", js.undefined)
    @scala.inline
    def setCurrentRefinement(value: String): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRefinement: Self = this.set("currentRefinement", js.undefined)
    @scala.inline
    def setIsFromSearch(value: Boolean): Self = this.set("isFromSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFromSearch: Self = this.set("isFromSearch", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Count*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Count]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => _): Self = this.set("refine", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefine: Self = this.set("refine", js.undefined)
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => _): Self = this.set("searchForItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchForItems: Self = this.set("searchForItems", js.undefined)
  }
  
}

