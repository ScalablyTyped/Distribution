package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuExposed extends js.Object {
  var attribute: String
  var defaultRefinement: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var showMore: js.UndefOr[Boolean] = js.undefined
  var showMoreLimit: js.UndefOr[Double] = js.undefined
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object MenuExposed {
  @scala.inline
  def apply(
    attribute: String,
    defaultRefinement: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    showMore: js.UndefOr[Boolean] = js.undefined,
    showMoreLimit: js.UndefOr[Double] = js.undefined,
    transformItems: /* repeated */ js.Any => _ = null
  ): MenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMore)) __obj.updateDynamic("showMore")(showMore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMoreLimit)) __obj.updateDynamic("showMoreLimit")(showMoreLimit.get.asInstanceOf[js.Any])
    if (transformItems != null) __obj.updateDynamic("transformItems")(js.Any.fromFunction1(transformItems))
    __obj.asInstanceOf[MenuExposed]
  }
}

