package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Session")
@js.native
abstract class Session protected ()
  extends typings.sipDotJs.libSessionMod.Session {
  protected def this(sessionDescriptionHandlerFactory: SessionDescriptionHandlerFactory) = this()
}

/* static members */
@JSImport("sip.js", "Session")
@js.native
object Session extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SessionStatus */ js.Any = js.native
}

