package typings
package responseDashTimeLib.responseDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object responseTimeNs {
  type ResponseTimeFunction = js.Function3[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    /* time */ scala.Double, 
    js.Any
  ]
}
