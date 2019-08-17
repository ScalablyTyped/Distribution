package typings.atPulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpServerMod {
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse

  type RequestListenerFactory = js.Function0[js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]]
}
