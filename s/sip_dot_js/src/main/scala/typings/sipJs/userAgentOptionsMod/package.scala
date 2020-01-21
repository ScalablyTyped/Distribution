package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object userAgentOptionsMod {
  type LogConnector = js.Function4[
    /* level */ typings.sipJs.userAgentOptionsMod.LogLevel, 
    /* category */ java.lang.String, 
    /* label */ js.UndefOr[java.lang.String], 
    /* content */ java.lang.String, 
    scala.Unit
  ]
}
