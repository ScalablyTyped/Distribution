package typings.sipJs

import typings.sipJs.anon.FromDisplayName
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.sessionOptionsMod.SessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inviterOptionsMod {
  
  trait InviterOptions
    extends StObject
       with SessionOptions {
    
    /** If true, an anonymous call. */
    var anonymous: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the first answer to the local offer is immediately utilized for media.
      * Requires that the INVITE request MUST NOT fork.
      * Has no effect if `inviteWithoutSdp` is true.
      * Default is false.
      */
    var earlyMedia: js.UndefOr[Boolean] = js.undefined
    
    /** Array of extra headers added to the INVITE. */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /** If true, send INVITE without SDP. Default is false. */
    var inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated TODO: provide alternative. */
    var params: js.UndefOr[FromDisplayName] = js.undefined
    
    /** @deprecated TODO: provide alternative. */
    var renderbody: js.UndefOr[String] = js.undefined
    
    /** @deprecated TODO: provide alternative. */
    var rendertype: js.UndefOr[String] = js.undefined
    
    /** Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction. */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
    
    /** Modifiers to pass to SessionDescriptionHandler during re-INVITE transactions. */
    var sessionDescriptionHandlerModifiersReInvite: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
    
    /** Options to pass to SessionDescriptionHandler during the initial INVITE transaction. */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
    
    /** Options to pass to SessionDescriptionHandler during re-INVITE transactions. */
    var sessionDescriptionHandlerOptionsReInvite: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
  }
  object InviterOptions {
    
    inline def apply(): InviterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviterOptions]
    }
    
    extension [Self <: InviterOptions](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setEarlyMedia(value: Boolean): Self = StObject.set(x, "earlyMedia", value.asInstanceOf[js.Any])
      
      inline def setEarlyMediaUndefined: Self = StObject.set(x, "earlyMedia", js.undefined)
      
      inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value*))
      
      inline def setInviteWithoutSdp(value: Boolean): Self = StObject.set(x, "inviteWithoutSdp", value.asInstanceOf[js.Any])
      
      inline def setInviteWithoutSdpUndefined: Self = StObject.set(x, "inviteWithoutSdp", js.undefined)
      
      inline def setParams(value: FromDisplayName): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRenderbody(value: String): Self = StObject.set(x, "renderbody", value.asInstanceOf[js.Any])
      
      inline def setRenderbodyUndefined: Self = StObject.set(x, "renderbody", js.undefined)
      
      inline def setRendertype(value: String): Self = StObject.set(x, "rendertype", value.asInstanceOf[js.Any])
      
      inline def setRendertypeUndefined: Self = StObject.set(x, "rendertype", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerModifiersReInvite(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiersReInvite", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerModifiersReInviteUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiersReInvite", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiersReInviteVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiersReInvite", js.Array(value*))
      
      inline def setSessionDescriptionHandlerModifiersUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.Array(value*))
      
      inline def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerOptionsReInvite(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptionsReInvite", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerOptionsReInviteUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptionsReInvite", js.undefined)
      
      inline def setSessionDescriptionHandlerOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptions", js.undefined)
    }
  }
}
