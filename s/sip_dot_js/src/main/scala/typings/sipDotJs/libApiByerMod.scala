package typings.sipDotJs

import typings.sipDotJs.libApiByerDashByeDashOptionsMod.ByerByeOptions
import typings.sipDotJs.libApiByerDashOptionsMod.ByerOptions
import typings.sipDotJs.libApiSessionMod.Session
import typings.sipDotJs.libCoreMessagesMethodsByeMod.OutgoingByeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/byer", JSImport.Namespace)
@js.native
object libApiByerMod extends js.Object {
  @js.native
  class Byer protected () extends js.Object {
    /**
      * Constructs a new instance of the `Byer` class.
      * @param session - The session the BYE will be sent from. See {@link Session} for details.
      * @param options - An options bucket. See {@link ByerOptions} for details.
      */
    def this(session: Session) = this()
    def this(session: Session, options: ByerOptions) = this()
    /** The byer session. */
    var _session: js.Any = js.native
    /** The logger. */
    var logger: js.Any = js.native
    /** The byer session. */
    val session: Session = js.native
    /**
      * Sends the BYE request.
      * @param options - {@link ByerByeOptions} options bucket.
      */
    def bye(): js.Promise[OutgoingByeRequest] = js.native
    def bye(options: ByerByeOptions): js.Promise[OutgoingByeRequest] = js.native
  }
  
}

