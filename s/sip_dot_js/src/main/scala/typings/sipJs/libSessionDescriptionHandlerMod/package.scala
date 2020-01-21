package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSessionDescriptionHandlerMod {
  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ typings.std.RTCSessionDescriptionInit, 
    js.Promise[typings.std.RTCSessionDescriptionInit]
  ]
  type SessionDescriptionHandlerModifiers = js.Array[typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier]
}
