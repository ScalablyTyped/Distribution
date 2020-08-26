package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.HitcountnumberisRefinedbo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinementListProvided extends js.Object {
  /** a boolean that says whether you can currently refine */
  var canRefine: Boolean = js.native
  /** the refinement currently applied */
  var currentRefinement: js.Array[String] = js.native
  /** a boolean that says if the items props contains facet values from the global search or from the search inside items. */
  var isFromSearch: Boolean = js.native
  /**
    * The list of items the RefinementList can display.
    * If isFromSearch is false, the hit properties like _highlightResult are undefined
    */
  var items: js.Array[HitcountnumberisRefinedbo] = js.native
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any = js.native
  /** a function to toggle a refinement */
  def refine(value: js.Array[String]): js.Any = js.native
  /** a function to toggle a search inside items values */
  def searchForItems(args: js.Any*): js.Any = js.native
}

object RefinementListProvided {
  @scala.inline
  def apply(
    canRefine: Boolean,
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: js.Array[String],
    isFromSearch: Boolean,
    items: js.Array[HitcountnumberisRefinedbo],
    refine: js.Array[String] => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): RefinementListProvided = {
    val __obj = js.Dynamic.literal(canRefine = canRefine.asInstanceOf[js.Any], createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[RefinementListProvided]
  }
  @scala.inline
  implicit class RefinementListProvidedOps[Self <: RefinementListProvided] (val x: Self) extends AnyVal {
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
    def setCanRefine(value: Boolean): Self = this.set("canRefine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = this.set("createURL", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentRefinementVarargs(value: String*): Self = this.set("currentRefinement", js.Array(value :_*))
    @scala.inline
    def setCurrentRefinement(value: js.Array[String]): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFromSearch(value: Boolean): Self = this.set("isFromSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: HitcountnumberisRefinedbo*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[HitcountnumberisRefinedbo]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefine(value: js.Array[String] => js.Any): Self = this.set("refine", js.Any.fromFunction1(value))
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => js.Any): Self = this.set("searchForItems", js.Any.fromFunction1(value))
  }
  
}

