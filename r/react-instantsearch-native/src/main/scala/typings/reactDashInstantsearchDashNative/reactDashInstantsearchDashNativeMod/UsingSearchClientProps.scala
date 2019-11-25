package typings.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import typings.reactDashInstantsearchDashNative.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsingSearchClientProps
  extends InstantSearchBaseProps
     with InstantSearchProps {
  var searchClient: js.Any
}

object UsingSearchClientProps {
  @scala.inline
  def apply(
    indexName: String,
    searchClient: js.Any,
    createURL: /* repeated */ js.Any => _ = null,
    onSearchParameters: /* repeated */ js.Any => _ = null,
    onSearchStateChange: /* repeated */ js.Any => _ = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: Anon_Args = null,
    searchState: js.Any = null
  ): UsingSearchClientProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1(createURL))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1(onSearchParameters))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1(onSearchStateChange))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsingSearchClientProps]
  }
}

