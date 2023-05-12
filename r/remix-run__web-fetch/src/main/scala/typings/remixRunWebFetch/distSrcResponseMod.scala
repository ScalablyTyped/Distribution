package typings.remixRunWebFetch

import typings.node.streamMod.Stream
import typings.std.BodyInit
import typings.std.ResponseInit
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResponseMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/response", JSImport.Default)
  @js.native
  /**
    * @param {BodyInit|import('stream').Stream|null} [body] - Readable stream
    * @param {ResponseInit & Ext} [options] - Response options
    */
  open class default () extends Response {
    def this(body: Stream) = this()
    def this(body: BodyInit) = this()
    def this(body: Null, options: ResponseInit & Ext) = this()
    def this(body: Unit, options: ResponseInit & Ext) = this()
    def this(body: Stream, options: ResponseInit & Ext) = this()
    def this(body: BodyInit, options: ResponseInit & Ext) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@remix-run/web-fetch/dist/src/response", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {string} url    The URL that the new response is to originate from.
      * @param {number} status An optional status code for the response (e.g., 302.)
      * @returns {Response}    A Response object.
      */
    inline def redirect(url: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def redirect(url: String, status: Double): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  trait Ext extends StObject {
    
    var counter: js.UndefOr[Double] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Ext {
    
    inline def apply(): Ext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ext] (val x: Self) extends AnyVal {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response * / any */ @js.native
  trait Response
    extends typings.remixRunWebFetch.distSrcBodyMod.default {
    
    var get: Any = js.native
    
    def highWaterMark: js.UndefOr[Double] = js.native
    
    /**
      * Convenience property representing if the request ended normally
      */
    def ok: Boolean = js.native
    
    def redirected: Boolean = js.native
    
    def status: Double = js.native
    
    def statusText: String = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * @type {ResponseType}
      */
    def `type`: ResponseType = js.native
    
    def url: String = js.native
  }
}
