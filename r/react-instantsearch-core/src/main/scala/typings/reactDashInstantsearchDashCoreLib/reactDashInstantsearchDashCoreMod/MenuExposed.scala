package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuExposed extends js.Object {
  var attribute: java.lang.String
  var defaultRefinement: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  var showMore: js.UndefOr[scala.Boolean] = js.undefined
  var showMoreLimit: js.UndefOr[scala.Double] = js.undefined
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object MenuExposed {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    defaultRefinement: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    showMore: js.UndefOr[scala.Boolean] = js.undefined,
    showMoreLimit: scala.Int | scala.Double = null,
    transformItems: /* repeated */ js.Any => _ = null
  ): MenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute)
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (!js.isUndefined(showMore)) __obj.updateDynamic("showMore")(showMore)
    if (showMoreLimit != null) __obj.updateDynamic("showMoreLimit")(showMoreLimit.asInstanceOf[js.Any])
    if (transformItems != null) __obj.updateDynamic("transformItems")(js.Any.fromFunction1(transformItems))
    __obj.asInstanceOf[MenuExposed]
  }
}

