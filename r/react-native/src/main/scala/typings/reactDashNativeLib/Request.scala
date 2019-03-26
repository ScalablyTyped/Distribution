package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends stdLib.Object
     with Body {
  val credentials: RequestCredentials_
  val headers: Headers
  val method: java.lang.String
  val mode: RequestMode_
  val referrer: java.lang.String
  val url: java.lang.String
}

@JSGlobal("Request")
@js.native
class RequestCls protected () extends Request {
  def this(input: java.lang.String) = this()
  def this(input: Request) = this()
  def this(input: java.lang.String, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /* CompleteClass */
  override val credentials: RequestCredentials_ = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val method: java.lang.String = js.native
  /* CompleteClass */
  override val mode: RequestMode_ = js.native
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
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

@JSGlobal("Request")
@js.native
object Request
  extends org.scalablytyped.runtime.Instantiable2[
      (/* input */ Request) | (/* input */ java.lang.String), 
      /* init */ RequestInit, 
      Request
    ]
     with org.scalablytyped.runtime.Instantiable1[(/* input */ Request) | (/* input */ java.lang.String), Request]

