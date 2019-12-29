package typings.sipDotJs

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libEnumsMod.TypeStrings
import typings.sipDotJs.libReactSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.BodyObj
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React/SessionDescriptionHandler", JSImport.Namespace)
@js.native
object libReactSessionDescriptionHandlerMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends EventEmitter
       with typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
    var C: js.Any = js.native
    var CONTENT_TYPE: js.Any = js.native
    var WebRTC: js.Any = js.native
    var acquire: js.Any = js.native
    var addDefaultIceCheckingTimeout: js.Any = js.native
    var addDefaultIceServers: js.Any = js.native
    var checkAndDefaultConstraints: js.Any = js.native
    var constraints: js.Any = js.native
    var createOfferOrAnswer: js.Any = js.native
    var createRTCSessionDescriptionInit: js.Any = js.native
    var direction: js.Any = js.native
    var dtmfSender: js.Any = js.native
    var hasBrowserGetSenderSupport: js.Any = js.native
    var hasBrowserTrackSupport: js.Any = js.native
    var hasOffer: js.Any = js.native
    var iceGatheringDeferred: js.Any = js.native
    var iceGatheringTimeout: js.Any = js.native
    var iceGatheringTimer: js.Any = js.native
    var initPeerConnection: js.Any = js.native
    var isIceGatheringComplete: js.Any = js.native
    var logger: js.Any = js.native
    var modifiers: js.Any = js.native
    var observer: js.Any = js.native
    var options: js.Any = js.native
    var peerConnection: js.Any = js.native
    var resetIceGatheringComplete: js.Any = js.native
    var setDirection: js.Any = js.native
    var shouldAcquireMedia: js.Any = js.native
    var triggerIceGatheringComplete: js.Any = js.native
    var `type`: TypeStrings = js.native
    var waitForIceGatheringComplete: js.Any = js.native
    def getDescription(options: js.Any): js.Promise[BodyObj] = js.native
    def getDescription(options: js.Any, modifiers: SessionDescriptionHandlerModifiers): js.Promise[BodyObj] = js.native
    def getDirection(): String = js.native
    def setDescription(sessionDescription: String, options: js.Any): js.Promise[Unit] = js.native
    def setDescription(sessionDescription: String, options: js.Any, modifiers: SessionDescriptionHandlerModifiers): js.Promise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): SessionDescriptionHandler = js.native
  }
  
}

