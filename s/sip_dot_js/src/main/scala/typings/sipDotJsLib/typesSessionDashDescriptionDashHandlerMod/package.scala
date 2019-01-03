package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSessionDashDescriptionDashHandlerMod {
  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ stdLib.RTCSessionDescriptionInit, 
    js.Promise[stdLib.RTCSessionDescriptionInit]
  ]
  type SessionDescriptionHandlerModifiers = js.Array[SessionDescriptionHandlerModifier]
  type SessionDescriptionHandlerOptions = js.Object
}
