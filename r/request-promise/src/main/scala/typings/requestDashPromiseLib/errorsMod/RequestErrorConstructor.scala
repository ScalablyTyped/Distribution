package typings
package requestDashPromiseLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestErrorConstructor
  extends ScalablyTyped.runtime.Instantiable3[
      /* cause */ js.Any, 
      /* options */ requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options, 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      RequestError
    ] {
  def apply(
    cause: js.Any,
    options: requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs.Options,
    response: nodeLib.httpMod.IncomingMessage
  ): RequestError = js.native
}

