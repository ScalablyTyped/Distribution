package typings.queryString.mod

import typings.queryString.queryStringBooleans.`false`
import typings.queryString.queryStringStrings.bracket
import typings.queryString.queryStringStrings.comma
import typings.queryString.queryStringStrings.index
import typings.queryString.queryStringStrings.none
import typings.queryString.queryStringStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.native
  
  /**
  	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
  	@default ,
  	*/
  val arrayFormatSeparator: js.UndefOr[String] = js.native
  
  /**
  	[URL encode](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) the keys and values.
  	@default true
  	*/
  val encode: js.UndefOr[Boolean] = js.native
  
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
  val skipEmptyString: js.UndefOr[Boolean] = js.native
  
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
  val skipNull: js.UndefOr[Boolean] = js.native
  
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
  val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.native
  
  /**
  	Strictly encode URI components with [`strict-uri-encode`](https://github.com/kevva/strict-uri-encode). It uses [`encodeURIComponent`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) if set to `false`. You probably [don't care](https://github.com/sindresorhus/query-string/issues/42) about this option.
  	@default true
  	*/
  val strict: js.UndefOr[Boolean] = js.native
}
object StringifyOptions {
  
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayFormat(value: bracket | index | comma | separator | none): Self = this.set("arrayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFormat: Self = this.set("arrayFormat", js.undefined)
    
    @scala.inline
    def setArrayFormatSeparator(value: String): Self = this.set("arrayFormatSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFormatSeparator: Self = this.set("arrayFormatSeparator", js.undefined)
    
    @scala.inline
    def setEncode(value: Boolean): Self = this.set("encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setSkipEmptyString(value: Boolean): Self = this.set("skipEmptyString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyString: Self = this.set("skipEmptyString", js.undefined)
    
    @scala.inline
    def setSkipNull(value: Boolean): Self = this.set("skipNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNull: Self = this.set("skipNull", js.undefined)
    
    @scala.inline
    def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
