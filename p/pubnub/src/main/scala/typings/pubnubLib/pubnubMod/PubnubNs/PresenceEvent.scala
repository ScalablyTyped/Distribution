package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PresenceEvent extends js.Object {
  var action: pubnubLib.pubnubLibStrings.join | pubnubLib.pubnubLibStrings.leave | pubnubLib.pubnubLibStrings.`state-change` | pubnubLib.pubnubLibStrings.timeout
  /**
       * @deprecated
       */
  var actualChannel: java.lang.String
  var channel: java.lang.String
  var occupancy: scala.Double
  var state: js.UndefOr[js.Any] = js.undefined
  /**
       * @deprecated
       */
  var subscribedChannel: java.lang.String
  var subscription: java.lang.String
  var timestamp: scala.Double
  var timetoken: java.lang.String
  var uuid: java.lang.String
}

