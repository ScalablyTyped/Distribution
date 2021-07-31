package typings.reactNative

import typings.reactNative.anon.DictoptionName
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AbortController")
  @js.native
  /**
    * Initialize this controller.
    */
  class AbortController ()
    extends StObject
       with typings.reactNative.AbortController {
    
    /**
      * Abort and signal to any observers that the associated activity is to be aborted.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Returns the `AbortSignal` object associated with this object.
      */
    /* CompleteClass */
    override val signal: typings.reactNative.AbortSignal = js.native
  }
  
  @JSGlobal("AbortSignal")
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  class AbortSignal ()
    extends StObject
       with typings.reactNative.AbortSignal {
    
    /**
      * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
    
    /* CompleteClass */
    override def onabort(event: AbortEvent): Unit = js.native
  }
  
  @JSGlobal("FormData")
  @js.native
  class FormData ()
    extends StObject
       with typings.reactNative.FormData {
    
    /* CompleteClass */
    override def append(name: String, value: js.Any): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Headers")
  @js.native
  class Headers ()
    extends StObject
       with typings.reactNative.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSGlobal("MessageQueue")
  @js.native
  class MessageQueue ()
    extends StObject
       with typings.reactNative.MessageQueue {
    
    /* CompleteClass */
    override def getCallableModule(name: String): js.Object = js.native
    
    /* CompleteClass */
    override def registerCallableModule(name: String, module: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
  }
  object MessageQueue {
    
    @JSGlobal("MessageQueue")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spyOrToggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /* static member */
    @scala.inline
    def spy(spyOrToggle: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spyOrToggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Request")
  @js.native
  class Request protected ()
    extends StObject
       with typings.reactNative.Request {
    def this(input: String) = this()
    def this(input: typings.reactNative.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.reactNative.Request, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[typings.reactNative.FormData] = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /* CompleteClass */
    override val headers: typings.reactNative.Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override val method: String = js.native
    
    /* CompleteClass */
    override val mode: RequestMode = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
    
    /* CompleteClass */
    override val referrer: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override val url: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Response")
  @js.native
  class Response ()
    extends StObject
       with typings.reactNative.Response {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[typings.reactNative.FormData] = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /* CompleteClass */
    override val headers: typings.reactNative.Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override val ok: Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
    
    /* CompleteClass */
    override val redirected: Boolean = js.native
    
    /* CompleteClass */
    override val status: Double = js.native
    
    /* CompleteClass */
    override val statusText: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override val `type`: ResponseType = js.native
    
    /* CompleteClass */
    override val url: String = js.native
  }
  object Response {
    
    @JSGlobal("Response")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def error(): typings.reactNative.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.reactNative.Response]
    
    @scala.inline
    def redirect(url: String): typings.reactNative.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.reactNative.Response]
    @scala.inline
    def redirect(url: String, status: Double): typings.reactNative.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.Response]
  }
  
  /**
    * Based on definition from lib.dom but using class syntax.
    * The properties are mutable to support users that use a `URL` polyfill, but the implementation
    * built into React Native (as of 0.63) does not implement all the properties.
    */
  @JSGlobal("URL")
  @js.native
  class URL protected ()
    extends StObject
       with typings.reactNative.URL {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    
    /* CompleteClass */
    var hash: String = js.native
    
    /* CompleteClass */
    var host: String = js.native
    
    /* CompleteClass */
    var hostname: String = js.native
    
    /* CompleteClass */
    var href: String = js.native
    
    /* CompleteClass */
    override val origin: String = js.native
    
    /* CompleteClass */
    var password: String = js.native
    
    /* CompleteClass */
    var pathname: String = js.native
    
    /* CompleteClass */
    var port: String = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
    
    /* CompleteClass */
    var search: String = js.native
    
    /* CompleteClass */
    override val searchParams: typings.reactNative.URLSearchParams = js.native
    
    /* CompleteClass */
    override def toJSON(): String = js.native
    
    /* CompleteClass */
    var username: String = js.native
  }
  object URL {
    
    @JSGlobal("URL")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def createObjectURL(blob: Blob): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(blob.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    @scala.inline
    def revokeObjectURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Based on definitions of lib.dom and lib.dom.iterable
    */
  @JSGlobal("URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends StObject
       with typings.reactNative.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Array[String]]) = this()
    def this(init: typings.reactNative.URLSearchParams) = this()
    def this(init: Record[String, String]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebSocket")
  @js.native
  class WebSocket protected ()
    extends StObject
       with typings.reactNative.WebSocket {
    def this(uri: String) = this()
    def this(uri: String, protocols: String) = this()
    def this(uri: String, protocols: js.Array[String]) = this()
    def this(uri: String, protocols: String, options: DictoptionName) = this()
    def this(uri: String, protocols: js.Array[String], options: DictoptionName) = this()
    def this(uri: String, protocols: Null, options: DictoptionName) = this()
    def this(uri: String, protocols: Unit, options: DictoptionName) = this()
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
    extends StObject
       with typings.reactNative.XMLHttpRequest
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
    extends StObject
       with typings.reactNative.XMLHttpRequestUpload
  
  @scala.inline
  def cancelAnimationFrame(handle: Double): Unit = js.Dynamic.global.applyDynamic("cancelAnimationFrame")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearImmediate(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearInterval(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearTimeout(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def fetch(input: RequestInfo): js.Promise[typings.reactNative.Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.reactNative.Response]]
  @scala.inline
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.reactNative.Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.reactNative.Response]]
  
  @scala.inline
  def fetchBundle(bundleId: Double, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = (js.Dynamic.global.applyDynamic("fetchBundle")(bundleId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.Dynamic.global.applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.Dynamic.global.applyDynamic("setImmediate")(handler.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setInterval(handler: js.Any, timeout: Unit, args: js.Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setInterval(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(handler: js.Any, timeout: Unit, args: js.Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
}
