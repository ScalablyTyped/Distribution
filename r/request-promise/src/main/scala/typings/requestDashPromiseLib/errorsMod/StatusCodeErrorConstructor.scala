package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends nodeLib.Error
     with ScalablyTyped.runtime.Instantiable4[
      /* statusCode */ scala.Double, 
      /* body */ js.Any, 
      /* options */ requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options, 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      StatusCodeError
    ] {
  def apply(
    statusCode: scala.Double,
    body: js.Any,
    options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options,
    response: nodeLib.httpMod.IncomingMessage
  ): StatusCodeError = js.native
}

