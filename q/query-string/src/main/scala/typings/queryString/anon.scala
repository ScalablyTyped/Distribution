package typings.queryString

import typings.queryString.queryStringBooleans.`false`
import typings.queryString.queryStringBooleans.`true`
import typings.queryString.queryStringStrings.`bracket-separator`
import typings.queryString.queryStringStrings.`colon-list-separator`
import typings.queryString.queryStringStrings.bracket
import typings.queryString.queryStringStrings.comma
import typings.queryString.queryStringStrings.index
import typings.queryString.queryStringStrings.none
import typings.queryString.queryStringStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  parseBooleans :true} & query-string.query-string.ParseOptions */
  trait parseBooleanstrueParseOpt extends StObject {
    
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
    	- `bracket-separator`: Parse arrays (that are explicitly marked with brackets) with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: []}
    		queryString.parse('foo[]=', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['']}
    		queryString.parse('foo[]=1', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    	 	//=> {foo: ['1']}
    		queryString.parse('foo[]=1|2|3', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		queryString.parse('foo[]=1||3|||6', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '', 3, '', '', '6']}
    		queryString.parse('foo[]=1|2|3&bar=fluffy&baz[]=4', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3'], bar: 'fluffy', baz:['4']}
    		```
    	- `colon-list-separator`: Parse arrays with parameter names that are explicitly marked with `:list`:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo:list=one&foo:list=two', {arrayFormat: 'colon-list-separator'});
    		//=> {foo: ['one', 'two']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
    val arrayFormat: js.UndefOr[
        bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none
      ] = js.undefined
    
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
    var parseBooleans: `true`
    
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
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.undefined
    
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
    val parseNumbers: js.UndefOr[Boolean] = js.undefined
    
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
  object parseBooleanstrueParseOpt {
    
    inline def apply(): parseBooleanstrueParseOpt = {
      val __obj = js.Dynamic.literal(parseBooleans = true)
      __obj.asInstanceOf[parseBooleanstrueParseOpt]
    }
    
    extension [Self <: parseBooleanstrueParseOpt](x: Self) {
      
      inline def setArrayFormat(value: bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setParseBooleans(value: `true`): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      inline def setParseNumbers(value: Boolean): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      inline def setParseNumbersUndefined: Self = StObject.set(x, "parseNumbers", js.undefined)
      
      inline def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  /* Inlined {  parseBooleans :true} & query-string.query-string.ParseOptions & query-string.query-string.StringifyOptions */
  trait parseBooleanstrueParseOptArrayFormat extends StObject {
    
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
    	- `bracket-separator`: Parse arrays (that are explicitly marked with brackets) with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: []}
    		queryString.parse('foo[]=', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['']}
    		queryString.parse('foo[]=1', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    	 	//=> {foo: ['1']}
    		queryString.parse('foo[]=1|2|3', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		queryString.parse('foo[]=1||3|||6', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '', 3, '', '', '6']}
    		queryString.parse('foo[]=1|2|3&bar=fluffy&baz[]=4', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3'], bar: 'fluffy', baz:['4']}
    		```
    	- `colon-list-separator`: Parse arrays with parameter names that are explicitly marked with `:list`:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo:list=one&foo:list=two', {arrayFormat: 'colon-list-separator'});
    		//=> {foo: ['one', 'two']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
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
    		queryString.stringify({foo: [1, null, '']}, {arrayFormat: 'comma'});
    		//=> 'foo=1,,'
    		// Note that typing information for null values is lost
    		// and `.parse('foo=1,,')` would return `{foo: [1, '', '']}`.
    		```
    	- `separator`: Serialize arrays by separating elements with character:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'separator', arrayFormatSeparator: '|'});
    		//=> 'foo=1|2|3'
    		```
    	- `bracket-separator`: Serialize arrays by explicitly post-fixing array names with brackets and separating elements with a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: []}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]'
    		queryString.stringify({foo: ['']}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]='
    		queryString.stringify({foo: [1]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1'
    		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1|2|3'
    		queryString.stringify({foo: [1, '', 3, null, null, 6]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1||3|||6'
    		queryString.stringify({foo: [1, '', 3, null, null, 6]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|', skipNull: true});
    		//=> 'foo[]=1||3|6'
    		queryString.stringify({foo: [1, 2, 3], bar: 'fluffy', baz: [4]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1|2|3&bar=fluffy&baz[]=4'
    		```
    	- `colon-list-separator`: Serialize arrays with parameter names that are explicitly marked with `:list`:
    		```js
    		import queryString = require('query-string');
    		queryString.stringify({foo: ['one', 'two']}, {arrayFormat: 'colon-list-separator'});
    		//=> 'foo:list=one&foo:list=two'
    		```
    	- `none`: Serialize arrays by using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: [1, 2, 3]});
    		//=> 'foo=1&foo=2&foo=3'
    		```
    	*/
    val arrayFormat: js.UndefOr[
        bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none
      ] = js.undefined
    
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
    	[URL encode](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) the keys and values.
    	@default true
    	*/
    val encode: js.UndefOr[Boolean] = js.undefined
    
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
    var parseBooleans: `true`
    
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
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.undefined
    
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
    val parseNumbers: js.UndefOr[Boolean] = js.undefined
    
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
  object parseBooleanstrueParseOptArrayFormat {
    
    inline def apply(): parseBooleanstrueParseOptArrayFormat = {
      val __obj = js.Dynamic.literal(parseBooleans = true)
      __obj.asInstanceOf[parseBooleanstrueParseOptArrayFormat]
    }
    
    extension [Self <: parseBooleanstrueParseOptArrayFormat](x: Self) {
      
      inline def setArrayFormat(value: bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setParseBooleans(value: `true`): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      inline def setParseNumbers(value: Boolean): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      inline def setParseNumbersUndefined: Self = StObject.set(x, "parseNumbers", js.undefined)
      
      inline def setSkipEmptyString(value: Boolean): Self = StObject.set(x, "skipEmptyString", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyStringUndefined: Self = StObject.set(x, "skipEmptyString", js.undefined)
      
      inline def setSkipNull(value: Boolean): Self = StObject.set(x, "skipNull", value.asInstanceOf[js.Any])
      
      inline def setSkipNullUndefined: Self = StObject.set(x, "skipNull", js.undefined)
      
      inline def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /* Inlined {  parseBooleans :true,   parseNumbers :true} & query-string.query-string.ParseOptions */
  trait parseBooleanstrueparseNum extends StObject {
    
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
    	- `bracket-separator`: Parse arrays (that are explicitly marked with brackets) with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: []}
    		queryString.parse('foo[]=', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['']}
    		queryString.parse('foo[]=1', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    	 	//=> {foo: ['1']}
    		queryString.parse('foo[]=1|2|3', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		queryString.parse('foo[]=1||3|||6', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '', 3, '', '', '6']}
    		queryString.parse('foo[]=1|2|3&bar=fluffy&baz[]=4', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3'], bar: 'fluffy', baz:['4']}
    		```
    	- `colon-list-separator`: Parse arrays with parameter names that are explicitly marked with `:list`:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo:list=one&foo:list=two', {arrayFormat: 'colon-list-separator'});
    		//=> {foo: ['one', 'two']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
    val arrayFormat: js.UndefOr[
        bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none
      ] = js.undefined
    
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
    var parseBooleans: `true`
    
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
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.undefined
    
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
    var parseNumbers: `true`
    
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
    
    inline def apply(): parseBooleanstrueparseNum = {
      val __obj = js.Dynamic.literal(parseBooleans = true, parseNumbers = true)
      __obj.asInstanceOf[parseBooleanstrueparseNum]
    }
    
    extension [Self <: parseBooleanstrueparseNum](x: Self) {
      
      inline def setArrayFormat(value: bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setParseBooleans(value: `true`): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      inline def setParseNumbers(value: `true`): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      inline def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  /* Inlined {  parseBooleans :true,   parseNumbers :true} & query-string.query-string.ParseOptions & query-string.query-string.StringifyOptions */
  trait parseBooleanstrueparseNumArrayFormat extends StObject {
    
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
    	- `bracket-separator`: Parse arrays (that are explicitly marked with brackets) with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: []}
    		queryString.parse('foo[]=', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['']}
    		queryString.parse('foo[]=1', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    	 	//=> {foo: ['1']}
    		queryString.parse('foo[]=1|2|3', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		queryString.parse('foo[]=1||3|||6', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '', 3, '', '', '6']}
    		queryString.parse('foo[]=1|2|3&bar=fluffy&baz[]=4', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3'], bar: 'fluffy', baz:['4']}
    		```
    	- `colon-list-separator`: Parse arrays with parameter names that are explicitly marked with `:list`:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo:list=one&foo:list=two', {arrayFormat: 'colon-list-separator'});
    		//=> {foo: ['one', 'two']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
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
    		queryString.stringify({foo: [1, null, '']}, {arrayFormat: 'comma'});
    		//=> 'foo=1,,'
    		// Note that typing information for null values is lost
    		// and `.parse('foo=1,,')` would return `{foo: [1, '', '']}`.
    		```
    	- `separator`: Serialize arrays by separating elements with character:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'separator', arrayFormatSeparator: '|'});
    		//=> 'foo=1|2|3'
    		```
    	- `bracket-separator`: Serialize arrays by explicitly post-fixing array names with brackets and separating elements with a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: []}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]'
    		queryString.stringify({foo: ['']}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]='
    		queryString.stringify({foo: [1]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1'
    		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1|2|3'
    		queryString.stringify({foo: [1, '', 3, null, null, 6]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1||3|||6'
    		queryString.stringify({foo: [1, '', 3, null, null, 6]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|', skipNull: true});
    		//=> 'foo[]=1||3|6'
    		queryString.stringify({foo: [1, 2, 3], bar: 'fluffy', baz: [4]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1|2|3&bar=fluffy&baz[]=4'
    		```
    	- `colon-list-separator`: Serialize arrays with parameter names that are explicitly marked with `:list`:
    		```js
    		import queryString = require('query-string');
    		queryString.stringify({foo: ['one', 'two']}, {arrayFormat: 'colon-list-separator'});
    		//=> 'foo:list=one&foo:list=two'
    		```
    	- `none`: Serialize arrays by using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: [1, 2, 3]});
    		//=> 'foo=1&foo=2&foo=3'
    		```
    	*/
    val arrayFormat: js.UndefOr[
        bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none
      ] = js.undefined
    
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
    	[URL encode](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) the keys and values.
    	@default true
    	*/
    val encode: js.UndefOr[Boolean] = js.undefined
    
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
    var parseBooleans: `true`
    
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
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.undefined
    
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
    var parseNumbers: `true`
    
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
  object parseBooleanstrueparseNumArrayFormat {
    
    inline def apply(): parseBooleanstrueparseNumArrayFormat = {
      val __obj = js.Dynamic.literal(parseBooleans = true, parseNumbers = true)
      __obj.asInstanceOf[parseBooleanstrueparseNumArrayFormat]
    }
    
    extension [Self <: parseBooleanstrueparseNumArrayFormat](x: Self) {
      
      inline def setArrayFormat(value: bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setParseBooleans(value: `true`): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      inline def setParseNumbers(value: `true`): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyString(value: Boolean): Self = StObject.set(x, "skipEmptyString", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyStringUndefined: Self = StObject.set(x, "skipEmptyString", js.undefined)
      
      inline def setSkipNull(value: Boolean): Self = StObject.set(x, "skipNull", value.asInstanceOf[js.Any])
      
      inline def setSkipNullUndefined: Self = StObject.set(x, "skipNull", js.undefined)
      
      inline def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /* Inlined {  parseNumbers :true} & query-string.query-string.ParseOptions */
  trait parseNumberstrueParseOpti extends StObject {
    
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
    	- `bracket-separator`: Parse arrays (that are explicitly marked with brackets) with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: []}
    		queryString.parse('foo[]=', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['']}
    		queryString.parse('foo[]=1', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    	 	//=> {foo: ['1']}
    		queryString.parse('foo[]=1|2|3', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		queryString.parse('foo[]=1||3|||6', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '', 3, '', '', '6']}
    		queryString.parse('foo[]=1|2|3&bar=fluffy&baz[]=4', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3'], bar: 'fluffy', baz:['4']}
    		```
    	- `colon-list-separator`: Parse arrays with parameter names that are explicitly marked with `:list`:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo:list=one&foo:list=two', {arrayFormat: 'colon-list-separator'});
    		//=> {foo: ['one', 'two']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
    val arrayFormat: js.UndefOr[
        bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none
      ] = js.undefined
    
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
    val parseBooleans: js.UndefOr[Boolean] = js.undefined
    
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
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.undefined
    
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
    var parseNumbers: `true`
    
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
  object parseNumberstrueParseOpti {
    
    inline def apply(): parseNumberstrueParseOpti = {
      val __obj = js.Dynamic.literal(parseNumbers = true)
      __obj.asInstanceOf[parseNumberstrueParseOpti]
    }
    
    extension [Self <: parseNumberstrueParseOpti](x: Self) {
      
      inline def setArrayFormat(value: bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setParseBooleans(value: Boolean): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      inline def setParseBooleansUndefined: Self = StObject.set(x, "parseBooleans", js.undefined)
      
      inline def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      inline def setParseNumbers(value: `true`): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      inline def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  /* Inlined {  parseNumbers :true} & query-string.query-string.ParseOptions & query-string.query-string.StringifyOptions */
  trait parseNumberstrueParseOptiArrayFormat extends StObject {
    
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
    	- `bracket-separator`: Parse arrays (that are explicitly marked with brackets) with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: []}
    		queryString.parse('foo[]=', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['']}
    		queryString.parse('foo[]=1', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    	 	//=> {foo: ['1']}
    		queryString.parse('foo[]=1|2|3', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		queryString.parse('foo[]=1||3|||6', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '', 3, '', '', '6']}
    		queryString.parse('foo[]=1|2|3&bar=fluffy&baz[]=4', {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3'], bar: 'fluffy', baz:['4']}
    		```
    	- `colon-list-separator`: Parse arrays with parameter names that are explicitly marked with `:list`:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo:list=one&foo:list=two', {arrayFormat: 'colon-list-separator'});
    		//=> {foo: ['one', 'two']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
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
    		queryString.stringify({foo: [1, null, '']}, {arrayFormat: 'comma'});
    		//=> 'foo=1,,'
    		// Note that typing information for null values is lost
    		// and `.parse('foo=1,,')` would return `{foo: [1, '', '']}`.
    		```
    	- `separator`: Serialize arrays by separating elements with character:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'separator', arrayFormatSeparator: '|'});
    		//=> 'foo=1|2|3'
    		```
    	- `bracket-separator`: Serialize arrays by explicitly post-fixing array names with brackets and separating elements with a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: []}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]'
    		queryString.stringify({foo: ['']}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]='
    		queryString.stringify({foo: [1]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1'
    		queryString.stringify({foo: [1, 2, 3]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1|2|3'
    		queryString.stringify({foo: [1, '', 3, null, null, 6]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1||3|||6'
    		queryString.stringify({foo: [1, '', 3, null, null, 6]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|', skipNull: true});
    		//=> 'foo[]=1||3|6'
    		queryString.stringify({foo: [1, 2, 3], bar: 'fluffy', baz: [4]}, {arrayFormat: 'bracket-separator', arrayFormatSeparator: '|'});
    		//=> 'foo[]=1|2|3&bar=fluffy&baz[]=4'
    		```
    	- `colon-list-separator`: Serialize arrays with parameter names that are explicitly marked with `:list`:
    		```js
    		import queryString = require('query-string');
    		queryString.stringify({foo: ['one', 'two']}, {arrayFormat: 'colon-list-separator'});
    		//=> 'foo:list=one&foo:list=two'
    		```
    	- `none`: Serialize arrays by using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.stringify({foo: [1, 2, 3]});
    		//=> 'foo=1&foo=2&foo=3'
    		```
    	*/
    val arrayFormat: js.UndefOr[
        bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none
      ] = js.undefined
    
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
    	[URL encode](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent) the keys and values.
    	@default true
    	*/
    val encode: js.UndefOr[Boolean] = js.undefined
    
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
    val parseBooleans: js.UndefOr[Boolean] = js.undefined
    
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
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.undefined
    
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
    var parseNumbers: `true`
    
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
  object parseNumberstrueParseOptiArrayFormat {
    
    inline def apply(): parseNumberstrueParseOptiArrayFormat = {
      val __obj = js.Dynamic.literal(parseNumbers = true)
      __obj.asInstanceOf[parseNumberstrueParseOptiArrayFormat]
    }
    
    extension [Self <: parseNumberstrueParseOptiArrayFormat](x: Self) {
      
      inline def setArrayFormat(value: bracket | index | comma | separator | `bracket-separator` | `colon-list-separator` | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setParseBooleans(value: Boolean): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      inline def setParseBooleansUndefined: Self = StObject.set(x, "parseBooleans", js.undefined)
      
      inline def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      inline def setParseNumbers(value: `true`): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyString(value: Boolean): Self = StObject.set(x, "skipEmptyString", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyStringUndefined: Self = StObject.set(x, "skipEmptyString", js.undefined)
      
      inline def setSkipNull(value: Boolean): Self = StObject.set(x, "skipNull", value.asInstanceOf[js.Any])
      
      inline def setSkipNullUndefined: Self = StObject.set(x, "skipNull", js.undefined)
      
      inline def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
