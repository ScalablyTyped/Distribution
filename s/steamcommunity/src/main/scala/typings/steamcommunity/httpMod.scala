package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @js.native
  trait Http extends StObject {
    
    def httpRequest(uri: String, options: Any, callback: Unit, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: String, options: Any, callback: Unit, source: Unit, args: Any*): Unit = js.native
    /**
      * All arguments are optional, but you need one of uri and options. If uri isn't provided, then either options.uri or options.url must be defined with the request URI.
      * The options object will be passed to the request module (if provided). If you don't specify a method in options, then it will default to GET.
      *
      * @param uri Optional. A string containing the request URI.
      * @param options Optional. An object containing request options (this object will be passed to the request module).
      * @param callback Optional. Called when the request completes.
      * @param source Optional (but highly encouraged). A string which is passed to hooks as the source value.
      * @param args
      */
    def httpRequest(uri: String, options: Any, callback: Callback, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: String, options: Any, callback: Callback, source: Unit, args: Any*): Unit = js.native
    def httpRequest(uri: String, options: Unit, callback: Unit, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: String, options: Unit, callback: Unit, source: Unit, args: Any*): Unit = js.native
    def httpRequest(uri: String, options: Unit, callback: Callback, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: String, options: Unit, callback: Callback, source: Unit, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Any, callback: Unit, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Any, callback: Unit, source: Unit, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Any, callback: Callback, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Any, callback: Callback, source: Unit, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Unit, callback: Unit, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Unit, callback: Unit, source: Unit, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Unit, callback: Callback, source: String, args: Any*): Unit = js.native
    def httpRequest(uri: Unit, options: Unit, callback: Callback, source: Unit, args: Any*): Unit = js.native
    
    /**
      * Convenience method which performs a GET request.
      * @param args
      */
    def httpRequestGet(args: Any*): Any = js.native
    
    /**
      * Convenience method which performs a POST request.
      * @param args
      */
    def httpRequestPost(args: Any*): Any = js.native
  }
}
