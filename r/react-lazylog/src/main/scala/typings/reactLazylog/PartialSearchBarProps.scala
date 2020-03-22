package typings.reactLazylog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/SearchBar.SearchBarProps> */
trait PartialSearchBarProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterActive: js.UndefOr[Boolean] = js.undefined
  var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.undefined
  var resultsCount: js.UndefOr[Double] = js.undefined
}

object PartialSearchBarProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterActive: js.UndefOr[Boolean] = js.undefined,
    onClearSearch: () => Unit = null,
    onFilterLinesWithMatches: /* isFiltered */ Boolean => Unit = null,
    onSearch: /* keyword */ String => Unit = null,
    resultsCount: Int | Double = null
  ): PartialSearchBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(filterActive)) __obj.updateDynamic("filterActive")(filterActive.asInstanceOf[js.Any])
    if (onClearSearch != null) __obj.updateDynamic("onClearSearch")(js.Any.fromFunction0(onClearSearch))
    if (onFilterLinesWithMatches != null) __obj.updateDynamic("onFilterLinesWithMatches")(js.Any.fromFunction1(onFilterLinesWithMatches))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (resultsCount != null) __obj.updateDynamic("resultsCount")(resultsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSearchBarProps]
  }
}

