package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// addListener

trait ListenerParameters extends js.Object {
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, scala.Unit]] = js.undefined
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, scala.Unit]] = js.undefined
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, scala.Unit]] = js.undefined
}

