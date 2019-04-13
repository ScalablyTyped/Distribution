package typings
package resourcejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcejsMod {
  type HttpHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ]
  type MethodBuild[T] = js.Function1[/* options */ js.UndefOr[T], ResourceEndpoint]
}
