package typings.sipDotJs

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libUAMod.UA
import typings.sipDotJs.libWebSimpleMod.SimpleStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/Simple", JSImport.Namespace)
@js.native
object libWebSimpleMod extends js.Object {
  @js.native
  class Simple protected () extends EventEmitter {
    def this(options: js.Any) = this()
    var anonymous: Boolean = js.native
    var audio: Boolean = js.native
    var checkRegistration: js.Any = js.native
    var cleanupMedia: js.Any = js.native
    var destroyMedia: js.Any = js.native
    var logger: Logger = js.native
    var onAccepted: js.Any = js.native
    var onEnded: js.Any = js.native
    var onFailed: js.Any = js.native
    var onProgress: js.Any = js.native
    var options: js.Any = js.native
    var session: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
    var setupLocalMedia: js.Any = js.native
    var setupRemoteMedia: js.Any = js.native
    var setupSession: js.Any = js.native
    var state: SimpleStatus = js.native
    var toggleMute: js.Any = js.native
    var ua: UA = js.native
    var video: Boolean = js.native
    def answer(): InviteServerContext | Unit = js.native
    def call(destination: String): InviteClientContext | InviteServerContext | Unit = js.native
    def hangup(): js.UndefOr[InviteClientContext | InviteServerContext] = js.native
    def hold(): InviteClientContext | InviteServerContext | Unit = js.native
    def message(destination: String, message: String): Unit = js.native
    def mute(): Unit = js.native
    def reject(): js.UndefOr[InviteServerContext] = js.native
    def sendDTMF(tone: String): Unit = js.native
    def unhold(): InviteClientContext | InviteServerContext | Unit = js.native
    def unmute(): Unit = js.native
  }
  
  @js.native
  sealed trait SimpleStatus extends js.Object
  
  /* static members */
  @js.native
  object Simple extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SimpleStatus */ js.Any = js.native
  }
  
  @js.native
  object SimpleStatus extends js.Object {
    @js.native
    sealed trait STATUS_COMPLETED extends SimpleStatus
    
    @js.native
    sealed trait STATUS_CONNECTED extends SimpleStatus
    
    @js.native
    sealed trait STATUS_CONNECTING extends SimpleStatus
    
    @js.native
    sealed trait STATUS_NEW extends SimpleStatus
    
    @js.native
    sealed trait STATUS_NULL extends SimpleStatus
    
    /* 4 */ val STATUS_COMPLETED: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_COMPLETED with Double = js.native
    /* 3 */ val STATUS_CONNECTED: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_CONNECTED with Double = js.native
    /* 2 */ val STATUS_CONNECTING: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_CONNECTING with Double = js.native
    /* 1 */ val STATUS_NEW: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_NEW with Double = js.native
    /* 0 */ val STATUS_NULL: typings.sipDotJs.libWebSimpleMod.SimpleStatus.STATUS_NULL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SimpleStatus with Double] = js.native
  }
  
}

