package typings.sipDotJs

import typings.std.RTCSessionDescriptionInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSessionDashDescriptionDashHandlerMod {
  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ RTCSessionDescriptionInit, 
    js.Promise[RTCSessionDescriptionInit]
  ]
  type SessionDescriptionHandlerModifiers = js.Array[SessionDescriptionHandlerModifier]
}
