package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.RefinementListProvided> */
trait PartialRefinementListProv extends js.Object {
  var canRefine: js.UndefOr[Boolean] = js.undefined
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var currentRefinement: js.UndefOr[js.Array[String]] = js.undefined
  var isFromSearch: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[HitcountnumberisRefinedbo]] = js.undefined
  var refine: js.UndefOr[js.Function1[/* value */ js.Array[String], _]] = js.undefined
  var searchForItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object PartialRefinementListProv {
  @scala.inline
  def apply(
    canRefine: js.UndefOr[Boolean] = js.undefined,
    createURL: /* repeated */ js.Any => _ = null,
    currentRefinement: js.Array[String] = null,
    isFromSearch: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[HitcountnumberisRefinedbo] = null,
    refine: /* value */ js.Array[String] => _ = null,
    searchForItems: /* repeated */ js.Any => _ = null
  ): PartialRefinementListProv = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canRefine)) __obj.updateDynamic("canRefine")(canRefine.get.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    if (currentRefinement != null) __obj.updateDynamic("currentRefinement")(currentRefinement.asInstanceOf[js.Any])
    if (!js.isUndefined(isFromSearch)) __obj.updateDynamic("isFromSearch")(isFromSearch.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (refine != null) __obj.updateDynamic("refine")(js.Any.fromFunction1(refine))
    if (searchForItems != null) __obj.updateDynamic("searchForItems")(js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[PartialRefinementListProv]
  }
}

