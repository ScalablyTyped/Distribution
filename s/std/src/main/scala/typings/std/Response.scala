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
object Response
  extends Instantiable1[/* body */ BodyInit, Response]
     with Instantiable0[Response]
     with Instantiable2[(/* body */ BodyInit) | (/* body */ Null), /* init */ ResponseInit, Response] {
  def error(): Response = js.native
  def redirect(url: java.lang.String): Response = js.native
  def redirect(url: java.lang.String, status: Double): Response = js.native
}

