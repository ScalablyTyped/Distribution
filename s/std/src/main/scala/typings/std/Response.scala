package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents the response to a request. */
trait Response extends Body {
  val headers: Headers
  val ok: scala.Boolean
  val redirected: scala.Boolean
  val status: Double
  val statusText: java.lang.String
  val trailer: js.Promise[Headers]
  val `type`: ResponseType
  val url: java.lang.String
}

@JSGlobal("Response")
@js.native
class ResponseCls () extends Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: ReadableStream[Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[Headers] = js.native
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable1[/* body */ BodyInit, Response]
     with Instantiable0[Response]
     with Instantiable2[(/* body */ BodyInit) | (/* body */ Null), /* init */ ResponseInit, Response] {
  def error(): Response = js.native
  def redirect(url: java.lang.String): Response = js.native
  def redirect(url: java.lang.String, status: Double): Response = js.native
}

