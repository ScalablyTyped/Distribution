package typings.responseDashTime

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object responseDashTimeMod {
  type ResponseTimeFunction = js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* time */ Double, 
    js.Any
  ]
}
