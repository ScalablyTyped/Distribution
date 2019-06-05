package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SignalingState")
@js.native
object SignalingState extends js.Object {
  /* "Closed" */ val Closed: sipDotJsLib.libCoreSessionSessionMod.SignalingState.Closed with java.lang.String = js.native
  /* "HaveLocalOffer" */ val HaveLocalOffer: sipDotJsLib.libCoreSessionSessionMod.SignalingState.HaveLocalOffer with java.lang.String = js.native
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: sipDotJsLib.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer with java.lang.String = js.native
  /* "Initial" */ val Initial: sipDotJsLib.libCoreSessionSessionMod.SignalingState.Initial with java.lang.String = js.native
  /* "Stable" */ val Stable: sipDotJsLib.libCoreSessionSessionMod.SignalingState.Stable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.SignalingState with java.lang.String] = js.native
}

