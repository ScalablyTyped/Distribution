package typings.qs.qsMod

import typings.qs.qsStrings.RFC1738
import typings.qs.qsStrings.RFC3986
import typings.qs.qsStrings.brackets
import typings.qs.qsStrings.comma
import typings.qs.qsStrings.indices
import typings.qs.qsStrings.repeat
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var arrayFormat: js.UndefOr[indices | brackets | repeat | comma] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var encode: js.UndefOr[Boolean] = js.undefined
  var encodeValuesOnly: js.UndefOr[Boolean] = js.undefined
  var encoder: js.UndefOr[js.Function1[/* str */ String, _]] = js.undefined
  var filter: js.UndefOr[
    (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])
  ] = js.undefined
  var format: js.UndefOr[RFC1738 | RFC3986] = js.undefined
  var indices: js.UndefOr[Boolean] = js.undefined
  var serializeDate: js.UndefOr[js.Function1[/* d */ Date, String]] = js.undefined
  var skipNulls: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
}

object IStringifyOptions {
  @scala.inline
  def apply(
    addQueryPrefix: js.UndefOr[Boolean] = js.undefined,
    allowDots: js.UndefOr[Boolean] = js.undefined,
    arrayFormat: indices | brackets | repeat | comma = null,
    delimiter: String = null,
    encode: js.UndefOr[Boolean] = js.undefined,
    encodeValuesOnly: js.UndefOr[Boolean] = js.undefined,
    encoder: /* str */ String => _ = null,
    filter: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _]) = null,
    format: RFC1738 | RFC3986 = null,
    indices: js.UndefOr[Boolean] = js.undefined,
    serializeDate: /* d */ Date => String = null,
    skipNulls: js.UndefOr[Boolean] = js.undefined,
    sort: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    strictNullHandling: js.UndefOr[Boolean] = js.undefined
  ): IStringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addQueryPrefix)) __obj.updateDynamic("addQueryPrefix")(addQueryPrefix)
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots)
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(encodeValuesOnly)) __obj.updateDynamic("encodeValuesOnly")(encodeValuesOnly)
    if (encoder != null) __obj.updateDynamic("encoder")(js.Any.fromFunction1(encoder))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indices)) __obj.updateDynamic("indices")(indices)
    if (serializeDate != null) __obj.updateDynamic("serializeDate")(js.Any.fromFunction1(serializeDate))
    if (!js.isUndefined(skipNulls)) __obj.updateDynamic("skipNulls")(skipNulls)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling)
    __obj.asInstanceOf[IStringifyOptions]
  }
}

