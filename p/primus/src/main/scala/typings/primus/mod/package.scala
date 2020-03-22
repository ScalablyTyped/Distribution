package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthorizationHandler = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* done */ js.Function1[
      /* err */ js.UndefOr[java.lang.String | typings.std.Error | typings.primus.AnonAuthenticate], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type Middleware = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
