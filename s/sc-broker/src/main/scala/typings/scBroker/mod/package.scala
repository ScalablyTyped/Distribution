package typings.scBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BrokerMessageListener = js.Function3[
    /* brokerId */ java.lang.String, 
    /* data */ js.Any, 
    /* callback */ js.Function2[/* err */ typings.std.Error | scala.Null, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
}
