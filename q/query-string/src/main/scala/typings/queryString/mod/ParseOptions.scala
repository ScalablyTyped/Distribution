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
trait ParseOptions extends js.Object {
  
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
  val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.native
  
  /**
  	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
  	@default ,
  	*/
  val arrayFormatSeparator: js.UndefOr[String] = js.native
  
  /**
  	Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
  	@default true
  	*/
  val decode: js.UndefOr[Boolean] = js.native
  
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
  val parseBooleans: js.UndefOr[Boolean] = js.native
  
  /**
  	Parse the fragment identifier from the URL and add it to result object.
  	@default false
  	@example
  	```
  	import queryString = require('query-string');
  	queryString.parseUrl('https://foo.bar?foo=bar#xyz', {parseFragmentIdentifier: true});
  	//=> {url: 'https://foo.bar', query: {foo: 'bar'}, fragmentIdentifier: 'xyz'}
  	```
  	*/
  val parseFragmentIdentifier: js.UndefOr[Boolean] = js.native
  
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
  val parseNumbers: js.UndefOr[Boolean] = js.native
  
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
  val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: Boolean): Self = this.set("decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    
    @scala.inline
    def setParseBooleans(value: Boolean): Self = this.set("parseBooleans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseBooleans: Self = this.set("parseBooleans", js.undefined)
    
    @scala.inline
    def setParseFragmentIdentifier(value: Boolean): Self = this.set("parseFragmentIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseFragmentIdentifier: Self = this.set("parseFragmentIdentifier", js.undefined)
    
    @scala.inline
    def setParseNumbers(value: Boolean): Self = this.set("parseNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseNumbers: Self = this.set("parseNumbers", js.undefined)
    
    @scala.inline
    def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
