package typings.resourcejs

import typings.express.expressMod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcejsMod {
  type HttpHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
  type MethodBuild[T] = js.Function1[/* options */ js.UndefOr[T], ResourceEndpoint]
}
