package typings.sipJs

import typings.sipJs.infoerInfoOptionsMod.InfoerInfoOptions
import typings.sipJs.infoerOptionsMod.InfoerOptions
import typings.sipJs.methodsInfoMod.OutgoingInfoRequest
import typings.sipJs.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/infoer", JSImport.Namespace)
@js.native
object infoerMod extends js.Object {
  @js.native
  class Infoer protected () extends js.Object {
    /**
      * Constructs a new instance of the `Infoer` class.
      * @param session - The session the INFO will be sent from. See {@link Session} for details.
      * @param options - An options bucket.
      */
    def this(session: Session) = this()
    def this(session: Session, options: InfoerOptions) = this()
    /** The Infoer session. */
    var _session: js.Any = js.native
    /** The logger. */
    var logger: js.Any = js.native
    /** The Infoer session. */
    val session: Session = js.native
    /**
      * Sends the INFO request.
      * @param options - {@link InfoerInfoOptions} options bucket.
      */
    def info(): js.Promise[OutgoingInfoRequest] = js.native
    def info(options: InfoerInfoOptions): js.Promise[OutgoingInfoRequest] = js.native
  }
  
}

