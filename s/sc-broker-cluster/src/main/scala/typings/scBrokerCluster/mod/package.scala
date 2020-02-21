package typings.scBrokerCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrokerMessageListener = js.Function3[
    /* brokerId */ java.lang.String, 
    /* data */ js.Any, 
    /* callback */ js.Function2[/* err */ typings.std.Error | scala.Null, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type handlerFunction = js.Function1[/* data */ js.Any, scala.Unit]
  type mapperFunction = js.Function3[
    /* keyChain */ typings.fleximap.mod.KeyChain, 
    /* method */ java.lang.String, 
    /* clientIds */ js.Array[scala.Double], 
    scala.Double | js.Array[scala.Double]
  ]
}
