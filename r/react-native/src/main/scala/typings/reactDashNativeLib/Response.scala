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
  val `type`: `ResponseType_`
  val url: java.lang.String
}

@JSGlobal("Response")
@js.native
object Response
  extends org.scalablytyped.runtime.Instantiable0[Response]
     with org.scalablytyped.runtime.Instantiable1[/* body */ `BodyInit_`, Response]
     with org.scalablytyped.runtime.Instantiable2[/* body */ `BodyInit_`, /* init */ ResponseInit, Response] {
  def error(): reactDashNativeLib.Response = js.native
  def redirect(url: java.lang.String): reactDashNativeLib.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): reactDashNativeLib.Response = js.native
}

