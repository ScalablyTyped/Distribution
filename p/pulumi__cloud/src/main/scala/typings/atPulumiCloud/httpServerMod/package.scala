package typings.atPulumiCloud

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpServerMod {
  type RequestListenerFactory = js.Function0[js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]]
}
