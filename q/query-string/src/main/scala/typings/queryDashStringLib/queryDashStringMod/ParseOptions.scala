package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
  	 * @default 'none'
  	 *
  	 * - `bracket`: Parse arrays with bracket representation:
  	 *
  	 *
  	 *    queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
  	 *    //=> foo: [1, 2, 3]
  	 *
  	 * - `index`: Parse arrays with index representation:
  	 *
  	 *
  	 *    queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
  	 *    //=> foo: [1, 2, 3]
  	 *
  	 * - `comma`: Parse arrays with elements separated by comma:
  	 *
  	 *
  	 *    queryString.parse('foo=1,2,3', {arrayFormat: 'comma'});
  	 *    //=> foo: [1, 2, 3]
  	 *
  	 * - `none`: Parse arrays with elements using duplicate keys:
  	 *
  	 *
  	 *    queryString.parse('foo=1&foo=2&foo=3');
  	 *    //=> foo: [1, 2, 3]
  	 */
  val arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.comma | queryDashStringLib.queryDashStringLibStrings.none
  ] = js.undefined
  /**
  	 * Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
  	 *
  	 * @default true
  	 */
  val decode: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    arrayFormat: queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.comma | queryDashStringLib.queryDashStringLibStrings.none = null,
    decode: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(decode)) __obj.updateDynamic("decode")(decode)
    __obj.asInstanceOf[ParseOptions]
  }
}

