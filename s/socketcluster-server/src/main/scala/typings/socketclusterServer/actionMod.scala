package typings.socketclusterServer

import typings.node.httpMod.IncomingMessage
import typings.scErrors.mod.AuthTokenExpiredError
import typings.socketclusterServer.serversocketMod.AuthToken
import typings.socketclusterServer.socketclusterServerStrings.allowed
import typings.socketclusterServer.socketclusterServerStrings.blocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("socketcluster-server/action", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AGAction {
    
    /* CompleteClass */
    override val AUTHENTICATE: /* "authenticate" */ String = js.native
    
    /* CompleteClass */
    override val HANDSHAKE_SC: /* "handshakeSC" */ String = js.native
    
    /* CompleteClass */
    override val HANDSHAKE_WS: /* "handshakeWS" */ String = js.native
    
    /* CompleteClass */
    override val INVOKE: /* "invoke" */ String = js.native
    
    /* CompleteClass */
    override val MESSAGE: /* "message" */ String = js.native
    
    /* CompleteClass */
    override val PUBLISH_IN: /* "publishIn" */ String = js.native
    
    /* CompleteClass */
    override val PUBLISH_OUT: /* "publishOut" */ String = js.native
    
    /* CompleteClass */
    override val SUBSCRIBE: /* "subscribe" */ String = js.native
    
    /* CompleteClass */
    override val TRANSMIT: /* "transmit" */ String = js.native
    
    /* CompleteClass */
    override def allow(packet: Any): Unit = js.native
    
    /* CompleteClass */
    override def block(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    var outcome: Null | allowed | blocked = js.native
    
    /* CompleteClass */
    var promise: js.Promise[Any] = js.native
    
    /* CompleteClass */
    var `type`: /* "handshakeWS" */ String = js.native
  }
  
  trait AGAction extends StObject {
    
    val AUTHENTICATE: /* "authenticate" */ String
    
    val HANDSHAKE_SC: /* "handshakeSC" */ String
    
    val HANDSHAKE_WS: /* "handshakeWS" */ String
    
    val INVOKE: /* "invoke" */ String
    
    val MESSAGE: /* "message" */ String
    
    val PUBLISH_IN: /* "publishIn" */ String
    
    val PUBLISH_OUT: /* "publishOut" */ String
    
    val SUBSCRIBE: /* "subscribe" */ String
    
    val TRANSMIT: /* "transmit" */ String
    
    def allow(packet: Any): Unit
    
    var authToken: js.UndefOr[AuthToken] = js.undefined
    
    var authTokenExpiredError: js.UndefOr[AuthTokenExpiredError] = js.undefined
    
    def block(error: js.Error): Unit
    
    var channel: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var outcome: Null | allowed | blocked
    
    var procedure: js.UndefOr[String] = js.undefined
    
    var promise: js.Promise[Any]
    
    var receiver: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[IncomingMessage] = js.undefined
    
    var signedAuthToken: js.UndefOr[String] = js.undefined
    
    var socket: js.UndefOr[typings.socketclusterServer.serversocketMod.^] = js.undefined
    
    var `type`: /* "handshakeWS" */ String
  }
  object AGAction {
    
    inline def apply(
      AUTHENTICATE: /* "authenticate" */ String,
      HANDSHAKE_SC: /* "handshakeSC" */ String,
      HANDSHAKE_WS: /* "handshakeWS" */ String,
      INVOKE: /* "invoke" */ String,
      MESSAGE: /* "message" */ String,
      PUBLISH_IN: /* "publishIn" */ String,
      PUBLISH_OUT: /* "publishOut" */ String,
      SUBSCRIBE: /* "subscribe" */ String,
      TRANSMIT: /* "transmit" */ String,
      allow: Any => Unit,
      block: js.Error => Unit,
      promise: js.Promise[Any],
      `type`: /* "handshakeWS" */ String
    ): AGAction = {
      val __obj = js.Dynamic.literal(AUTHENTICATE = AUTHENTICATE.asInstanceOf[js.Any], HANDSHAKE_SC = HANDSHAKE_SC.asInstanceOf[js.Any], HANDSHAKE_WS = HANDSHAKE_WS.asInstanceOf[js.Any], INVOKE = INVOKE.asInstanceOf[js.Any], MESSAGE = MESSAGE.asInstanceOf[js.Any], PUBLISH_IN = PUBLISH_IN.asInstanceOf[js.Any], PUBLISH_OUT = PUBLISH_OUT.asInstanceOf[js.Any], SUBSCRIBE = SUBSCRIBE.asInstanceOf[js.Any], TRANSMIT = TRANSMIT.asInstanceOf[js.Any], allow = js.Any.fromFunction1(allow), block = js.Any.fromFunction1(block), promise = promise.asInstanceOf[js.Any], outcome = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AGAction]
    }
    
    extension [Self <: AGAction](x: Self) {
      
      inline def setAUTHENTICATE(value: /* "authenticate" */ String): Self = StObject.set(x, "AUTHENTICATE", value.asInstanceOf[js.Any])
      
      inline def setAllow(value: Any => Unit): Self = StObject.set(x, "allow", js.Any.fromFunction1(value))
      
      inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenExpiredError(value: AuthTokenExpiredError): Self = StObject.set(x, "authTokenExpiredError", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenExpiredErrorUndefined: Self = StObject.set(x, "authTokenExpiredError", js.undefined)
      
      inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      inline def setBlock(value: js.Error => Unit): Self = StObject.set(x, "block", js.Any.fromFunction1(value))
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHANDSHAKE_SC(value: /* "handshakeSC" */ String): Self = StObject.set(x, "HANDSHAKE_SC", value.asInstanceOf[js.Any])
      
      inline def setHANDSHAKE_WS(value: /* "handshakeWS" */ String): Self = StObject.set(x, "HANDSHAKE_WS", value.asInstanceOf[js.Any])
      
      inline def setINVOKE(value: /* "invoke" */ String): Self = StObject.set(x, "INVOKE", value.asInstanceOf[js.Any])
      
      inline def setMESSAGE(value: /* "message" */ String): Self = StObject.set(x, "MESSAGE", value.asInstanceOf[js.Any])
      
      inline def setOutcome(value: allowed | blocked): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setOutcomeNull: Self = StObject.set(x, "outcome", null)
      
      inline def setPUBLISH_IN(value: /* "publishIn" */ String): Self = StObject.set(x, "PUBLISH_IN", value.asInstanceOf[js.Any])
      
      inline def setPUBLISH_OUT(value: /* "publishOut" */ String): Self = StObject.set(x, "PUBLISH_OUT", value.asInstanceOf[js.Any])
      
      inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
      
      inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
      
      inline def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSUBSCRIBE(value: /* "subscribe" */ String): Self = StObject.set(x, "SUBSCRIBE", value.asInstanceOf[js.Any])
      
      inline def setSignedAuthToken(value: String): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
      
      inline def setSignedAuthTokenUndefined: Self = StObject.set(x, "signedAuthToken", js.undefined)
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTRANSMIT(value: /* "transmit" */ String): Self = StObject.set(x, "TRANSMIT", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "handshakeWS" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AGActionAuthenticate
    extends StObject
       with AGActionBase {
    
    var authToken: js.UndefOr[AuthToken] = js.native
    
    var signedAuthToken: js.UndefOr[String] = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "authenticate" */ String = js.native
  }
  
  @js.native
  trait AGActionBase extends StObject {
    
    val AUTHENTICATE: /* "authenticate" */ String = js.native
    
    val HANDSHAKE_SC: /* "handshakeSC" */ String = js.native
    
    val HANDSHAKE_WS: /* "handshakeWS" */ String = js.native
    
    val INVOKE: /* "invoke" */ String = js.native
    
    val MESSAGE: /* "message" */ String = js.native
    
    val PUBLISH_IN: /* "publishIn" */ String = js.native
    
    val PUBLISH_OUT: /* "publishOut" */ String = js.native
    
    val SUBSCRIBE: /* "subscribe" */ String = js.native
    
    val TRANSMIT: /* "transmit" */ String = js.native
    
    def allow(): Unit = js.native
    def allow(packet: Any): Unit = js.native
    
    def block(): Unit = js.native
    def block(error: js.Error): Unit = js.native
    
    var outcome: Null | allowed | blocked = js.native
    
    var promise: js.Promise[Any] = js.native
  }
  
  @js.native
  trait AGActionHandshakeSC
    extends StObject
       with AGActionBase {
    
    var request: IncomingMessage = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "handshakeSC" */ String = js.native
  }
  
  @js.native
  trait AGActionHandshakeWS
    extends StObject
       with AGActionBase {
    
    var `type`: /* "handshakeWS" */ String = js.native
  }
  
  @js.native
  trait AGActionInvoke
    extends StObject
       with AGActionBase {
    
    var authTokenExpiredError: js.UndefOr[AuthTokenExpiredError] = js.native
    
    var data: js.UndefOr[Any] = js.native
    
    var procedure: String = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "invoke" */ String = js.native
  }
  
  @js.native
  trait AGActionMessage
    extends StObject
       with AGActionBase {
    
    var data: Any = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "message" */ String = js.native
  }
  
  @js.native
  trait AGActionPublishIn
    extends StObject
       with AGActionBase {
    
    var authTokenExpiredError: js.UndefOr[AuthTokenExpiredError] = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Any] = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "publishIn" */ String = js.native
  }
  
  @js.native
  trait AGActionPublishOut
    extends StObject
       with AGActionBase {
    
    var channel: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Any] = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "publishOut" */ String = js.native
  }
  
  @js.native
  trait AGActionSubscribe
    extends StObject
       with AGActionBase {
    
    var authTokenExpiredError: js.UndefOr[AuthTokenExpiredError] = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Any] = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "subscribe" */ String = js.native
  }
  
  @js.native
  trait AGActionTransmit
    extends StObject
       with AGActionBase {
    
    var authTokenExpiredError: js.UndefOr[AuthTokenExpiredError] = js.native
    
    var data: js.UndefOr[Any] = js.native
    
    var receiver: String = js.native
    
    var socket: typings.socketclusterServer.serversocketMod.^ = js.native
    
    var `type`: /* "transmit" */ String = js.native
  }
}
