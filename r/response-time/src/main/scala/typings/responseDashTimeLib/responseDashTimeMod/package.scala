package typings
package responseDashTimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object responseDashTimeMod {
  type ResponseTimeFunction = js.Function3[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    /* time */ scala.Double, 
    js.Any
  ]
}
