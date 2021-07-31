package typings.std.global

import typings.std.BodyInit
import typings.std.ResponseInit
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
class Response ()
  extends StObject
     with typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[typings.std.ArrayBuffer] = js.native
  
  /* CompleteClass */
  override def blob(): js.Promise[typings.std.Blob] = js.native
  
  /* CompleteClass */
  override val body: typings.std.ReadableStream[typings.std.Uint8Array] | Null = js.native
  
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /* CompleteClass */
  override def formData(): js.Promise[typings.std.FormData] = js.native
  
  /* CompleteClass */
  override val headers: typings.std.Headers = js.native
  
  /* CompleteClass */
  override def json(): js.Promise[js.Any] = js.native
  
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  
  /* CompleteClass */
  override val status: Double = js.native
  
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
  
  /* CompleteClass */
  override val trailer: js.Promise[typings.std.Headers] = js.native
  
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def error(): typings.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.std.Response]
  
  @scala.inline
  def redirect(url: java.lang.String): typings.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.std.Response]
  @scala.inline
  def redirect(url: java.lang.String, status: Double): typings.std.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.std.Response]
}
