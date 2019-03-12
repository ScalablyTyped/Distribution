package typings
package reactDashInstantsearchDashNativeLib.reactDashInstantsearchDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantSearchProps extends js.Object {
  var algoliaClient: js.UndefOr[js.Any] = js.undefined
  var apiKey: java.lang.String
  var appId: java.lang.String
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var indexName: java.lang.String
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var resultsState: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[reactDashInstantsearchDashNativeLib.Anon_Args] = js.undefined
  var searchClient: js.UndefOr[js.Any] = js.undefined
  var searchState: js.UndefOr[js.Any] = js.undefined
}

object InstantSearchProps {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    appId: java.lang.String,
    indexName: java.lang.String,
    algoliaClient: js.Any = null,
    createURL: /* repeated */ js.Any => _ = null,
    onSearchParameters: /* repeated */ js.Any => _ = null,
    onSearchStateChange: /* repeated */ js.Any => _ = null,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: reactDashInstantsearchDashNativeLib.Anon_Args = null,
    searchClient: js.Any = null,
    searchState: js.Any = null
  ): InstantSearchProps = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, appId = appId, indexName = indexName)
    if (algoliaClient != null) __obj.updateDynamic("algoliaClient")(algoliaClient)
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1(onSearchParameters))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1(onSearchStateChange))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState)
    if (root != null) __obj.updateDynamic("root")(root)
    if (searchClient != null) __obj.updateDynamic("searchClient")(searchClient)
    if (searchState != null) __obj.updateDynamic("searchState")(searchState)
    __obj.asInstanceOf[InstantSearchProps]
  }
}

