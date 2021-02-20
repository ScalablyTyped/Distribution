package typings.setCookieParser

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.setCookieParser.anon.Optionsmapfalseundefined
import typings.setCookieParser.anon.Optionsmaptrue
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  /**
    * Parses set-cookie headers into objects
    */
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Optionsmaptrue): CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String]): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String], options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String], options: Optionsmaptrue): CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String], options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: IncomingMessage): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: IncomingMessage, options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: IncomingMessage, options: Optionsmaptrue): CookieMap = js.native
  @JSImport("set-cookie-parser", JSImport.Namespace)
  @js.native
  def apply(input: IncomingMessage, options: Options): js.Array[Cookie] | CookieMap = js.native
  
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: String): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: String, options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: String, options: Optionsmaptrue): CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: String, options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: js.Array[String]): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: js.Array[String], options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: js.Array[String], options: Optionsmaptrue): CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: js.Array[String], options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: IncomingMessage): js.Array[Cookie] | CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: IncomingMessage, options: Optionsmapfalseundefined): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: IncomingMessage, options: Optionsmaptrue): CookieMap = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse(input: IncomingMessage, options: Options): js.Array[Cookie] | CookieMap = js.native
  
  /**
    * Parses a single set-cookie header value string.
    * Options default is `{decodeValues: true}`. Used under-the-hood by `parse()`
    */
  @JSImport("set-cookie-parser", "parseString")
  @js.native
  def parseString(individualSetCookieHeader: String): Cookie = js.native
  @JSImport("set-cookie-parser", "parseString")
  @js.native
  def parseString(individualSetCookieHeader: String, options: Options): Cookie = js.native
  
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse_Array(input: String): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse_Array(input: js.Array[String]): js.Array[Cookie] = js.native
  @JSImport("set-cookie-parser", "parse")
  @js.native
  def parse_Array(input: IncomingMessage): js.Array[Cookie] = js.native
  
  /**
    * Set-Cookie header field-values are sometimes comma joined in one string. This splits them without choking on commas
    * that are within a single set-cookie field-value, such as in the Expires portion.
    * This is uncommon, but explicitly allowed - see https://tools.ietf.org/html/rfc2616#section-4.2
    * Node.js does this for every header *except* set-cookie - see https://github.com/nodejs/node/blob/d5e363b77ebaf1caf67cd7528224b651c86815c1/lib/_http_incoming.js#L128
    * React Native's fetch does this for *every* header, including set-cookie.
    * Based on: https://github.com/google/j2objc/commit/16820fdbc8f76ca0c33472810ce0cb03d20efe25
    * Credits to: https://github.com/tomball for original and https://github.com/chrusart for JavaScript implementation
    */
  @JSImport("set-cookie-parser", "splitCookiesString")
  @js.native
  def splitCookiesString(): js.Array[String] = js.native
  @JSImport("set-cookie-parser", "splitCookiesString")
  @js.native
  def splitCookiesString(input: String): js.Array[String] = js.native
  @JSImport("set-cookie-parser", "splitCookiesString")
  @js.native
  def splitCookiesString(input: js.Array[String]): js.Array[String] = js.native
  
  @js.native
  trait Cookie extends StObject {
    
    /**
      * domain for the cookie,
      * may begin with "." to indicate the named domain or any subdomain of it
      */
    var domain: js.UndefOr[String] = js.native
    
    /**
      * absolute expiration date for the cookie
      */
    var expires: js.UndefOr[Date] = js.native
    
    /**
      * indicates that this cookie should not be accessible to client-side JavaScript
      */
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * relative max age of the cookie in seconds from when the client receives it (integer or undefined)
      * Note: when using with express's res.cookie() method, multiply maxAge by 1000 to convert to miliseconds
      */
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
      * cookie name
      */
    var name: String = js.native
    
    /**
      * cookie path
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * indicates a cookie ought not to be sent along with cross-site requests
      */
    var sameSite: js.UndefOr[String] = js.native
    
    /**
      * indicates that this cookie should only be sent over HTTPs
      */
    var secure: js.UndefOr[Boolean] = js.native
    
    /**
      * cookie value
      */
    var value: String = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(name: String, value: String): Cookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CookieMap = StringDictionary[Cookie]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Calls dcodeURIComponent on each value
      * @default true
      */
    var decodeValues: js.UndefOr[Boolean] = js.native
    
    /**
      * Return an object instead of an array
      * @default false
      */
    var map: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the warning that is loged when called on a request instead of a response
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.native
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
      def setDecodeValues(value: Boolean): Self = StObject.set(x, "decodeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeValuesUndefined: Self = StObject.set(x, "decodeValues", js.undefined)
      
      @scala.inline
      def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
