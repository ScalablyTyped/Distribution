package typings.reactDashNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Object
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
object Response
  extends Instantiable0[Response]
     with Instantiable1[/* body */ BodyInit_, Response]
     with Instantiable2[/* body */ BodyInit_, /* init */ ResponseInit, Response] {
  def error(): Response = js.native
  def redirect(url: String): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}

