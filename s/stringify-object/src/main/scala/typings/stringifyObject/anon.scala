package typings.stringifyObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Filter extends StObject {
    
    /**
      * Expected to return a boolean of whether to include the property property of the object object in the output.
      */
    var filter: js.UndefOr[js.Function2[/* input */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.native
    
    /**
      * Preferred indentation
      * @default '\t'
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      * When set, will inline values up to inlineCharacterLimit length for the sake of more terse output.
      */
    var inlineCharacterLimit: js.UndefOr[Double] = js.native
    
    /**
      * Set to false to get double-quoted strings
      * @default true
      */
    var singleQuotes: js.UndefOr[Boolean] = js.native
    
    /**
      * Expected to return a string that transforms the string that resulted from stringifying object[property].
      * This can be used to detect special types of objects that need to be stringified in a particular way.
      * The transform function might return an alternate string in this case, otherwise returning the originalResult.
      */
    var transform: js.UndefOr[
        js.Function3[
          /* input */ js.Array[_] | js.Object, 
          /* prop */ Double | String | js.Symbol, 
          /* originalResult */ String, 
          String
        ]
      ] = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: (/* input */ js.Any, /* prop */ String | js.Symbol) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setInlineCharacterLimit(value: Double): Self = StObject.set(x, "inlineCharacterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineCharacterLimitUndefined: Self = StObject.set(x, "inlineCharacterLimit", js.undefined)
      
      @scala.inline
      def setSingleQuotes(value: Boolean): Self = StObject.set(x, "singleQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleQuotesUndefined: Self = StObject.set(x, "singleQuotes", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* input */ js.Array[_] | js.Object, /* prop */ Double | String | js.Symbol, /* originalResult */ String) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
