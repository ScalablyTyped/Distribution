package typings.qs

import org.scalablytyped.runtime.StringDictionary
import typings.qs.anon.IParseOptionsdecodernever
import typings.qs.qsBooleans.`false`
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedQs]
  inline def parse(str: String, options: IParseOptionsdecodernever): ParsedQs = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedQs]
  inline def parse(str: String, options: IParseOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def parse(str: Record[String, String]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def parse(str: Record[String, String], options: IParseOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def parse_StringDictionary(str: String): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: Any, options: IStringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IParseOptions extends StObject {
    
    var allowDots: js.UndefOr[Boolean] = js.undefined
    
    var allowPrototypes: js.UndefOr[Boolean] = js.undefined
    
    var arrayLimit: js.UndefOr[Double] = js.undefined
    
    var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.undefined
    
    var charsetSentinel: js.UndefOr[Boolean] = js.undefined
    
    var comma: js.UndefOr[Boolean] = js.undefined
    
    var decoder: js.UndefOr[
        js.Function4[
          /* str */ String, 
          /* defaultDecoder */ defaultDecoder, 
          /* charset */ String, 
          /* type */ key | value, 
          Any
        ]
      ] = js.undefined
    
    var delimiter: js.UndefOr[String | js.RegExp] = js.undefined
    
    var depth: js.UndefOr[Double | `false`] = js.undefined
    
    var ignoreQueryPrefix: js.UndefOr[Boolean] = js.undefined
    
    var interpretNumericEntities: js.UndefOr[Boolean] = js.undefined
    
    var parameterLimit: js.UndefOr[Double] = js.undefined
    
    var parseArrays: js.UndefOr[Boolean] = js.undefined
    
    var plainObjects: js.UndefOr[Boolean] = js.undefined
    
    var strictNullHandling: js.UndefOr[Boolean] = js.undefined
  }
  object IParseOptions {
    
    inline def apply(): IParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParseOptions]
    }
    
    extension [Self <: IParseOptions](x: Self) {
      
      inline def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      inline def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      inline def setAllowPrototypes(value: Boolean): Self = StObject.set(x, "allowPrototypes", value.asInstanceOf[js.Any])
      
      inline def setAllowPrototypesUndefined: Self = StObject.set(x, "allowPrototypes", js.undefined)
      
      inline def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
      
      inline def setArrayLimitUndefined: Self = StObject.set(x, "arrayLimit", js.undefined)
      
      inline def setCharset(value: `utf-8` | `iso-8859-1`): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetSentinel(value: Boolean): Self = StObject.set(x, "charsetSentinel", value.asInstanceOf[js.Any])
      
      inline def setCharsetSentinelUndefined: Self = StObject.set(x, "charsetSentinel", js.undefined)
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setComma(value: Boolean): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
      
      inline def setCommaUndefined: Self = StObject.set(x, "comma", js.undefined)
      
      inline def setDecoder(
        value: (/* str */ String, /* defaultDecoder */ defaultDecoder, /* charset */ String, /* type */ key | value) => Any
      ): Self = StObject.set(x, "decoder", js.Any.fromFunction4(value))
      
      inline def setDecoderUndefined: Self = StObject.set(x, "decoder", js.undefined)
      
      inline def setDelimiter(value: String | js.RegExp): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDepth(value: Double | `false`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setIgnoreQueryPrefix(value: Boolean): Self = StObject.set(x, "ignoreQueryPrefix", value.asInstanceOf[js.Any])
      
      inline def setIgnoreQueryPrefixUndefined: Self = StObject.set(x, "ignoreQueryPrefix", js.undefined)
      
      inline def setInterpretNumericEntities(value: Boolean): Self = StObject.set(x, "interpretNumericEntities", value.asInstanceOf[js.Any])
      
      inline def setInterpretNumericEntitiesUndefined: Self = StObject.set(x, "interpretNumericEntities", js.undefined)
      
      inline def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
      
      inline def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
      
      inline def setParseArrays(value: Boolean): Self = StObject.set(x, "parseArrays", value.asInstanceOf[js.Any])
      
      inline def setParseArraysUndefined: Self = StObject.set(x, "parseArrays", js.undefined)
      
      inline def setPlainObjects(value: Boolean): Self = StObject.set(x, "plainObjects", value.asInstanceOf[js.Any])
      
      inline def setPlainObjectsUndefined: Self = StObject.set(x, "plainObjects", js.undefined)
      
      inline def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
      
      inline def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
    }
  }
  
  trait IStringifyOptions extends StObject {
    
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
          /* str */ Any, 
          /* defaultEncoder */ defaultEncoder, 
          /* charset */ String, 
          /* type */ key | value, 
          String
        ]
      ] = js.undefined
    
    var filter: js.UndefOr[
        (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ Any, Any])
      ] = js.undefined
    
    var format: js.UndefOr[RFC1738 | RFC3986] = js.undefined
    
    var indices: js.UndefOr[Boolean] = js.undefined
    
    var serializeDate: js.UndefOr[js.Function1[/* d */ js.Date, String]] = js.undefined
    
    var skipNulls: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Double]] = js.undefined
    
    var strictNullHandling: js.UndefOr[Boolean] = js.undefined
  }
  object IStringifyOptions {
    
    inline def apply(): IStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStringifyOptions]
    }
    
    extension [Self <: IStringifyOptions](x: Self) {
      
      inline def setAddQueryPrefix(value: Boolean): Self = StObject.set(x, "addQueryPrefix", value.asInstanceOf[js.Any])
      
      inline def setAddQueryPrefixUndefined: Self = StObject.set(x, "addQueryPrefix", js.undefined)
      
      inline def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      inline def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      inline def setArrayFormat(value: indices | brackets | repeat | comma): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setCharset(value: `utf-8` | `iso-8859-1`): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetSentinel(value: Boolean): Self = StObject.set(x, "charsetSentinel", value.asInstanceOf[js.Any])
      
      inline def setCharsetSentinelUndefined: Self = StObject.set(x, "charsetSentinel", js.undefined)
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setEncodeValuesOnly(value: Boolean): Self = StObject.set(x, "encodeValuesOnly", value.asInstanceOf[js.Any])
      
      inline def setEncodeValuesOnlyUndefined: Self = StObject.set(x, "encodeValuesOnly", js.undefined)
      
      inline def setEncoder(
        value: (/* str */ Any, /* defaultEncoder */ defaultEncoder, /* charset */ String, /* type */ key | value) => String
      ): Self = StObject.set(x, "encoder", js.Any.fromFunction4(value))
      
      inline def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
      
      inline def setFilter(value: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ Any, Any])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* prefix */ String, /* value */ Any) => Any): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: (String | Double)*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setFormat(value: RFC1738 | RFC3986): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIndices(value: Boolean): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      inline def setSerializeDate(value: /* d */ js.Date => String): Self = StObject.set(x, "serializeDate", js.Any.fromFunction1(value))
      
      inline def setSerializeDateUndefined: Self = StObject.set(x, "serializeDate", js.undefined)
      
      inline def setSkipNulls(value: Boolean): Self = StObject.set(x, "skipNulls", value.asInstanceOf[js.Any])
      
      inline def setSkipNullsUndefined: Self = StObject.set(x, "skipNulls", js.undefined)
      
      inline def setSort(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
      
      inline def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ParsedQs = {[key: string] : undefined | string | std.Array<string> | qs.qs.ParsedQs | std.Array<qs.qs.ParsedQs>}
  }}}
  to avoid circular code involving: 
  - qs.qs.ParsedQs
  */
  trait ParsedQs
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | (js.Array[ParsedQs | String]) | ParsedQs]]
  object ParsedQs {
    
    inline def apply(): ParsedQs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsedQs]
    }
  }
  
  type defaultDecoder = js.Function3[
    /* str */ String, 
    /* decoder */ js.UndefOr[Any], 
    /* charset */ js.UndefOr[String], 
    String
  ]
  
  type defaultEncoder = js.Function3[
    /* str */ Any, 
    /* defaultEncoder */ js.UndefOr[Any], 
    /* charset */ js.UndefOr[String], 
    String
  ]
}
