package typings.replacestream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(search: String, replace: String): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: String, replace: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: String, replace: ReplaceFunction): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: String, replace: ReplaceFunction, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: js.RegExp, replace: String): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: js.RegExp, replace: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: js.RegExp, replace: ReplaceFunction): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(search: js.RegExp, replace: ReplaceFunction, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(search.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The text encoding used during search and replace.
      *
      * Default: `"utf8"`
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * When doing string match (not relevant for regex matching) whether to do a
      * case insensitive search.
      *
      * Default: `true`
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets a limit on the number of times the replacement will be made. This
      * is forced to one when a regex without the global flag is provided.
      *
      * Default: `Infinity`
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * When doing cross-chunk replacing, this sets the maximum length match
      * that will be supported.
      *
      * Default: `100`
      */
    var maxMatchLen: js.UndefOr[Double] = js.undefined
    
    /**
      * When provided, these flags will be used when creating the search regexes
      * internally.
      *
      * @deprecated as the flags set on the regex provided are no longer mutated
      * if this is not provided.
      */
    var regExpOptions: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMaxMatchLen(value: Double): Self = StObject.set(x, "maxMatchLen", value.asInstanceOf[js.Any])
      
      inline def setMaxMatchLenUndefined: Self = StObject.set(x, "maxMatchLen", js.undefined)
      
      inline def setRegExpOptions(value: String): Self = StObject.set(x, "regExpOptions", value.asInstanceOf[js.Any])
      
      inline def setRegExpOptionsUndefined: Self = StObject.set(x, "regExpOptions", js.undefined)
    }
  }
  
  type ReplaceFunction = js.Function4[/* match */ String, /* p1 */ String, /* offset */ Double, /* string */ String, String]
}
