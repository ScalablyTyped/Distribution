package typings.responseTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResponseTimeFunction = js.Function3[
    /* request */ typings.node.httpMod.IncomingMessage, 
    /* response */ typings.node.httpMod.ServerResponse, 
    /* time */ scala.Double, 
    js.Any
  ]
}
