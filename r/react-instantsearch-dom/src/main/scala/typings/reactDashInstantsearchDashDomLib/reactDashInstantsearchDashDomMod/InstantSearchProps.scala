package typings
package reactDashInstantsearchDashDomLib.reactDashInstantsearchDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantSearchProps extends js.Object {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var indexName: java.lang.String
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var resultsState: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[reactDashInstantsearchDashDomLib.Anon_Args] = js.undefined
  var searchClient: js.UndefOr[js.Any] = js.undefined
  var searchState: js.UndefOr[js.Any] = js.undefined
  var stalledSearchDelay: js.UndefOr[scala.Double] = js.undefined
}

object InstantSearchProps {
  @scala.inline
  def apply(
    indexName: java.lang.String,
    apiKey: java.lang.String = null,
    appId: java.lang.String = null,
    createURL: /* repeated */ js.Any => _ = null,
    onSearchParameters: /* repeated */ js.Any => _ = null,
    onSearchStateChange: /* repeated */ js.Any => _ = null,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: reactDashInstantsearchDashDomLib.Anon_Args = null,
    searchClient: js.Any = null,
    searchState: js.Any = null,
    stalledSearchDelay: scala.Int | scala.Double = null
  ): InstantSearchProps = {
    val __obj = js.Dynamic.literal(indexName = indexName)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1(onSearchParameters))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1(onSearchStateChange))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState)
    if (root != null) __obj.updateDynamic("root")(root)
    if (searchClient != null) __obj.updateDynamic("searchClient")(searchClient)
    if (searchState != null) __obj.updateDynamic("searchState")(searchState)
    if (stalledSearchDelay != null) __obj.updateDynamic("stalledSearchDelay")(stalledSearchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
}

