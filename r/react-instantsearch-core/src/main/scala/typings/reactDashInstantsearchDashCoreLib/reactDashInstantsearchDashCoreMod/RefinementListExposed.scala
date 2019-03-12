package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementListExposed extends js.Object {
  /** the name of the attribute in the record */
  var attribute: java.lang.String
  /**
    * the values of the items selected by default. The searchState of this widget takes the form of a list of strings,
    * which correspond to the values of all selected refinements. However, when there are no refinements selected,
    * the value of the searchState is an empty string.
    */
  var defaultRefinement: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** the minimum number of displayed items */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** How to apply the refinements. Possible values: ‘or’ or ‘and’. */
  var operator: js.UndefOr[
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.or | reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.and
  ] = js.undefined
  /** allow search inside values */
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  /** true if the component should display a button that will expand the number of items */
  var showMore: js.UndefOr[scala.Boolean] = js.undefined
  /** the maximun number of displayed items. Only used when showMore is set to true */
  var showMoreLimit: js.UndefOr[scala.Double] = js.undefined
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object RefinementListExposed {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    defaultRefinement: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    operator: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.or | reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.and = null,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    showMore: js.UndefOr[scala.Boolean] = js.undefined,
    showMoreLimit: scala.Int | scala.Double = null,
    transformItems: /* repeated */ js.Any => _ = null
  ): RefinementListExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute)
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (!js.isUndefined(showMore)) __obj.updateDynamic("showMore")(showMore)
    if (showMoreLimit != null) __obj.updateDynamic("showMoreLimit")(showMoreLimit.asInstanceOf[js.Any])
    if (transformItems != null) __obj.updateDynamic("transformItems")(js.Any.fromFunction1(transformItems))
    __obj.asInstanceOf[RefinementListExposed]
  }
}

