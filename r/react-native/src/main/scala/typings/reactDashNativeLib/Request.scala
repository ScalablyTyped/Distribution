package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ 
trait Request extends Body {
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
  extends ScalablyTyped.runtime.Instantiable1[(/* input */ Request) | (/* input */ java.lang.String), Request]
     with ScalablyTyped.runtime.Instantiable2[
      (/* input */ Request) | (/* input */ java.lang.String), 
      /* init */ RequestInit, 
      Request
    ]

