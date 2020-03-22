package typings.queryString

import typings.queryString.queryStringBooleans.`false`
import typings.queryString.queryStringBooleans.`true`
import typings.queryString.queryStringStrings.bracket
import typings.queryString.queryStringStrings.comma
import typings.queryString.queryStringStrings.index
import typings.queryString.queryStringStrings.none
import typings.queryString.queryStringStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  parseBooleans  :true,   parseNumbers  :true} & query-string.query-string.ParseOptions */
trait parseBooleanstrueparseNum extends js.Object {
  /**
  	@default 'none'
  	- `bracket`: Parse arrays with bracket representation:
  		```
  		import queryString = require('query-string');
  		queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `index`: Parse arrays with index representation:
  		```
  		import queryString = require('query-string');
  		queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `comma`: Parse arrays with elements separated by comma:
  		```
  		import queryString = require('query-string');
  		queryString.parse('foo=1,2,3', {arrayFormat: 'comma'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `separator`: Parse arrays with elements separated by a custom character:
  		```
  		import queryString = require('query-string');
  		queryString.parse('foo=1|2|3', {arrayFormat: 'separator', arrayFormatSeparator: '|'});
  		//=> {foo: ['1', '2', '3']}
  		```
  	- `none`: Parse arrays with elements using duplicate keys:
  		```
  		import queryString = require('query-string');
  		queryString.parse('foo=1&foo=2&foo=3');
  		//=> {foo: ['1', '2', '3']}
  		```
  	*/
  val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.undefined
  /**
  	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
  	@default ,
  	*/
  val arrayFormatSeparator: js.UndefOr[String] = js.undefined
  /**
  	Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
  	@default true
  	*/
  val decode: js.UndefOr[Boolean] = js.undefined
  /**
  	Parse the value as a boolean type instead of string type if it's a boolean.
  	@default false
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.parse('foo=true', {parseBooleans: true});
  	//=> {foo: true}
  	```
  	*/
  var parseBooleans: js.UndefOr[`true` with Boolean] = js.undefined
  /**
  	Parse the value as a number type instead of string type if it's a number.
  	@default false
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.parse('foo=1', {parseNumbers: true});
  	//=> {foo: 1}
  	```
  	*/
  var parseNumbers: js.UndefOr[`true` with Boolean] = js.undefined
  /**
  	Supports both `Function` as a custom sorting function or `false` to disable sorting.
  	If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
  	@default true
  	@example
  	```
  	import queryString = require('query-string');
  	const order = ['c', 'a', 'b'];
  	queryString.parse('?a=one&b=two&c=three', {
  		sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
  	});
  	//=> {c: 'three', a: 'one', b: 'two'}
  	```
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.parse('?a=one&c=three&b=two', {sort: false});
  	//=> {a: 'one', c: 'three', b: 'two'}
  	```
  	*/
  val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.undefined
}

object parseBooleanstrueparseNum {
  @scala.inline
  def apply(
    arrayFormat: bracket | index | comma | separator | none = null,
    arrayFormatSeparator: String = null,
    decode: js.UndefOr[Boolean] = js.undefined,
    parseBooleans: js.UndefOr[`true` with Boolean] = js.undefined,
    parseNumbers: js.UndefOr[`true` with Boolean] = js.undefined,
    sort: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false` = null
  ): parseBooleanstrueparseNum = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (arrayFormatSeparator != null) __obj.updateDynamic("arrayFormatSeparator")(arrayFormatSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(decode)) __obj.updateDynamic("decode")(decode.asInstanceOf[js.Any])
    if (!js.isUndefined(parseBooleans)) __obj.updateDynamic("parseBooleans")(parseBooleans.asInstanceOf[js.Any])
    if (!js.isUndefined(parseNumbers)) __obj.updateDynamic("parseNumbers")(parseNumbers.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseBooleanstrueparseNum]
  }
}

