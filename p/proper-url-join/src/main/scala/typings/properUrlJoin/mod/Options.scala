package typings.properUrlJoin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.queryString.mod.StringifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Add a leading slash.
    *
    * **Default**: `true`
    */
  var leadingSlash: js.UndefOr[Boolean] = js.undefined
  /**
    * Protocol relative URLs.
    *
    * **Default**: `false`
    */
  var protocolRelative: js.UndefOr[Boolean] = js.undefined
  /**
    * Query string object that will be properly stringified and appended to the url.
    * It will be merged with the query string in the url, if it exists.
    */
  var query: js.UndefOr[StringDictionary[String | Double | (js.Array[String | Double])]] = js.undefined
  /**
    * [query-string](https://github.com/sindresorhus/query-string#stringifyobject-options) singify method options to be considered when stringifying the query.
    */
  var queryOptions: js.UndefOr[StringifyOptions] = js.undefined
  /**
    * Add a trailing slash.
    *
    * **Default**: `false`
    */
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    leadingSlash: js.UndefOr[Boolean] = js.undefined,
    protocolRelative: js.UndefOr[Boolean] = js.undefined,
    query: StringDictionary[String | Double | (js.Array[String | Double])] = null,
    queryOptions: StringifyOptions = null,
    trailingSlash: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leadingSlash)) __obj.updateDynamic("leadingSlash")(leadingSlash.asInstanceOf[js.Any])
    if (!js.isUndefined(protocolRelative)) __obj.updateDynamic("protocolRelative")(protocolRelative.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(trailingSlash)) __obj.updateDynamic("trailingSlash")(trailingSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

