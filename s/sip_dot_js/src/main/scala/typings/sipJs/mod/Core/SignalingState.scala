package typings.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SignalingState")
@js.native
object SignalingState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SignalingState with String] = js.native
  
  /* "Closed" */ val Closed: typings.sipJs.sessionSessionMod.SignalingState.Closed with String = js.native
  
  /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipJs.sessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
  
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipJs.sessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SignalingState.Initial with String = js.native
  
  /* "Stable" */ val Stable: typings.sipJs.sessionSessionMod.SignalingState.Stable with String = js.native
}
