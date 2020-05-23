package typings.reactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.reactNative.anon.DictoptionName
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.PropertyKey
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  /**
    * Initialize this controller.
    */
  class AbortController ()
    extends typings.reactNative.AbortController {
    /**
      * Returns the `AbortSignal` object associated with this object.
      */
    /* CompleteClass */
    override val signal: typings.reactNative.AbortSignal = js.native
    /**
      * Abort and signal to any observers that the associated activity is to be aborted.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
  }
  
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  class AbortSignal ()
    extends typings.reactNative.AbortSignal {
    /**
      * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
    /* CompleteClass */
    override def onabort(event: AbortEvent): Unit = js.native
  }
  
  @js.native
  class FormData ()
    extends typings.reactNative.FormData {
    /* CompleteClass */
    override def append(name: String, value: js.Any): Unit = js.native
  }
  
  @js.native
  class Headers ()
    extends typings.reactNative.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class MessageQueue ()
    extends typings.reactNative.MessageQueue {
    /* CompleteClass */
    override def getCallableModule(name: String): js.Object = js.native
    /* CompleteClass */
    override def registerCallableModule(name: String, module: js.Object): Unit = js.native
    /* CompleteClass */
    override def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
  }
  
  @js.native
  class Request protected ()
    extends typings.reactNative.Request {
    def this(input: String) = this()
    def this(input: typings.reactNative.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.reactNative.Request, init: RequestInit) = this()
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* CompleteClass */
    override var constructor: js.Function = js.native
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    /* CompleteClass */
    override val headers: typings.reactNative.Headers = js.native
    /* CompleteClass */
    override val method: String = js.native
    /* CompleteClass */
    override val mode: RequestMode = js.native
    /* CompleteClass */
    override val referrer: String = js.native
    /* CompleteClass */
    override val url: String = js.native
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    /* CompleteClass */
    override def formData(): js.Promise[typings.reactNative.FormData] = js.native
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    /* CompleteClass */
    override def json(): js.Promise[_] = js.native
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
  }
  
  @js.native
  class Response ()
    extends typings.reactNative.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* CompleteClass */
    override var constructor: js.Function = js.native
    /* CompleteClass */
    override val headers: typings.reactNative.Headers = js.native
    /* CompleteClass */
    override val ok: Boolean = js.native
    /* CompleteClass */
    override val redirected: Boolean = js.native
    /* CompleteClass */
    override val status: Double = js.native
    /* CompleteClass */
    override val statusText: String = js.native
    /* CompleteClass */
    override val `type`: ResponseType = js.native
    /* CompleteClass */
    override val url: String = js.native
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    /* CompleteClass */
    override def formData(): js.Promise[typings.reactNative.FormData] = js.native
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    /* CompleteClass */
    override def json(): js.Promise[_] = js.native
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
  }
  
  /**
    * Based on definitions of lib.dom and  lib.dom.iteralbe
    */
  @js.native
  class URLSearchParams ()
    extends typings.reactNative.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Array[String]]) = this()
    def this(init: typings.reactNative.URLSearchParams) = this()
    def this(init: Record[String, String]) = this()
  }
  
  @js.native
  class WebSocket protected ()
    extends typings.reactNative.WebSocket {
    def this(uri: String) = this()
    def this(uri: String, protocols: String) = this()
    def this(uri: String, protocols: js.Array[String]) = this()
    def this(uri: String, protocols: String, options: DictoptionName) = this()
    def this(uri: String, protocols: js.Array[String], options: DictoptionName) = this()
    def this(uri: String, protocols: Null, options: DictoptionName) = this()
  }
  
  @js.native
  class XMLHttpRequest ()
    extends typings.reactNative.XMLHttpRequest
  
  @js.native
  class XMLHttpRequestUpload ()
    extends typings.reactNative.XMLHttpRequestUpload
  
  def cancelAnimationFrame(handle: Double): Unit = js.native
  def clearImmediate(handle: Double): Unit = js.native
  def clearInterval(handle: Double): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  def fetch(input: RequestInfo): js.Promise[typings.reactNative.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.reactNative.Response] = js.native
  def fetchBundle(bundleId: Double, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  def setInterval(handler: js.Any): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  def setTimeout(handler: js.Any): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  @js.native
  object Headers
    extends Instantiable0[typings.reactNative.Headers]
       with Instantiable1[/* init */ HeadersInit, typings.reactNative.Headers]
  
  /* static members */
  @js.native
  object MessageQueue extends js.Object {
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
    def spy(spyOrToggle: Boolean): Unit = js.native
  }
  
  @js.native
  object Request
    extends Instantiable1[
          (/* input */ typings.reactNative.Request) | (/* input */ String), 
          typings.reactNative.Request
        ]
       with Instantiable2[
          (/* input */ typings.reactNative.Request) | (/* input */ String), 
          /* init */ RequestInit, 
          typings.reactNative.Request
        ]
  
  @js.native
  object Response
    extends Instantiable0[typings.reactNative.Response]
       with Instantiable1[/* body */ BodyInit, typings.reactNative.Response]
       with Instantiable2[/* body */ BodyInit, /* init */ ResponseInit, typings.reactNative.Response] {
    def error(): typings.reactNative.Response = js.native
    def redirect(url: String): typings.reactNative.Response = js.native
    def redirect(url: String, status: Double): typings.reactNative.Response = js.native
  }
  
  @js.native
  object WebSocket
    extends Instantiable1[/* uri */ String, typings.reactNative.WebSocket]
       with Instantiable2[
          /* uri */ String, 
          (/* protocols */ js.Array[String]) | (/* protocols */ String), 
          typings.reactNative.WebSocket
        ]
       with Instantiable3[
          /* uri */ String, 
          (/* protocols */ js.Array[String]) | (/* protocols */ Null) | (/* protocols */ String), 
          /* options */ DictoptionName, 
          typings.reactNative.WebSocket
        ] {
    val CLOSED: Double = js.native
    val CLOSING: Double = js.native
    val CONNECTING: Double = js.native
    val OPEN: Double = js.native
  }
  
  @js.native
  object XMLHttpRequest
    extends Instantiable0[typings.reactNative.XMLHttpRequest] {
    val DONE: Double = js.native
    val HEADERS_RECEIVED: Double = js.native
    val LOADING: Double = js.native
    val OPENED: Double = js.native
    val UNSENT: Double = js.native
  }
  
  @js.native
  object XMLHttpRequestUpload
    extends Instantiable0[typings.reactNative.XMLHttpRequestUpload]
  
}

