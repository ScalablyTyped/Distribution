package typings
package resourcejsLib.resourcejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcejsNs {
  type HttpHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ]
  type MethodBuild[T] = js.Function1[/* options */ js.UndefOr[T], ResourceEndpoint]
}
