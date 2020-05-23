package typings.qs.mod

import typings.qs.qsStrings.RFC1738
import typings.qs.qsStrings.RFC3986
import typings.qs.qsStrings.`iso-8859-1`
import typings.qs.qsStrings.`utf-8`
import typings.qs.qsStrings.brackets
import typings.qs.qsStrings.comma
import typings.qs.qsStrings.indices
import typings.qs.qsStrings.key
import typings.qs.qsStrings.repeat
import typings.qs.qsStrings.value
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var arrayFormat: js.UndefOr[indices | brackets | repeat | comma] = js.undefined
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.undefined
  var charsetSentinel: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var encode: js.UndefOr[Boolean] = js.undefined
  var encodeValuesOnly: js.UndefOr[Boolean] = js.undefined
  var encoder: js.UndefOr[
    js.Function4[
      /* str */ js.Any, 
      /* defaultEncoder */ defaultEncoder, 
      /* charset */ String, 
      /* type */ key | value, 
      String
    ]
  ] = js.undefined
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
    charset: `utf-8` | `iso-8859-1` = null,
    charsetSentinel: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    encode: js.UndefOr[Boolean] = js.undefined,
    encodeValuesOnly: js.UndefOr[Boolean] = js.undefined,
    encoder: (/* str */ js.Any, /* defaultEncoder */ defaultEncoder, /* charset */ String, /* type */ key | value) => String = null,
    filter: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _]) = null,
    format: RFC1738 | RFC3986 = null,
    indices: js.UndefOr[Boolean] = js.undefined,
    serializeDate: /* d */ Date => String = null,
    skipNulls: js.UndefOr[Boolean] = js.undefined,
    sort: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    strictNullHandling: js.UndefOr[Boolean] = js.undefined
  ): IStringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addQueryPrefix)) __obj.updateDynamic("addQueryPrefix")(addQueryPrefix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots.get.asInstanceOf[js.Any])
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(charsetSentinel)) __obj.updateDynamic("charsetSentinel")(charsetSentinel.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeValuesOnly)) __obj.updateDynamic("encodeValuesOnly")(encodeValuesOnly.get.asInstanceOf[js.Any])
    if (encoder != null) __obj.updateDynamic("encoder")(js.Any.fromFunction4(encoder))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indices)) __obj.updateDynamic("indices")(indices.get.asInstanceOf[js.Any])
    if (serializeDate != null) __obj.updateDynamic("serializeDate")(js.Any.fromFunction1(serializeDate))
    if (!js.isUndefined(skipNulls)) __obj.updateDynamic("skipNulls")(skipNulls.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringifyOptions]
  }
}

