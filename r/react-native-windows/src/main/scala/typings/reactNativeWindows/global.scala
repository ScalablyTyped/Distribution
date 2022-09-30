package typings.reactNativeWindows

import typings.reactNativeWindows.anon.DictoptionName
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
  open class AbortController ()
    extends StObject
       with typings.reactNativeWindows.AbortController {
    
    /**
      * Abort and signal to any observers that the associated activity is to be aborted.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Returns the `AbortSignal` object associated with this object.
      */
    /* CompleteClass */
    override val signal: typings.reactNativeWindows.AbortSignal = js.native
  }
  
  @JSGlobal("AbortSignal")
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  open class AbortSignal ()
    extends StObject
       with typings.reactNativeWindows.AbortSignal
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Blob")
  @js.native
  open class Blob ()
    extends StObject
       with typings.reactNativeWindows.Blob {
    def this(blobParts: js.Array[typings.reactNativeWindows.Blob | String]) = this()
    def this(blobParts: js.Array[typings.reactNativeWindows.Blob | String], options: BlobOptions) = this()
    def this(blobParts: Unit, options: BlobOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileReader")
  @js.native
  open class FileReader ()
    extends StObject
       with typings.reactNativeWindows.FileReader
  object FileReader {
    
    @JSGlobal("FileReader.DONE")
    @js.native
    val DONE: Double = js.native
    
    @JSGlobal("FileReader.EMPTY")
    @js.native
    val EMPTY: Double = js.native
    
    @JSGlobal("FileReader.LOADING")
    @js.native
    val LOADING: Double = js.native
  }
  
  @JSGlobal("FormData")
  @js.native
  open class FormData ()
    extends StObject
       with typings.reactNativeWindows.FormData {
    
    /* CompleteClass */
    override def append(name: String, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def getParts(): js.Array[FormDataPart] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Headers")
  @js.native
  open class Headers ()
    extends StObject
       with typings.reactNativeWindows.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSGlobal("MessageQueue")
  @js.native
  open class MessageQueue ()
    extends StObject
       with typings.reactNativeWindows.MessageQueue {
    
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
    
    inline def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spyOrToggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /* static member */
    inline def spy(spyOrToggle: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spyOrToggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Request")
  @js.native
  open class Request protected ()
    extends StObject
       with typings.reactNativeWindows.Request {
    def this(input: String) = this()
    def this(input: typings.reactNativeWindows.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.reactNativeWindows.Request, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[typings.reactNativeWindows.Blob] = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[typings.reactNativeWindows.FormData] = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /* CompleteClass */
    override val headers: typings.reactNativeWindows.Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override val method: String = js.native
    
    /* CompleteClass */
    override val mode: RequestMode = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
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
  open class Response ()
    extends StObject
       with typings.reactNativeWindows.Response {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[typings.reactNativeWindows.Blob] = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[typings.reactNativeWindows.FormData] = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /* CompleteClass */
    override val headers: typings.reactNativeWindows.Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override val ok: Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
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
    
    inline def error(): typings.reactNativeWindows.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.reactNativeWindows.Response]
    
    inline def redirect(url: String): typings.reactNativeWindows.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeWindows.Response]
    inline def redirect(url: String, status: Double): typings.reactNativeWindows.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.Response]
  }
  
  /**
    * Based on definition from lib.dom but using class syntax.
    * The properties are mutable to support users that use a `URL` polyfill, but the implementation
    * built into React Native (as of 0.63) does not implement all the properties.
    */
  @JSGlobal("URL")
  @js.native
  open class URL protected ()
    extends StObject
       with typings.reactNativeWindows.URL {
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
    override val searchParams: typings.reactNativeWindows.URLSearchParams = js.native
    
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
    inline def createObjectURL(blob: typings.reactNativeWindows.Blob): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(blob.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def revokeObjectURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Based on definitions of lib.dom and lib.dom.iterable
    */
  @JSGlobal("URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends StObject
       with typings.reactNativeWindows.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Array[String]]) = this()
    def this(init: typings.reactNativeWindows.URLSearchParams) = this()
    def this(init: Record[String, String]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebSocket")
  @js.native
  open class WebSocket protected ()
    extends StObject
       with typings.reactNativeWindows.WebSocket {
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
  open class XMLHttpRequest ()
    extends StObject
       with typings.reactNativeWindows.XMLHttpRequest
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
  open class XMLHttpRequestUpload ()
    extends StObject
       with typings.reactNativeWindows.XMLHttpRequestUpload
  
  inline def cancelAnimationFrame(handle: Double): Unit = js.Dynamic.global.applyDynamic("cancelAnimationFrame")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearImmediate(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearInterval(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fetch(input: RequestInfo): js.Promise[typings.reactNativeWindows.Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.reactNativeWindows.Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.reactNativeWindows.Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.reactNativeWindows.Response]]
  
  inline def fetchBundle(bundleId: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = (js.Dynamic.global.applyDynamic("fetchBundle")(bundleId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.Dynamic.global.applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setImmediate(handler: js.Function0[Unit]): Double = js.Dynamic.global.applyDynamic("setImmediate")(handler.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setImmediate[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = (js.Dynamic.global.applyDynamic("setImmediate")(handler.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setInterval(handler: js.Function0[Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setInterval[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    timeout: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setInterval[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    timeout: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setTimeout(handler: js.Function0[Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setTimeout[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    timeout: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setTimeout[Args /* <: js.Array[Any] */](
    handler: js.Function1[/* args */ Args, Unit],
    timeout: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
}
