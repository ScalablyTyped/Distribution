package typings.atPulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiMod {
  type HttpEndpoint = API
  type RouteHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ js.Function0[Unit], Unit]
}
