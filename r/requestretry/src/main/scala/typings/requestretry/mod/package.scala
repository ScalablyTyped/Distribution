package typings.requestretry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DelayStrategy = js.Function3[
    /* err */ typings.std.Error, 
    /* response */ typings.node.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Double
  ]
  
  type RetryStrategy = js.Function3[
    /* err */ typings.std.Error, 
    /* response */ typings.node.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Boolean
  ]
}
