package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import typings.events.mod.EventEmitter
import typings.sipJs.coreMod.Logger
import typings.sipJs.libSessionMod.InviteClientContext
import typings.sipJs.libSessionMod.InviteServerContext
import typings.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/Simple", JSImport.Namespace)
@js.native
object simpleMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SimpleStatus with Double] = js.native
    /* 4 */ @js.native
    object STATUS_COMPLETED extends TopLevel[STATUS_COMPLETED with Double]
    
    /* 3 */ @js.native
    object STATUS_CONNECTED extends TopLevel[STATUS_CONNECTED with Double]
    
    /* 2 */ @js.native
    object STATUS_CONNECTING extends TopLevel[STATUS_CONNECTING with Double]
    
    /* 1 */ @js.native
    object STATUS_NEW extends TopLevel[STATUS_NEW with Double]
    
    /* 0 */ @js.native
    object STATUS_NULL extends TopLevel[STATUS_NULL with Double]
    
  }
  
}

