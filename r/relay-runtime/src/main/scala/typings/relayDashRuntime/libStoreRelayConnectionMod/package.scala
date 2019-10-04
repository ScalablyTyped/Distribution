package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStoreRelayConnectionMod {
  import org.scalablytyped.runtime.StringDictionary

  type ConnectionID = String
  type ConnectionMap = StringDictionary[ConnectionRecord]
  type GetConnectionEvents = js.Function1[/* connectionID */ ConnectionID, js.Array[ConnectionInternalEvent]]
}
