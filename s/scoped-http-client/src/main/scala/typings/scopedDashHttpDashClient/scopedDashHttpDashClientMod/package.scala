package typings.scopedDashHttpDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scopedDashHttpDashClientMod {
  import typings.node.httpMod.ClientRequest
  import typings.node.httpMod.IncomingMessage

  type RequestCallback = js.Function2[/* err */ js.Any, /* request */ ClientRequest, Unit]
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[/* err */ js.Any, /* response */ IncomingMessage, /* body */ String, Unit]
    ], 
    ScopedClient
  ]
  type ScopeCallback = js.Function1[/* scoped */ ScopedClient, Unit]
}
