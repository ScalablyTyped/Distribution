package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayConnectionMod {
  type ConnectionID = java.lang.String
  type ConnectionMap = org.scalablytyped.runtime.StringDictionary[typings.relayRuntime.relayConnectionMod.ConnectionRecord]
  type GetConnectionEvents = js.Function1[
    /* connectionID */ typings.relayRuntime.relayConnectionMod.ConnectionID, 
    js.Array[typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent]
  ]
}
