package typings.reactDashNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ArrayBuffer
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response
  extends Object
     with Body {
  val headers: Headers
  val ok: Boolean
  val redirected: Boolean
  val status: Double
  val statusText: String
  val `type`: ResponseType_
  val url: String
}

@JSGlobal("Response")
@js.native
class ResponseCls () extends Response {
  def this(body: BodyInit_) = this()
  def this(body: BodyInit_, init: ResponseInit) = this()
  /* CompleteClass */
  override val bodyUsed: Boolean = js.native
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val ok: Boolean = js.native
  /* CompleteClass */
  override val redirected: Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: String = js.native
  /* CompleteClass */
  override val `type`: ResponseType_ = js.native
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

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[Response]
     with Instantiable1[/* body */ BodyInit_, Response]
     with Instantiable2[/* body */ BodyInit_, /* init */ ResponseInit, Response] {
  def error(): Response = js.native
  def redirect(url: String): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}

