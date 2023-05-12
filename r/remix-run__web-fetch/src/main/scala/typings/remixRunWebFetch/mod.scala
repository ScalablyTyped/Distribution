package typings.remixRunWebFetch

import typings.node.streamMod.Stream
import typings.remixRunWebFetch.distSrcHeadersMod.HeadersInit
import typings.remixRunWebFetch.distSrcHeadersMod.default
import typings.remixRunWebFetch.distSrcRequestMod.RequestExtraOptions
import typings.remixRunWebFetch.distSrcResponseMod.Ext
import typings.std.BodyInit
import typings.std.HTMLFormElement
import typings.std.RequestInit
import typings.std.ResponseInit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@remix-run/web-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def default(url: String, options_ : RequestInit & RequestExtraOptions): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def default(url: typings.remixRunWebFetch.distSrcRequestMod.default): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def default(
    url: typings.remixRunWebFetch.distSrcRequestMod.default,
    options_ : RequestInit & RequestExtraOptions
  ): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def default(url: URL): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def default(url: URL, options_ : RequestInit & RequestExtraOptions): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@remix-run/web-fetch", "FormData")
  @js.native
  open class FormData ()
    extends StObject
       with typings.std.FormData {
    def this(form: HTMLFormElement) = this()
  }
  
  @JSImport("@remix-run/web-fetch", "Headers")
  @js.native
  /**
    * Headers class
    *
    * @constructor
    * @param {HeadersInit} [init] - Response headers
    */
  open class Headers () extends default {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("@remix-run/web-fetch", "Request")
  @js.native
  open class Request protected ()
    extends typings.remixRunWebFetch.distSrcRequestMod.default {
    /**
      * @param {string|Request|URL} info  Url or Request instance
      * @param {RequestInit & RequestExtraOptions} init   Custom options
      */
    def this(info: String) = this()
    def this(info: typings.remixRunWebFetch.distSrcRequestMod.Request) = this()
    def this(info: URL) = this()
    def this(info: String, init: RequestInit & RequestExtraOptions) = this()
    def this(info: typings.remixRunWebFetch.distSrcRequestMod.Request, init: RequestInit & RequestExtraOptions) = this()
    def this(info: URL, init: RequestInit & RequestExtraOptions) = this()
  }
  
  @JSImport("@remix-run/web-fetch", "Response")
  @js.native
  /**
    * @param {BodyInit|import('stream').Stream|null} [body] - Readable stream
    * @param {ResponseInit & Ext} [options] - Response options
    */
  open class Response ()
    extends typings.remixRunWebFetch.distSrcResponseMod.default {
    def this(body: Stream) = this()
    def this(body: BodyInit) = this()
    def this(body: Null, options: ResponseInit & Ext) = this()
    def this(body: Unit, options: ResponseInit & Ext) = this()
    def this(body: Stream, options: ResponseInit & Ext) = this()
    def this(body: BodyInit, options: ResponseInit & Ext) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("@remix-run/web-fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {string} url    The URL that the new response is to originate from.
      * @param {number} status An optional status code for the response (e.g., 302.)
      * @returns {Response}    A Response object.
      */
    inline def redirect(url: String): typings.remixRunWebFetch.distSrcResponseMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.remixRunWebFetch.distSrcResponseMod.Response]
    inline def redirect(url: String, status: Double): typings.remixRunWebFetch.distSrcResponseMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.remixRunWebFetch.distSrcResponseMod.Response]
  }
  
  inline def fetch(url: String): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def fetch(url: String, options_ : RequestInit & RequestExtraOptions): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def fetch(url: typings.remixRunWebFetch.distSrcRequestMod.default): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def fetch(
    url: typings.remixRunWebFetch.distSrcRequestMod.default,
    options_ : RequestInit & RequestExtraOptions
  ): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def fetch(url: URL): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
  inline def fetch(url: URL, options_ : RequestInit & RequestExtraOptions): js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.remixRunWebFetch.distSrcResponseMod.default]]
}
