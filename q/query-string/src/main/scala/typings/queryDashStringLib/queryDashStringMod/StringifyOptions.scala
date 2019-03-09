package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  /**
  	 * Supports both `index` for an indexed array representation or `bracket` for a *bracketed* array representation.
  	 *
  	 * @default 'none'
  	 *
  	 * - `bracket`: stands for parsing correctly arrays with bracket representation on the query string, such as:
  	 *
  	 *
  	 *    queryString.stringify({foo: [1,2,3]}, {arrayFormat: 'bracket'});
  	 *    // => foo[]=1&foo[]=2&foo[]=3
  	 *
  	 * - `index`: stands for parsing taking the index into account, such as:
  	 *
  	 *
  	 *    queryString.stringify({foo: [1,2,3]}, {arrayFormat: 'index'});
  	 *    // => foo[0]=1&foo[1]=2&foo[3]=3
  	 *
  	 * - `none`: is the **default** option and removes any bracket representation, such as:
  	 *
  	 *
  	 *    queryString.stringify({foo: [1,2,3]});
  	 *    // => foo=1&foo=2&foo=3
  	 */
  val arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none
  ] = js.undefined
  /**
  	 * [URL encode](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) the keys and values.
  	 *
  	 * @default true
  	 */
  val encode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Supports both `Function` as a custom sorting function or `false` to disable sorting.
  	 *
  	 * If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
  	 *
  	 * @example
  	 *
  	 * const order = ['c', 'a', 'b'];
  	 * queryString.stringify({ a: 1, b: 2, c: 3}, {
  	 *     sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
  	 * });
  	 * // => 'c=3&a=1&b=2'
  	 *
  	 * queryString.stringify({ b: 1, c: 2, a: 3}, {sort: false});
  	 * // => 'b=1&c=2&a=3'
  	 */
  val sort: js.UndefOr[
    (js.Function2[/* itemLeft */ java.lang.String, /* itemRight */ java.lang.String, scala.Double]) | queryDashStringLib.queryDashStringLibNumbers.`false`
  ] = js.undefined
  /**
  	 * Strictly encode URI components with [`strict-uri-encode`](https://github.com/kevva/strict-uri-encode). It uses [`encodeURIComponent`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) if set to `false`. You probably [don't care](https://github.com/sindresorhus/query-string/issues/42) about this option.
  	 *
  	 * @default true
  	 */
  val strict: js.UndefOr[scala.Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(
    arrayFormat: queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none = null,
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    sort: (js.Function2[/* itemLeft */ java.lang.String, /* itemRight */ java.lang.String, scala.Double]) | queryDashStringLib.queryDashStringLibNumbers.`false` = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[StringifyOptions]
  }
}

