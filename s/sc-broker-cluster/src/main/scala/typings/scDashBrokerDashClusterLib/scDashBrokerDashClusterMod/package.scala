package typings
package scDashBrokerDashClusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scDashBrokerDashClusterMod {
  type handlerFunction = js.Function1[/* data */ js.Any, scala.Unit]
  type mapperFunction = js.Function3[
    /* keyChain */ fleximapLib.fleximapMod.KeyChain, 
    /* method */ java.lang.String, 
    /* clientIds */ js.Array[scala.Double], 
    scala.Double | js.Array[scala.Double]
  ]
}
