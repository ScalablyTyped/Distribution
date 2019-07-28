package typings.requestDashPromise.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typings.node.httpMod.IncomingMessage
import typings.requestDashPromise.requestDashPromiseMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends Error
     with Instantiable4[
      /* statusCode */ Double, 
      /* body */ js.Any, 
      /* options */ Options, 
      /* response */ IncomingMessage, 
      StatusCodeError
    ] {
  def apply(statusCode: Double, body: js.Any, options: Options, response: IncomingMessage): StatusCodeError = js.native
}

