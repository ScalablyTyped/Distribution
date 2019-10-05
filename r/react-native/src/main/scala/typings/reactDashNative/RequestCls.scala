package typings.reactDashNative

import typings.std.ArrayBuffer
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Request")
@js.native
class RequestCls protected () extends Request {
  def this(input: String) = this()
  def this(input: Request) = this()
  def this(input: String, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  /* CompleteClass */
  override val bodyUsed: Boolean = js.native
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /* CompleteClass */
  override val credentials: RequestCredentials_ = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val method: String = js.native
  /* CompleteClass */
  override val mode: RequestMode_ = js.native
  /* CompleteClass */
  override val referrer: String = js.native
  /* CompleteClass */
  override val url: String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[FormData] = js.native
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

