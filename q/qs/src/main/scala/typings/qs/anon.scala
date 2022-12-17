package typings.qs

import typings.qs.mod.defaultDecoder
import typings.qs.qsBooleans.`false`
import typings.qs.qsStrings.`iso-8859-1`
import typings.qs.qsStrings.`utf-8`
import typings.qs.qsStrings.key
import typings.qs.qsStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined qs.qs.IParseOptions & {  decoder :never | undefined} */
  trait IParseOptionsdecodernever extends StObject {
    
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
  object IParseOptionsdecodernever {
    
    inline def apply(): IParseOptionsdecodernever = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParseOptionsdecodernever]
    }
    
    extension [Self <: IParseOptionsdecodernever](x: Self) {
      
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
}
