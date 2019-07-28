package typings.requestDashPromise.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typings.node.httpMod.IncomingMessage
import typings.requestDashPromise.requestDashPromiseMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends Error
     with Instantiable3[
      /* cause */ js.Any, 
      /* options */ Options, 
      /* response */ IncomingMessage, 
      TransformError
    ] {
  def apply(cause: js.Any, options: Options, response: IncomingMessage): TransformError = js.native
}

