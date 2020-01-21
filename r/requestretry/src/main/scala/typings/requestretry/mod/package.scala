package typings.requestretry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RetryStrategy = js.Function3[
    /* err */ typings.std.Error, 
    /* response */ typings.node.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Boolean
  ]
}
