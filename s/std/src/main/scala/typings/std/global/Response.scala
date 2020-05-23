package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.BodyInit
import typings.std.ResponseInit
import typings.std.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Response")
@js.native
class Response ()
  extends typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: typings.std.ReadableStream[typings.std.Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override val headers: typings.std.Headers = js.native
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[typings.std.Headers] = js.native
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[typings.std.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[typings.std.Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[typings.std.FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[typings.std.Response]
     with Instantiable1[/* body */ BodyInit, typings.std.Response]
     with Instantiable2[
      (/* body */ BodyInit) | (/* body */ Null), 
      /* init */ ResponseInit, 
      typings.std.Response
    ] {
  def error(): typings.std.Response = js.native
  def redirect(url: java.lang.String): typings.std.Response = js.native
  def redirect(url: java.lang.String, status: Double): typings.std.Response = js.native
}

