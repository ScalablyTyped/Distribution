package typings
package scopedDashHttpDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scopedDashHttpDashClientMod {
  type RequestCallback = js.Function2[/* err */ js.Any, /* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[
        /* err */ js.Any, 
        /* response */ nodeLib.httpMod.IncomingMessage, 
        /* body */ java.lang.String, 
        scala.Unit
      ]
    ], 
    ScopedClient
  ]
  type ScopeCallback = js.Function1[/* scoped */ ScopedClient, scala.Unit]
}
