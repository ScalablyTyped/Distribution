package typings.reactDashNative

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends Object
     with Body {
  val credentials: RequestCredentials_
  val headers: Headers
  val method: String
  val mode: RequestMode_
  val referrer: String
  val url: String
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[(/* input */ Request) | (/* input */ String), Request]
     with Instantiable2[(/* input */ Request) | (/* input */ String), /* init */ RequestInit, Request]

