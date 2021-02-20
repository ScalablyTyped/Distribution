package typings.replacestream

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: String, replace: String): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: String, replace: String, options: Options): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: String, replace: ReplaceFunction): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: String, replace: ReplaceFunction, options: Options): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: RegExp, replace: String): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: RegExp, replace: String, options: Options): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: RegExp, replace: ReplaceFunction): js.Any = js.native
  @JSImport("replacestream", JSImport.Namespace)
  @js.native
  def apply(search: RegExp, replace: ReplaceFunction, options: Options): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The text encoding used during search and replace.
      *
      * Default: `"utf8"`
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * When doing string match (not relevant for regex matching) whether to do a
      * case insensitive search.
      *
      * Default: `true`
      */
    var ignoreCase: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets a limit on the number of times the replacement will be made. This
      * is forced to one when a regex without the global flag is provided.
      *
      * Default: `Infinity`
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * When doing cross-chunk replacing, this sets the maximum length match
      * that will be supported.
      *
      * Default: `100`
      */
    var maxMatchLen: js.UndefOr[Double] = js.native
    
    /**
      * When provided, these flags will be used when creating the search regexes
      * internally.
      *
      * @deprecated as the flags set on the regex provided are no longer mutated
      * if this is not provided.
      */
    var regExpOptions: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMaxMatchLen(value: Double): Self = StObject.set(x, "maxMatchLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMatchLenUndefined: Self = StObject.set(x, "maxMatchLen", js.undefined)
      
      @scala.inline
      def setRegExpOptions(value: String): Self = StObject.set(x, "regExpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegExpOptionsUndefined: Self = StObject.set(x, "regExpOptions", js.undefined)
    }
  }
  
  type ReplaceFunction = js.Function4[/* match */ String, /* p1 */ String, /* offset */ Double, /* string */ String, String]
}
