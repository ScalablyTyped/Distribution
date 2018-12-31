package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends stdLib.Object
     with Body {
  val credentials: `RequestCredentials_`
  val headers: Headers
  val method: java.lang.String
  val mode: `RequestMode_`
  val referrer: java.lang.String
  val url: java.lang.String
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

