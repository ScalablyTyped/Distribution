package typings.queryString

import org.scalablytyped.runtime.StringDictionary
import typings.queryString.anon.parseBooleanstrueParseOpt
import typings.queryString.anon.parseBooleanstrueparseNum
import typings.queryString.anon.parseNumberstrueParseOpti
import typings.queryString.queryStringBooleans.`false`
import typings.queryString.queryStringStrings.bracket
import typings.queryString.queryStringStrings.comma
import typings.queryString.queryStringStrings.index
import typings.queryString.queryStringStrings.none
import typings.queryString.queryStringStrings.separator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("query-string", "extract")
  @js.native
  def extract(url: String): String = js.native
  
  @JSImport("query-string", "parse")
  @js.native
  def parse(query: String): ParsedQuery[String] = js.native
  @JSImport("query-string", "parse")
  @js.native
  def parse(query: String, options: parseBooleanstrueParseOpt): ParsedQuery[String | Boolean] = js.native
  @JSImport("query-string", "parse")
  @js.native
  def parse(query: String, options: parseBooleanstrueparseNum): ParsedQuery[String | Boolean | Double] = js.native
  @JSImport("query-string", "parse")
  @js.native
  def parse(query: String, options: parseNumberstrueParseOpti): ParsedQuery[String | Double] = js.native
  @JSImport("query-string", "parse")
  @js.native
  def parse(query: String, options: ParseOptions): ParsedQuery[String] = js.native
  
  @JSImport("query-string", "parseUrl")
  @js.native
  def parseUrl(url: String): ParsedUrl = js.native
  @JSImport("query-string", "parseUrl")
  @js.native
  def parseUrl(url: String, options: ParseOptions): ParsedUrl = js.native
  
  @JSImport("query-string", "stringify")
  @js.native
  def stringify(`object`: StringifiableRecord): String = js.native
  @JSImport("query-string", "stringify")
  @js.native
  def stringify(`object`: StringifiableRecord, options: StringifyOptions): String = js.native
  
  @JSImport("query-string", "stringifyUrl")
  @js.native
  def stringifyUrl(`object`: UrlObject): String = js.native
  @JSImport("query-string", "stringifyUrl")
  @js.native
  def stringifyUrl(`object`: UrlObject, options: StringifyOptions): String = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
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
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: bracket | index | comma | separator | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setParseBooleans(value: Boolean): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseBooleansUndefined: Self = StObject.set(x, "parseBooleans", js.undefined)
      
      @scala.inline
      def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      @scala.inline
      def setParseNumbers(value: Boolean): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseNumbersUndefined: Self = StObject.set(x, "parseNumbers", js.undefined)
      
      @scala.inline
      def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  type ParsedQuery[T] = StringDictionary[T | js.Array[T] | Null]
  
  @js.native
  trait ParsedUrl extends StObject {
    
    /**
    	The fragment identifier of the URL.
    	Present when the `parseFragmentIdentifier` option is `true`.
    	*/
    val fragmentIdentifier: js.UndefOr[String] = js.native
    
    val query: ParsedQuery[String] = js.native
    
    val url: String = js.native
  }
  object ParsedUrl {
    
    @scala.inline
    def apply(query: ParsedQuery[String], url: String): ParsedUrl = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUrl]
    }
    
    @scala.inline
    implicit class ParsedUrlMutableBuilder[Self <: ParsedUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentIdentifierUndefined: Self = StObject.set(x, "fragmentIdentifier", js.undefined)
      
      @scala.inline
      def setQuery(value: ParsedQuery[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Stringifiable = js.UndefOr[String | Boolean | Double | Null]
  
  type StringifiableRecord = Record[String, Stringifiable | js.Array[Stringifiable]]
  
  @js.native
  trait StringifyOptions extends StObject {
    
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
    implicit class StringifyOptionsMutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: bracket | index | comma | separator | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setSkipEmptyString(value: Boolean): Self = StObject.set(x, "skipEmptyString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmptyStringUndefined: Self = StObject.set(x, "skipEmptyString", js.undefined)
      
      @scala.inline
      def setSkipNull(value: Boolean): Self = StObject.set(x, "skipNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNullUndefined: Self = StObject.set(x, "skipNull", js.undefined)
      
      @scala.inline
      def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait UrlObject extends StObject {
    
    /**
    	Overrides the fragment identifier in the `url` property.
    	*/
    val fragmentIdentifier: js.UndefOr[String] = js.native
    
    /**
    	Overrides queries in the `url` property.
    	*/
    val query: StringifiableRecord = js.native
    
    val url: String = js.native
  }
  object UrlObject {
    
    @scala.inline
    def apply(query: StringifiableRecord, url: String): UrlObject = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlObject]
    }
    
    @scala.inline
    implicit class UrlObjectMutableBuilder[Self <: UrlObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentIdentifierUndefined: Self = StObject.set(x, "fragmentIdentifier", js.undefined)
      
      @scala.inline
      def setQuery(value: StringifiableRecord): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
