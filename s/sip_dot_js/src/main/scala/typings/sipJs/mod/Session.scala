package typings.sipJs.mod

import typings.sipJs.libApiSessionOptionsMod.SessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js", "Session")
@js.native
open class Session protected ()
  extends typings.sipJs.libApiMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  /* protected */ def this(userAgent: typings.sipJs.libApiUserAgentMod.UserAgent) = this()
  /* protected */ def this(userAgent: typings.sipJs.libApiUserAgentMod.UserAgent, options: SessionOptions) = this()
}
