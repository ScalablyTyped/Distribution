package typings.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import typings.reactDashInstantsearchDashNative.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Native
trait InstantSearchBaseProps extends js.Object {
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var indexName: String
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var resultsState: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[Anon_Args] = js.undefined
  var searchState: js.UndefOr[js.Any] = js.undefined
}

object InstantSearchBaseProps {
  @scala.inline
  def apply(
    indexName: String,
    createURL: /* repeated */ js.Any => _ = null,
    onSearchParameters: /* repeated */ js.Any => _ = null,
    onSearchStateChange: /* repeated */ js.Any => _ = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: Anon_Args = null,
    searchState: js.Any = null
  ): InstantSearchBaseProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1(onSearchParameters))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1(onSearchStateChange))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchBaseProps]
  }
}

