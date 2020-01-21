package typings.scBrokerCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type handlerFunction = js.Function1[/* data */ js.Any, scala.Unit]
  type mapperFunction = js.Function3[
    /* keyChain */ typings.fleximap.mod.KeyChain, 
    /* method */ java.lang.String, 
    /* clientIds */ js.Array[scala.Double], 
    scala.Double | js.Array[scala.Double]
  ]
}
