package typings.pulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpServerMod {
  type RequestListenerFactory = js.Function0[
    js.Function2[
      /* req */ typings.node.httpMod.IncomingMessage, 
      /* res */ typings.node.httpMod.ServerResponse, 
      scala.Unit
    ]
  ]
}
