package typings.scopedHttpClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestCallback = js.Function2[/* err */ js.Any, /* request */ typings.node.httpMod.ClientRequest, scala.Unit]
  
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[
        /* err */ js.Any, 
        /* response */ typings.node.httpMod.IncomingMessage, 
        /* body */ java.lang.String, 
        scala.Unit
      ]
    ], 
    typings.scopedHttpClient.mod.ScopedClient
  ]
  
  type ScopeCallback = js.Function1[/* scoped */ typings.scopedHttpClient.mod.ScopedClient, scala.Unit]
}
