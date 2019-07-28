package typings.scDashBrokerDashCluster

import typings.fleximap.fleximapMod.KeyChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scDashBrokerDashClusterMod {
  type handlerFunction = js.Function1[/* data */ js.Any, Unit]
  type mapperFunction = js.Function3[
    /* keyChain */ KeyChain, 
    /* method */ String, 
    /* clientIds */ js.Array[Double], 
    Double | js.Array[Double]
  ]
}
