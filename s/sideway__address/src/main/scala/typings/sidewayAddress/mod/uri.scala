package typings.sidewayAddress.mod

import typings.hapiHoek.mod.ts.XOR
import typings.sidewayAddress.mod.uri.Options.Relative
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uri {
  
  @JSImport("@sideway/address", "uri")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Faster version of decodeURIComponent() that does not throw.
    * 
    * @param string - the URL string to decode.
    * 
    * @returns the decoded string or null if invalid.
    */
  @scala.inline
  def decode(string: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * Generates a regular expression used to validate URI addresses.
    *
    * @param options - optional settings.
    *
    * @returns an object with the regular expression and meta data.
    */
  @scala.inline
  def regex(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")().asInstanceOf[Expression]
  @scala.inline
  def regex(options: Options): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")(options.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  trait Expression extends StObject {
    
    /**
      * The raw regular expression string.
      */
    var raw: String
    
    /**
      * The regular expression.
      */
    var regex: RegExp
  }
  object Expression {
    
    @scala.inline
    def apply(raw: String, regex: RegExp): Expression = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  object Options {
    
    trait Options
      extends StObject
         with Query {
      
      /**
        * Allow relative URIs.
        * 
        * @default false
        */
      val allowRelative: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Capture domain segment ($1).
        * 
        * @default false
        */
      val domain: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The allowed URI schemes.
        */
      val scheme: js.UndefOr[Scheme | js.Array[Scheme]] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): typings.sidewayAddress.mod.uri.Options.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.sidewayAddress.mod.uri.Options.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typings.sidewayAddress.mod.uri.Options.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowRelative(value: Boolean): Self = StObject.set(x, "allowRelative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowRelativeUndefined: Self = StObject.set(x, "allowRelative", js.undefined)
        
        @scala.inline
        def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setScheme(value: Scheme | js.Array[Scheme]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
        
        @scala.inline
        def setSchemeVarargs(value: Scheme*): Self = StObject.set(x, "scheme", js.Array(value :_*))
      }
    }
    
    trait Query extends StObject {
      
      /**
        * Allow the use of [] in query parameters.
        * 
        * @default false
        */
      val allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined
    }
    object Query {
      
      @scala.inline
      def apply(): Query = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Query]
      }
      
      @scala.inline
      implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowQuerySquareBrackets(value: Boolean): Self = StObject.set(x, "allowQuerySquareBrackets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowQuerySquareBracketsUndefined: Self = StObject.set(x, "allowQuerySquareBrackets", js.undefined)
      }
    }
    
    trait Relative
      extends StObject
         with Query {
      
      /**
        * Requires the URI to be relative.
        * 
        * @default false
        */
      val relativeOnly: js.UndefOr[Boolean] = js.undefined
    }
    object Relative {
      
      @scala.inline
      def apply(): Relative = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Relative]
      }
      
      @scala.inline
      implicit class RelativeMutableBuilder[Self <: Relative] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRelativeOnly(value: Boolean): Self = StObject.set(x, "relativeOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelativeOnlyUndefined: Self = StObject.set(x, "relativeOnly", js.undefined)
      }
    }
    
    type Scheme = String | RegExp
  }
  type Options = XOR[typings.sidewayAddress.mod.uri.Options.Options, Relative]
}
