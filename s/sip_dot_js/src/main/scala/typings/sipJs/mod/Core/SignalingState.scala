package typings.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SignalingState")
@js.native
object SignalingState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.libCoreSessionSessionMod.SignalingState & String] = js.native
  
  /* "Closed" */ val Closed: typings.sipJs.libCoreSessionSessionMod.SignalingState.Closed & String = js.native
  
  /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer & String = js.native
  
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer & String = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.libCoreSessionSessionMod.SignalingState.Initial & String = js.native
  
  /* "Stable" */ val Stable: typings.sipJs.libCoreSessionSessionMod.SignalingState.Stable & String = js.native
}
