package typings.resourcejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpHandler = js.Function3[
    /* req */ typings.resourcejs.mod.Request, 
    /* res */ typings.resourcejs.mod.Response, 
    /* next */ typings.express.mod.NextFunction, 
    scala.Unit
  ]
  type MethodBuild[T] = js.Function1[/* options */ js.UndefOr[T], typings.resourcejs.mod.ResourceEndpoint]
}
