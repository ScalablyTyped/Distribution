package typings.signalr.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HubNs {
  type HubCreator = js.Function2[
    /* url */ js.UndefOr[String], 
    /* options */ js.UndefOr[Options], 
    typings.signalr.SignalRNs.HubNs.Connection
  ]
}
