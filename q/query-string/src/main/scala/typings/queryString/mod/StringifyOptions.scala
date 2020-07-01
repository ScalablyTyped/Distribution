package typings.queryString.mod

import typings.queryString.queryStringBooleans.`false`
import typings.queryString.queryStringStrings.bracket
import typings.queryString.queryStringStrings.comma
import typings.queryString.queryStringStrings.index
import typings.queryString.queryStringStrings.none
import typings.queryString.queryStringStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  /**
  	@default 'none'
  	- `bracket`: Serialize arrays using bracket representation:
  		```
  		import queryString = require('query-string');
  		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'bracket'});
  		//=> 'foo[]=1&foo[]=2&foo[]=3'
  		```
  	- `index`: Serialize arrays using index representation:
  		```
  		import queryString = require('query-string');
  		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'index'});
  		//=> 'foo[0]=1&foo[1]=2&foo[2]=3'
  		```
  	- `comma`: Serialize arrays by separating elements with comma:
  		```
  		import queryString = require('query-string');
  		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'comma'});
  		//=> 'foo=1,2,3'
  		```
    - `separator`: Serialize arrays by separating elements with character:
  		```
  		import queryString = require('query-string');
  		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'separator', arrayFormatSeparator: '|'});
  		//=> 'foo=1|2|3'
  		```
  	- `none`: Serialize arrays by using duplicate keys:
  		```
  		import queryString = require('query-string');
  		queryString.stringify({foo: [1, 2, 3]});
  		//=> 'foo=1&foo=2&foo=3'
  		```
  	*/
  val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.undefined
  /**
  	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
  	@default ,
  	*/
  val arrayFormatSeparator: js.UndefOr[String] = js.undefined
  /**
  	[URL encode](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) the keys and values.
  	@default true
  	*/
  val encode: js.UndefOr[Boolean] = js.undefined
  /**
  	Skip keys with an empty string as the value.
  	@default false
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.stringify({a: 1, b: '', c: '', d: 4}, {
  		skipEmptyString: true
  	});
  	//=> 'a=1&d=4'
  	```
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.stringify({a: '', b: ''}, {
  		skipEmptyString: true
  	});
  	//=> ''
  	```
  	*/
  val skipEmptyString: js.UndefOr[Boolean] = js.undefined
  /**
  	Skip keys with `null` as the value.
  	Note that keys with `undefined` as the value are always skipped.
  	@default false
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.stringify({a: 1, b: undefined, c: null, d: 4}, {
  		skipNull: true
  	});
  	//=> 'a=1&d=4'
  	queryString.stringify({a: undefined, b: null}, {
  		skipNull: true
  	});
  	//=> ''
  	```
  	*/
  val skipNull: js.UndefOr[Boolean] = js.undefined
  /**
  	Supports both `Function` as a custom sorting function or `false` to disable sorting.
  	If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
  	@default true
  	@example
  	```
  	import queryString = require('query-string');
  	const order = ['c', 'a', 'b'];
  	queryString.stringify({a: 1, b: 2, c: 3}, {
  		sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
  	});
  	//=> 'c=3&a=1&b=2'
  	```
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.stringify({b: 1, c: 2, a: 3}, {sort: false});
  	//=> 'b=1&c=2&a=3'
  	```
  	*/
  val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.undefined
  /**
  	Strictly encode URI components with [`strict-uri-encode`](https://github.com/kevva/strict-uri-encode). It uses [`encodeURIComponent`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) if set to `false`. You probably [don't care](https://github.com/sindresorhus/query-string/issues/42) about this option.
  	@default true
  	*/
  val strict: js.UndefOr[Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(
    arrayFormat: bracket | index | comma | separator | none = null,
    arrayFormatSeparator: String = null,
    encode: js.UndefOr[Boolean] = js.undefined,
    skipEmptyString: js.UndefOr[Boolean] = js.undefined,
    skipNull: js.UndefOr[Boolean] = js.undefined,
    sort: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false` = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (arrayFormatSeparator != null) __obj.updateDynamic("arrayFormatSeparator")(arrayFormatSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyString)) __obj.updateDynamic("skipEmptyString")(skipEmptyString.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipNull)) __obj.updateDynamic("skipNull")(skipNull.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
}

