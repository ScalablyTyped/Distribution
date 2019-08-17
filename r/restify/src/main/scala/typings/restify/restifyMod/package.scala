package typings.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restifyMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer
  import typings.std.Error

  type FindRouteCallback = js.Function3[/* err */ Error, /* route */ js.UndefOr[Route], /* params */ js.UndefOr[js.Any], Unit]
  type Formatter = js.Function3[/* req */ Request, /* res */ Response, /* body */ js.Any, String | Buffer | Null]
  type Formatters = StringDictionary[Formatter]
  type Next = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ Next, js.Any]
  type RequestHandlerType = RequestHandler | js.Array[RequestHandler]
}
