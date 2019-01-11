package typings
package responseDashTimeLib.responseDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("response-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Response time header for node.js
    * Returns middleware that adds a X-Response-Time header to responses.
    */
  def apply(): js.Function3[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, scala.Unit], 
    _
  ] = js.native
  def apply(fn: responseDashTimeLib.responseDashTimeMod.responseTimeNs.ResponseTimeFunction): js.Function3[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, scala.Unit], 
    _
  ] = js.native
  def apply(options: responseDashTimeLib.responseDashTimeMod.responseTimeNs.ResponseTimeOptions): js.Function3[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, scala.Unit], 
    _
  ] = js.native
}

