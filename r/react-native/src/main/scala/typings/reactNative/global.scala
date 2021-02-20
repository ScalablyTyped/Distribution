package typings.reactNative

import typings.reactNative.anon.DictoptionName
import typings.std.Blob
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AbortController")
  @js.native
  /**
    * Initialize this controller.
    */
  class AbortController ()
    extends typings.reactNative.AbortController
  
  @JSGlobal("AbortSignal")
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  class AbortSignal ()
    extends typings.reactNative.AbortSignal
  
  @JSGlobal("FormData")
  @js.native
  class FormData ()
    extends typings.reactNative.FormData
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Headers")
  @js.native
  class Headers ()
    extends typings.reactNative.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSGlobal("MessageQueue")
  @js.native
  class MessageQueue ()
    extends typings.reactNative.MessageQueue
  object MessageQueue {
    
    @JSGlobal("MessageQueue.spy")
    @js.native
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
    /* static member */
    @JSGlobal("MessageQueue.spy")
    @js.native
    def spy(spyOrToggle: Boolean): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Request")
  @js.native
  class Request protected ()
    extends typings.reactNative.Request {
    def this(input: String) = this()
    def this(input: typings.reactNative.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.reactNative.Request, init: RequestInit) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Response")
  @js.native
  class Response ()
    extends typings.reactNative.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  object Response {
    
    @JSGlobal("Response.error")
    @js.native
    def error(): typings.reactNative.Response = js.native
    
    @JSGlobal("Response.redirect")
    @js.native
    def redirect(url: String): typings.reactNative.Response = js.native
    @JSGlobal("Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typings.reactNative.Response = js.native
  }
  
  /**
    * Based on definition from lib.dom but using class syntax.
    * The properties are mutable to support users that use a `URL` polyfill, but the implementation
    * built into React Native (as of 0.63) does not implement all the properties.
    */
  @JSGlobal("URL")
  @js.native
  class URL protected ()
    extends typings.reactNative.URL {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
  }
  object URL {
    
    /* static member */
    @JSGlobal("URL.createObjectURL")
    @js.native
    def createObjectURL(blob: Blob): String = js.native
    
    /* static member */
    @JSGlobal("URL.revokeObjectURL")
    @js.native
    def revokeObjectURL(url: String): Unit = js.native
  }
  
  /**
    * Based on definitions of lib.dom and lib.dom.iterable
    */
  @JSGlobal("URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.reactNative.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Array[String]]) = this()
    def this(init: typings.reactNative.URLSearchParams) = this()
    def this(init: Record[String, String]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebSocket")
  @js.native
  class WebSocket protected ()
    extends typings.reactNative.WebSocket {
    def this(uri: String) = this()
    def this(uri: String, protocols: String) = this()
    def this(uri: String, protocols: js.Array[String]) = this()
    def this(uri: String, protocols: js.UndefOr[scala.Nothing], options: DictoptionName) = this()
    def this(uri: String, protocols: String, options: DictoptionName) = this()
    def this(uri: String, protocols: js.Array[String], options: DictoptionName) = this()
    def this(uri: String, protocols: Null, options: DictoptionName) = this()
  }
  object WebSocket {
    
    @JSGlobal("WebSocket.CLOSED")
    @js.native
    val CLOSED: Double = js.native
    
    @JSGlobal("WebSocket.CLOSING")
    @js.native
    val CLOSING: Double = js.native
    
    @JSGlobal("WebSocket.CONNECTING")
    @js.native
    val CONNECTING: Double = js.native
    
    @JSGlobal("WebSocket.OPEN")
    @js.native
    val OPEN: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("XMLHttpRequest")
  @js.native
  class XMLHttpRequest ()
    extends typings.reactNative.XMLHttpRequest
  object XMLHttpRequest {
    
    @JSGlobal("XMLHttpRequest.DONE")
    @js.native
    val DONE: Double = js.native
    
    @JSGlobal("XMLHttpRequest.HEADERS_RECEIVED")
    @js.native
    val HEADERS_RECEIVED: Double = js.native
    
    @JSGlobal("XMLHttpRequest.LOADING")
    @js.native
    val LOADING: Double = js.native
    
    @JSGlobal("XMLHttpRequest.OPENED")
    @js.native
    val OPENED: Double = js.native
    
    @JSGlobal("XMLHttpRequest.UNSENT")
    @js.native
    val UNSENT: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("XMLHttpRequestUpload")
  @js.native
  class XMLHttpRequestUpload ()
    extends typings.reactNative.XMLHttpRequestUpload
  
  @JSGlobal("cancelAnimationFrame")
  @js.native
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  @JSGlobal("clearImmediate")
  @js.native
  def clearImmediate(handle: Double): Unit = js.native
  
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(handle: Double): Unit = js.native
  
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(handle: Double): Unit = js.native
  
  @JSGlobal("fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[typings.reactNative.Response] = js.native
  @JSGlobal("fetch")
  @js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.reactNative.Response] = js.native
  
  @JSGlobal("fetchBundle")
  @js.native
  def fetchBundle(bundleId: Double, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  
  @JSGlobal("requestAnimationFrame")
  @js.native
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
  
  @JSGlobal("setImmediate")
  @js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
}
