package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.MenuProvided> */
trait PartialMenuProvided extends js.Object {
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var currentRefinement: js.UndefOr[String] = js.undefined
  var isFromSearch: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[AnonCount]] = js.undefined
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var searchForItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object PartialMenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => _ = null,
    currentRefinement: String = null,
    isFromSearch: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[AnonCount] = null,
    refine: /* repeated */ js.Any => _ = null,
    searchForItems: /* repeated */ js.Any => _ = null
  ): PartialMenuProvided = {
    val __obj = js.Dynamic.literal()
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    if (currentRefinement != null) __obj.updateDynamic("currentRefinement")(currentRefinement.asInstanceOf[js.Any])
    if (!js.isUndefined(isFromSearch)) __obj.updateDynamic("isFromSearch")(isFromSearch.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (refine != null) __obj.updateDynamic("refine")(js.Any.fromFunction1(refine))
    if (searchForItems != null) __obj.updateDynamic("searchForItems")(js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[PartialMenuProvided]
  }
}

