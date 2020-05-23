package typings.std

import typings.std.stdStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use XMLHttpRequest (XHR) objects to interact with servers. You can retrieve data from a URL without having to do a full page refresh. This enables a Web page to update just part of a page without disrupting what the user is doing. */
@js.native
trait XMLHttpRequest extends XMLHttpRequestEventTarget {
  val DONE: Double = js.native
  val HEADERS_RECEIVED: Double = js.native
  val LOADING: Double = js.native
  val OPENED: Double = js.native
  val UNSENT: Double = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /**
    * Returns client's state.
    */
  val readyState: Double = js.native
  /**
    * Returns the response's body.
    */
  val response: js.Any = js.native
  /**
    * Returns the text response.
    * 
    * Throws an "InvalidStateError" DOMException if responseType is not the empty string or "text".
    */
  val responseText: java.lang.String = js.native
  /**
    * Returns the response type.
    * 
    * Can be set to change the response type. Values are: the empty string (default), "arraybuffer", "blob", "document", "json", and "text".
    * 
    * When set: setting to "document" is ignored if current global object is not a Window object.
    * 
    * When set: throws an "InvalidStateError" DOMException if state is loading or done.
    * 
    * When set: throws an "InvalidAccessError" DOMException if the synchronous flag is set and current global object is a Window object.
    */
  var responseType: XMLHttpRequestResponseType = js.native
  val responseURL: java.lang.String = js.native
  /**
    * Returns the document response.
    * 
    * Throws an "InvalidStateError" DOMException if responseType is not the empty string or "document".
    */
  val responseXML: Document | Null = js.native
  val status: Double = js.native
  val statusText: java.lang.String = js.native
  /**
    * Can be set to a time in milliseconds. When set to a non-zero value will cause fetching to terminate after the given time has passed. When the time has passed, the request has not yet completed, and the synchronous flag is unset, a timeout event will then be dispatched, or a "TimeoutError" DOMException will be thrown otherwise (for the send() method).
    * 
    * When set: throws an "InvalidAccessError" DOMException if the synchronous flag is set and current global object is a Window object.
    */
  var timeout: Double = js.native
  /**
    * Returns the associated XMLHttpRequestUpload object. It can be used to gather transmission information when data is transferred to a server.
    */
  val upload: XMLHttpRequestUpload = js.native
  /**
    * True when credentials are to be included in a cross-origin request. False when they are to be excluded in a cross-origin request and when cookies are to be ignored in its response. Initially false.
    * 
    * When set: throws an "InvalidStateError" DOMException if state is not unsent or opened, or if the send() flag is set.
    */
  var withCredentials: scala.Boolean = js.native
  /**
    * Cancels any network activity.
    */
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def getAllResponseHeaders(): java.lang.String = js.native
  def getResponseHeader(name: java.lang.String): java.lang.String | Null = js.native
  /**
    * Sets the request method, request URL, and synchronous flag.
    * 
    * Throws a "SyntaxError" DOMException if either method is not a valid HTTP method or url cannot be parsed.
    * 
    * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
    * 
    * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
    */
  def open(method: java.lang.String, url: java.lang.String): Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean): Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean, username: java.lang.String): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    username: java.lang.String,
    password: java.lang.String
  ): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    username: Null,
    password: java.lang.String
  ): Unit = js.native
  /**
    * Acts as if the `Content-Type` header value for response is mime. (It does not actually change the header though.)
    * 
    * Throws an "InvalidStateError" DOMException if state is loading or done.
    */
  def overrideMimeType(mime: java.lang.String): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  /**
    * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
    * 
    * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
    */
  def send(): Unit = js.native
  def send(body: BodyInit): Unit = js.native
  def send(body: Document): Unit = js.native
  /**
    * Combines a header in author request headers.
    * 
    * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
    * 
    * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
    */
  def setRequestHeader(name: java.lang.String, value: java.lang.String): Unit = js.native
}

