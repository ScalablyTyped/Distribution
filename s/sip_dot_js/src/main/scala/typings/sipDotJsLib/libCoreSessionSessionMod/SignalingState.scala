package typings
package sipDotJsLib.libCoreSessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignalingState extends js.Object

@JSImport("sip.js/lib/Core/session/session", "SignalingState")
@js.native
object SignalingState extends js.Object {
  @js.native
  sealed trait Closed
    extends sipDotJsLib.libCoreSessionSessionMod.SignalingState
  
  @js.native
  sealed trait HaveLocalOffer
    extends sipDotJsLib.libCoreSessionSessionMod.SignalingState
  
  @js.native
  sealed trait HaveRemoteOffer
    extends sipDotJsLib.libCoreSessionSessionMod.SignalingState
  
  @js.native
  sealed trait Initial
    extends sipDotJsLib.libCoreSessionSessionMod.SignalingState
  
  @js.native
  sealed trait Stable
    extends sipDotJsLib.libCoreSessionSessionMod.SignalingState
  
  /* "Closed" */ val Closed: Closed with java.lang.String = js.native
  /* "HaveLocalOffer" */ val HaveLocalOffer: HaveLocalOffer with java.lang.String = js.native
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: HaveRemoteOffer with java.lang.String = js.native
  /* "Initial" */ val Initial: Initial with java.lang.String = js.native
  /* "Stable" */ val Stable: Stable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.SignalingState with java.lang.String] = js.native
}

