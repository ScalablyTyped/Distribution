package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import typings.reactDashInstantsearchDashDom.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantSearchProps extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var indexName: String
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var resultsState: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[Anon_Args] = js.undefined
  var searchClient: js.UndefOr[js.Any] = js.undefined
  var searchState: js.UndefOr[js.Any] = js.undefined
  var stalledSearchDelay: js.UndefOr[Double] = js.undefined
}

object InstantSearchProps {
  @scala.inline
  def apply(
    indexName: String,
    apiKey: String = null,
    appId: String = null,
    createURL: /* repeated */ js.Any => _ = null,
    onSearchParameters: /* repeated */ js.Any => _ = null,
    onSearchStateChange: /* repeated */ js.Any => _ = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: Anon_Args = null,
    searchClient: js.Any = null,
    searchState: js.Any = null,
    stalledSearchDelay: Int | Double = null
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

