package typings.reactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.reactNative.anon.DictoptionName
import typings.std.Blob
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  /**
    * Initialize this controller.
    */
  class AbortController ()
    extends typings.reactNative.AbortController
  
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  class AbortSignal ()
    extends typings.reactNative.AbortSignal
  
  @js.native
  class FormData ()
    extends typings.reactNative.FormData
  
  @js.native
  class Headers ()
    extends typings.reactNative.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class MessageQueue ()
    extends typings.reactNative.MessageQueue
  
  @js.native
  class Request protected ()
    extends typings.reactNative.Request {
    def this(input: String) = this()
    def this(input: typings.reactNative.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.reactNative.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.reactNative.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  
  /**
    * Based on definition from lib.dom but using class syntax.
    * The properties are mutable to support users that use a `URL` polyfill, but the implementation
    * built into React Native (as of 0.63) does not implement all the properties.
    */
  @js.native
  class URL protected ()
    extends typings.reactNative.URL {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
  }
  
  /**
    * Based on definitions of lib.dom and lib.dom.iterable
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
    def this(uri: String, protocols: js.UndefOr[scala.Nothing], options: DictoptionName) = this()
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
  def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
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
       with Instantiable2[
          js.UndefOr[/* body */ BodyInit], 
          /* init */ ResponseInit, 
          typings.reactNative.Response
        ] {
    def error(): typings.reactNative.Response = js.native
    def redirect(url: String): typings.reactNative.Response = js.native
    def redirect(url: String, status: Double): typings.reactNative.Response = js.native
  }
  
  /* static members */
  @js.native
  object URL extends js.Object {
    def createObjectURL(blob: Blob): typings.reactNative.URL = js.native
    def revokeObjectURL(url: String): Unit = js.native
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
          js.UndefOr[
            (/* protocols */ js.Array[String]) | (/* protocols */ Null) | (/* protocols */ String)
          ], 
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

