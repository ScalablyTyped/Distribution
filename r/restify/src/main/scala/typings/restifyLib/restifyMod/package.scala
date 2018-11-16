package typings
package restifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restifyMod {
  type FindRouteCallback = js.Function3[
    /* err */ nodeLib.Error, 
    /* route */ js.UndefOr[Route], 
    /* params */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Formatter = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* body */ js.Any, 
    java.lang.String | nodeLib.Buffer | scala.Null
  ]
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ Next, js.Any]
  type RequestHandlerType = RequestHandler | js.Array[RequestHandler]
}
