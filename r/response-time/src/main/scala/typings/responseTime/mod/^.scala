package typings.responseTime.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
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
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
  def apply(
    fn: js.Function3[
      /* request */ Request_[ParamsDictionary], 
      /* response */ Response_, 
      /* time */ Double, 
      _
    ]
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(options: ResponseTimeOptions): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
}

