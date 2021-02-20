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
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qs", "parse")
  @js.native
  def parse(str: String): ParsedQs = js.native
  @JSImport("qs", "parse")
  @js.native
  def parse(str: String, options: IParseOptionsdecodernever): ParsedQs = js.native
  @JSImport("qs", "parse")
  @js.native
  def parse(str: String, options: IParseOptions): StringDictionary[js.Any] = js.native
  @JSImport("qs", "parse")
  @js.native
  def parse_StringDictionary(str: String): StringDictionary[js.Any] = js.native
  
  @JSImport("qs", "stringify")
  @js.native
  def stringify(obj: js.Any): String = js.native
  @JSImport("qs", "stringify")
  @js.native
  def stringify(obj: js.Any, options: IStringifyOptions): String = js.native
  
  @js.native
  trait IParseOptions extends StObject {
    
    var allowDots: js.UndefOr[Boolean] = js.native
    
    var allowPrototypes: js.UndefOr[Boolean] = js.native
    
    var arrayLimit: js.UndefOr[Double] = js.native
    
    var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.native
    
    var charsetSentinel: js.UndefOr[Boolean] = js.native
    
    var comma: js.UndefOr[Boolean] = js.native
    
    var decoder: js.UndefOr[
        js.Function4[
          /* str */ String, 
          /* defaultDecoder */ defaultDecoder, 
          /* charset */ String, 
          /* type */ key | value, 
          _
        ]
      ] = js.native
    
    var delimiter: js.UndefOr[String | RegExp] = js.native
    
    var depth: js.UndefOr[Double | `false`] = js.native
    
    var ignoreQueryPrefix: js.UndefOr[Boolean] = js.native
    
    var interpretNumericEntities: js.UndefOr[Boolean] = js.native
    
    var parameterLimit: js.UndefOr[Double] = js.native
    
    var parseArrays: js.UndefOr[Boolean] = js.native
    
    var plainObjects: js.UndefOr[Boolean] = js.native
    
    var strictNullHandling: js.UndefOr[Boolean] = js.native
  }
  object IParseOptions {
    
    @scala.inline
    def apply(): IParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParseOptions]
    }
    
    @scala.inline
    implicit class IParseOptionsMutableBuilder[Self <: IParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      @scala.inline
      def setAllowPrototypes(value: Boolean): Self = StObject.set(x, "allowPrototypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPrototypesUndefined: Self = StObject.set(x, "allowPrototypes", js.undefined)
      
      @scala.inline
      def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayLimitUndefined: Self = StObject.set(x, "arrayLimit", js.undefined)
      
      @scala.inline
      def setCharset(value: `utf-8` | `iso-8859-1`): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetSentinel(value: Boolean): Self = StObject.set(x, "charsetSentinel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetSentinelUndefined: Self = StObject.set(x, "charsetSentinel", js.undefined)
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setComma(value: Boolean): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommaUndefined: Self = StObject.set(x, "comma", js.undefined)
      
      @scala.inline
      def setDecoder(
        value: (/* str */ String, /* defaultDecoder */ defaultDecoder, /* charset */ String, /* type */ key | value) => _
      ): Self = StObject.set(x, "decoder", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDecoderUndefined: Self = StObject.set(x, "decoder", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String | RegExp): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDepth(value: Double | `false`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setIgnoreQueryPrefix(value: Boolean): Self = StObject.set(x, "ignoreQueryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreQueryPrefixUndefined: Self = StObject.set(x, "ignoreQueryPrefix", js.undefined)
      
      @scala.inline
      def setInterpretNumericEntities(value: Boolean): Self = StObject.set(x, "interpretNumericEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpretNumericEntitiesUndefined: Self = StObject.set(x, "interpretNumericEntities", js.undefined)
      
      @scala.inline
      def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
      
      @scala.inline
      def setParseArrays(value: Boolean): Self = StObject.set(x, "parseArrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseArraysUndefined: Self = StObject.set(x, "parseArrays", js.undefined)
      
      @scala.inline
      def setPlainObjects(value: Boolean): Self = StObject.set(x, "plainObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainObjectsUndefined: Self = StObject.set(x, "plainObjects", js.undefined)
      
      @scala.inline
      def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
    }
  }
  
  @js.native
  trait IStringifyOptions extends StObject {
    
    var addQueryPrefix: js.UndefOr[Boolean] = js.native
    
    var allowDots: js.UndefOr[Boolean] = js.native
    
    var arrayFormat: js.UndefOr[indices | brackets | repeat | comma] = js.native
    
    var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.native
    
    var charsetSentinel: js.UndefOr[Boolean] = js.native
    
    var delimiter: js.UndefOr[String] = js.native
    
    var encode: js.UndefOr[Boolean] = js.native
    
    var encodeValuesOnly: js.UndefOr[Boolean] = js.native
    
    var encoder: js.UndefOr[
        js.Function4[
          /* str */ js.Any, 
          /* defaultEncoder */ defaultEncoder, 
          /* charset */ String, 
          /* type */ key | value, 
          String
        ]
      ] = js.native
    
    var filter: js.UndefOr[
        (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])
      ] = js.native
    
    var format: js.UndefOr[RFC1738 | RFC3986] = js.native
    
    var indices: js.UndefOr[Boolean] = js.native
    
    var serializeDate: js.UndefOr[js.Function1[/* d */ Date, String]] = js.native
    
    var skipNulls: js.UndefOr[Boolean] = js.native
    
    var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
    
    var strictNullHandling: js.UndefOr[Boolean] = js.native
  }
  object IStringifyOptions {
    
    @scala.inline
    def apply(): IStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStringifyOptions]
    }
    
    @scala.inline
    implicit class IStringifyOptionsMutableBuilder[Self <: IStringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddQueryPrefix(value: Boolean): Self = StObject.set(x, "addQueryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddQueryPrefixUndefined: Self = StObject.set(x, "addQueryPrefix", js.undefined)
      
      @scala.inline
      def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      @scala.inline
      def setArrayFormat(value: indices | brackets | repeat | comma): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setCharset(value: `utf-8` | `iso-8859-1`): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetSentinel(value: Boolean): Self = StObject.set(x, "charsetSentinel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetSentinelUndefined: Self = StObject.set(x, "charsetSentinel", js.undefined)
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setEncodeValuesOnly(value: Boolean): Self = StObject.set(x, "encodeValuesOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeValuesOnlyUndefined: Self = StObject.set(x, "encodeValuesOnly", js.undefined)
      
      @scala.inline
      def setEncoder(
        value: (/* str */ js.Any, /* defaultEncoder */ defaultEncoder, /* charset */ String, /* type */ key | value) => String
      ): Self = StObject.set(x, "encoder", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
      
      @scala.inline
      def setFilter(value: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction2(value: (/* prefix */ String, /* value */ js.Any) => _): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: (String | Double)*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: RFC1738 | RFC3986): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIndices(value: Boolean): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      @scala.inline
      def setSerializeDate(value: /* d */ Date => String): Self = StObject.set(x, "serializeDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeDateUndefined: Self = StObject.set(x, "serializeDate", js.undefined)
      
      @scala.inline
      def setSkipNulls(value: Boolean): Self = StObject.set(x, "skipNulls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNullsUndefined: Self = StObject.set(x, "skipNulls", js.undefined)
      
      @scala.inline
      def setSort(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
    }
  }
  
  @js.native
  trait ParsedQs
    extends /* key */ StringDictionary[js.UndefOr[String | (js.Array[ParsedQs | String]) | ParsedQs]]
  object ParsedQs {
    
    @scala.inline
    def apply(): ParsedQs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsedQs]
    }
  }
  
  type defaultDecoder = js.Function3[
    /* str */ String, 
    /* decoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[String], 
    String
  ]
  
  type defaultEncoder = js.Function3[
    /* str */ js.Any, 
    /* defaultEncoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[String], 
    String
  ]
}
