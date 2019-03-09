package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
  	 * Supports both `index` for an indexed array representation or `bracket` for a *bracketed* array representation.
  	 *
  	 * @default 'none'
  	 *
  	 * - `bracket`: stands for parsing correctly arrays with bracket representation on the query string, such as:
  	 *
  	 *
  	 *    queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
  	 *    //=> foo: [1,2,3]
  	 *
  	 * - `index`: stands for parsing taking the index into account, such as:
  	 *
  	 *
  	 *    queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
  	 *    //=> foo: [1,2,3]
  	 *
  	 * - `none`: is the **default** option and removes any bracket representation, such as:
  	 *
  	 *
  	 *    queryString.parse('foo=1&foo=2&foo=3');
  	 *    //=> foo: [1,2,3]
  	 */
  val arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none
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
    arrayFormat: queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none = null,
    decode: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(decode)) __obj.updateDynamic("decode")(decode)
    __obj.asInstanceOf[ParseOptions]
  }
}

