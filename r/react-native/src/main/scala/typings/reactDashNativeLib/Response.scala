package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response
  extends stdLib.Object
     with Body {
  val headers: Headers
  val ok: scala.Boolean
  val redirected: scala.Boolean
  val status: scala.Double
  val statusText: java.lang.String
  val `type`: ResponseType_
  val url: java.lang.String
}

@JSGlobal("Response")
@js.native
class ResponseCls () extends Response {
  def this(body: BodyInit_) = this()
  def this(body: BodyInit_, init: ResponseInit) = this()
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  /* CompleteClass */
  override val status: scala.Double = js.native
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  /* CompleteClass */
  override val `type`: ResponseType_ = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[stdLib.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[FormData] = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: stdLib.PropertyKey): scala.Boolean = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: stdLib.PropertyKey): scala.Boolean = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSGlobal("Response")
@js.native
object Response
  extends org.scalablytyped.runtime.Instantiable0[Response]
     with org.scalablytyped.runtime.Instantiable1[/* body */ BodyInit_, Response]
     with org.scalablytyped.runtime.Instantiable2[/* body */ BodyInit_, /* init */ ResponseInit, Response] {
  def error(): reactDashNativeLib.Response = js.native
  def redirect(url: java.lang.String): reactDashNativeLib.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): reactDashNativeLib.Response = js.native
}

