package typings.stringifyObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Filter extends StObject {
    
    /**
      * Expected to return a boolean of whether to include the property property of the object object in the output.
      */
    var filter: js.UndefOr[js.Function2[/* input */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.undefined
    
    /**
      * Preferred indentation
      * @default '\t'
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * When set, will inline values up to inlineCharacterLimit length for the sake of more terse output.
      */
    var inlineCharacterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to false to get double-quoted strings
      * @default true
      */
    var singleQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expected to return a string that transforms the string that resulted from stringifying object[property].
      * This can be used to detect special types of objects that need to be stringified in a particular way.
      * The transform function might return an alternate string in this case, otherwise returning the originalResult.
      */
    var transform: js.UndefOr[
        js.Function3[
          /* input */ js.Array[js.Any] | js.Object, 
          /* prop */ Double | String | js.Symbol, 
          /* originalResult */ String, 
          String
        ]
      ] = js.undefined
  }
  object Filter {
    
    inline def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setFilter(value: (/* input */ js.Any, /* prop */ String | js.Symbol) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setInlineCharacterLimit(value: Double): Self = StObject.set(x, "inlineCharacterLimit", value.asInstanceOf[js.Any])
      
      inline def setInlineCharacterLimitUndefined: Self = StObject.set(x, "inlineCharacterLimit", js.undefined)
      
      inline def setSingleQuotes(value: Boolean): Self = StObject.set(x, "singleQuotes", value.asInstanceOf[js.Any])
      
      inline def setSingleQuotesUndefined: Self = StObject.set(x, "singleQuotes", js.undefined)
      
      inline def setTransform(
        value: (/* input */ js.Array[js.Any] | js.Object, /* prop */ Double | String | js.Symbol, /* originalResult */ String) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
